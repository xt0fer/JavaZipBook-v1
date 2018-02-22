package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristofer
 */
public class ExerciseIterator {

    ExerciseIterator() {
    }

    public static void exercise() {
        ArrayList names = new ArrayList();
        names.add("April");
        names.add("May");
        names.ass("June");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            Object element = (Object).it.next();
            System.out.println(element);
        }
        String toBeRemoved = "May";
        while(it.hasNext()){
            if(toBeRemoved.equals(it.next())){
                it.remove();
                System.out.println(names);
            }
        }

        while(it.hasPrevious){
            System.out.println(it.previous());
    }
        it.set("End");

}