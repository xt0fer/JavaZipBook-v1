package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bolee
 */
public class ExerciseHashMap {

    ExerciseHashMap() {
    }

    public static void exercise() {
        /* How to declare a HashMap*/
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String> ();
        //myHashMap (a variable name of my choice) contains an integer in KEY and a string in the VALUE


        /*Adding elements to HashMap
        * put(K key, V value) or in our case put(Integer, String)*/
    public void addElementsToHashMap() {
            myHashMap.put(0, "Red");
            myHashMap.put(1, "Orange");
            myHashMap.put(2, "Yellow");
            myHashMap.put(3, "Green");
            myHashMap.put(4, "Blue");
            myHashMap.put(6, "Indigo");
            myHashMap.put(10, "Violet");

        }

        /* putIfAbsent(K key, V value)*/
        public boolean putIfAbsent(K key, V value{
            myHashMap.putIfAbsent(5, "Purple");
            //adds my key:5 and value: Purple to myHashMap
        }

        /*check to see if myHashMap is empty */
        public boolean isMyHashMapEmpty() {
            myHashMap.isEmpty();
            //returns false
        }

        /*checks to see if myHashMap contains a particular key*/
        public boolean containsKey(Object key) {
            myHashMap.containsKey(4);
            //returns true
        }

        /*checks to see if myHashMap contains a particular value*/
        public boolean containsValue (Object value) {
            myHashMap.containsValue ("Violet");
            //returns true
        }

        /*removes all the elements in myHashMap*/
        public void clear() {
            myHashMap.clear();
            //myHashMap is now empty
        }


    }
