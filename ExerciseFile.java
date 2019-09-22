package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristofer
 */
public class ExerciseFile {

    ExerciseFile() {
    }

    public static void exercise() {
        //create new file
        File fileOne = new File();
        File file2 = new File();

        //constructor examples
        File folder = new File(workDir, "folder");
        File subFolder = new File(folder, "folder");
        File file1 = new File(subFolder, "file2");

        //create a temp file
        String toWrite = "Hello";
        File tmpFile = File.createTempFile("test", ".tmp");
        FileWriter writer = new FileWriter(tmpFile);
        writer.write(toWrite);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(tmpFile));
        assertEquals(toWrite, reader.readLine());
        reader.close();

        //other methods
        file1.canExecute(file2);  //boolean

        file2.canRead(file1);     //boolean

        file2.equals(file2);      //boolean

        setReadOnly(file1);

        delete(file2);

        file1.write()

}
}
//        print(obj1.equals(obj1)); // true
//        print(obj1.equals(obj2)); // false

//        try {
//            Object obj3 = obj1.clone();
//            print(obj3.equals(obj1)); // true
//        } catch (CloneNotSupportedException ex) {
//            Logger.getLogger(ExerciseObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        print(obj1.getClass().getName()); //Object
//
//        print(obj1.hashCode(), obj2.hashCode());
//
//        print(obj1.toString());
//    }
//
//    public static void print(Object... things) {
//        for (Object o : things) {
//            System.out.print(o);
//        }
//        System.out.println();

