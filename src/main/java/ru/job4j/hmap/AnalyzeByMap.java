package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        int number = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                number++;
            }
        }
        return rsl / number;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        double rsl = 0;
        int number = 0;
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                number++;
            }
            list.add(new Label(pupil.name(), rsl / number));
            rsl = 0;
            number = 0;
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> list = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = list.getOrDefault(subject.name(), 0) + subject.score();
                list.put(subject.name(), score);
            }
        }
        List<Label> object = new ArrayList<>();
        for (Map.Entry<String, Integer> name : list.entrySet()) {
            object.add(new Label(name.getKey(), name.getValue() / pupils.size()));
        }
        return object;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        SortedSet<Label> list = new TreeSet<>();
        for (Pupil pupil : pupils) {
            int rsl = 0;
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
            }
            list.add(new Label(pupil.name(), rsl));
        }
        return list.last();
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> list = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = list.getOrDefault(subject.name(), 0) + subject.score();
                list.put(subject.name(), score);
            }
        }
        SortedSet<Label> object = new TreeSet<>();
        for (Map.Entry<String, Integer> name : list.entrySet()) {
            object.add(new Label(name.getKey(), name.getValue()));
        }
        return object.last();
    }
}
