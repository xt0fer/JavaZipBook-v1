package com.zipcodewilmington.javabook1;

public class ExerciseCalendar {
    public static void main(String[] args){

    }

    ExerciseCalendar(){

    }

    public static void excercise(){
        Calendar cal1 = new Calendar();
        Calendar cal2 = new Calendar();

        print(cal1.equals(cal1)); //this is true
        print(obj2.equals(cal2)); //this is NOT true and it DOESNT matter what you put in the objects

        try {
            //write some stuff you'd use with a calendar
        } catch{
            //you need to google wtf catch means
        }

        print(cal1.getClass().getName());//prints the class cal1 comes from

        print(cal1.toString());

    }

    public static void print(Calendar... calendars){
        for (Calendar element: calendars){
            System.out.println(element);
        }
    }

}