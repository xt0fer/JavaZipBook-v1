package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.ulil.set;

/**
 *
 * @author Garrett
 */
public class ExerciseUtilSet {

    ExerciseUtilSet() {
    }

    public static void set() {

        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.size();

        Set<String> names = new HashSet<>();
        names.addAll("Kris", "Mike");

        Set<String> names = new HashSet<>();
        names.addAll("Kris", "Mike");
        names.remove("Mike");
        names.contains("Kris");

        Set<String> names = new HashSet<>();
        names.addAll("Kris", "Mike");
        names.remove("Mike");
        names.clear();

    }
}