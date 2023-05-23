package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы.
 */

public class BankService {
    /**
     * Коллекция типа Map, которая содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * @param user новый пользователь банка
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из системы.
     * @param passport номер паспорта пользователя, по которому происходит удаление
     * @return возвращает результат работы метода( удален пользователь или нет)
     */

    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый счет пользователю.
     * @param passport номер паспорта пользователя
     * @param account новый счет пользователя
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по паспорту.
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя или null, если он не найден.
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> passport.equals(user.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод для поиска пользователя по реквизитам счета.
     * @param passport номер паспорта пользователя для его поиска
     * @param requisite  номер счета пользователя
     * @return возвращает пользователя, если у него есть искомый счет, если нет - null
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счета на другой
     * @param srcPassport номер паспорта клиента, который переводит средства
     * @param srcRequisite номер счета, с которого переводятся средства
     * @param destPassport норме паспорта клиента, которому переводятся средства
     * @param destRequisite номер счета, на который переводятся средства
     * @param amount сумма перевода
     * @return возвращает результат работы метода (осуществлен перевод или нет)
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src == null || src.getBalance() < amount || dest == null) {
            return false;
        }
        src.setBalance(src.getBalance() - amount);
        dest.setBalance(dest.getBalance() + amount);
        return true;
    }

    /**
     * Метод для получения списка счетов клиента
     * @param user интересующий клиент
     * @return возвращает список счетов этого клиента
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}