package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristofer
 */
public class ExerciseObject {

    ExerciseObject() {
    }

    public static void exercise() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        print(obj1.equals(obj1)); // true
        print(obj1.equals(obj2)); // false
        
        try {
            Object obj3 = obj1.clone();
            print(obj3.equals(obj1)); // true
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ExerciseObject.class.getName()).log(Level.SEVERE, null, ex);
        }

        print(obj1.getClass().getName()); //Object
        
        print(obj1.hashCode(), obj2.hashCode());
        
        print(obj1.toString());
    }

    public static void print(Object... things) {
        for (Object o : things) {
            System.out.print(o);
        }
        System.out.println();
    }
}
package com.zipcodewilmington.javazipbook1;

        import java.util.logging.level;
        import java.util.logging.logger;
/*

 ***Created by Jess *** :)

 */


public class Map {

    public Map (){

    }
    public boolean containsKeyExample (objectKey){
        Map example = new Map();

// populate Map

        example.put("Ice Cream");
        example.put("Pizza");
        example.put("Dog");

    }
    public Map containsValue (){

    }
    public Map remove (){

    }
    public Map clear (){

    }
    public Map get (){

    }
    public Map keySet (){

    }
}
