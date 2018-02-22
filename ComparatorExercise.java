package com.zipcodewilmington.javazipbook1;
/**
 * Gio
 */
// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student
{
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

// Driver class
class Main
{
    public static void main (String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}


OUTPUT:
        Unsorted
        111 bbbb london
        131 aaaa nyc
        121 cccc jaipur

        Sorted by rollno
        111 bbbb london
        121 cccc jaipur
        131 aaaa nyc

        Sorted by name
        131 aaaa nyc
        111 bbbb london
        121 cccc jaipu


//     defines two methods, compare() and equals().
// Compare Method:
//  obj1 and obj2 are the objects to be compared. This method returns zero if the objects are equal.
//  It returns a positive value if obj1 is greater than obj2. Otherwise, a negative value is returned.

// Equals Method:
//  The equals( ) method, below, tests whether an object equals the invoking comparator −
//      boolean equals(Object obj)
//  obj is the object to be tested for equality. The method returns true if obj and the invoking object
//  are both Comparator objects and use the same ordering. Otherwise, it returns false.