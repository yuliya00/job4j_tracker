package ru.job4j.early;

import java.lang.Character;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (!(password.length() > 8 && password.length() < 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int notLetterOrDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if (Character.isUpperCase(x)) {
                upperCase++;
            }
            if (Character.isLowerCase(x)) {
                lowerCase++;
            }
            if (Character.isDigit(x)) {
                digit++;
            }
            if (!Character.isLetterOrDigit(x)) {
                notLetterOrDigit++;
            }
            if (upperCase > 0 && lowerCase > 0 && digit > 0 && notLetterOrDigit > 0) {
                break;
            }
        }

        if (upperCase == 0) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (lowerCase == 0) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (digit == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (notLetterOrDigit == 0) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        int x = 0;
        if (x == 0) {
            if (password.toLowerCase().contains("qwerty")) {
                x++;
            }
            if (password.toLowerCase().contains("12345")) {
                x++;
            }
            if (password.toLowerCase().contains("password")) {
                x++;
            }
            if (password.toLowerCase().contains("admin")) {
                x++;
            }
            if (password.toLowerCase().contains("user")) {
                x++;
            }
        }
        if (x > 0) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
