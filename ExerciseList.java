package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

/**
 *
 * @author Kieran Thomas aka SupaGramma aka TheLid aka RNGeezus aka YeahIdidit aka MimiFiend
 */
public class ExerciseList {

    ExerciseList() {

    public static void exercise() {
        List<Movie> comedyList = new ArrayList<Movie>();   //Creating list for movies (comedy being my type to let me know that all the movies in this list are of this genre
        List<Movie> actionList = new ArrayList<Movie>();  //Creating list for movies (action being my type to let me know that all the movies in this list are of this genre
        class Movie {
            int rentId;
            String name,genre;
            int quantity,year
            public Movie(int rentId, String name, String genre, int year, int quantity) {
                this.rentId = rentId;
                this.name = name;
                this.genre = genre;
                this.year = year;
                this.quantity = quantity;
            }
        }
        public class MovieList {
            public static void main(String[] args) {
//Creating list of Books
                List<Movie> rentaList = new ArrayList<Movie>();
//Creating Movie
                Movie m1=new Movie(787,"Friday The 13th","Horror","1993",13);
                Movie m2=new Movie(201,"Black Panther","Action","2018",112);
                Movie m3=new Movie(180,"Bruce Almighty","Comedy","2007",3);
//Adding Movies to list
                actionList.add(m1);
                actionList.add(m2);
                actioinList.add(m3);
//Traversing list
                for(Movie m : rentaList){
                    System.out.println(m.id + " " + m.name + " " + m.genre + " " + m.year + " " + m.quantity);
                }
            }
        }
        //Useful methods
           /**
            oid add(int index,Object element) 	It is used to insert element into the invoking list at the index passed in the index.
            boolean addAll(int index,Collection c) 	It is used to insert all elements of c into the invoking list at the index passed in the index.
            object get(int index) 	It is used to return the object stored at the specified index within the invoking collection.
            object set(int index,Object element) 	It is used to assign element to the location specified by index within the invoking list.
            object remove(int index) 	It is used to remove the element at position index from the invoking list and return the deleted element.
            ListIterator listIterator() 	It is used to return an iterator to the start of the invoking list.
            ListIterator listIterator(int index) 	It is used to return an iterator to the invoking list that begins at the specified index.
            */