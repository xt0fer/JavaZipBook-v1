package com.zipcodewilmington.javabook1;

import java.util.Calendar;


public class ExerciseCalendar {

    ExerciseCalendar(){

    }

    public static void main(String[] args){

        //amy's code is here:

        Calendar now = Calendar.getInstance();
        System.out.println(now);


    }

    public Map<String,Integer> getDisplayNames(int field,
                                               int style,
                                               Locale locale)

    public boolean before(Object when)

    //Returns whether this Calendar represents a time before the time represented by the specified Object.
    // This method is equivalent to:

    compareTo(when) < 0;

    //talk about after! :)


    public static void excercise(){
        Calendar cal1 = new Calendar();
        Calendar cal2 = new Calendar();

        print(cal1.equals(cal1)); //this is true
        print(obj2.equals(cal2)); //this is NOT true and it DOESNT matter what you put in the objects


        print(cal1.getClass().getName());//prints the class cal1 comes from

        print(cal1.toString());

    }


    public static void print(Calendar... calendars){
        for (Calendar element: calendars){
            System.out.println(element);
        }
    }

}