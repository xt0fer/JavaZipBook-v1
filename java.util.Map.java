ackage com.zipcodewilmington.javazipbook1;

import java.util.logging.level;
import java.util.logging.logger;
import java.util.map;
/*

 ***Created by Jess *** :)

 */


public class Map {

    public Map() {

    }

    public boolean containsKeyExample() {
        // creating a new Map
        Map<int, String> example = new Map<int, String>();

        // populate Map below
        example.put(1, "Ice Cream");
        example.put(2, "Pizza");
        example.put(3, "Dog");

        // check existence of key 2
        System.out.println("Check if key 2 exists: " + newmap.containsKey(2));

        //Output: Check if key 2 exists: true

    }

    public boolean containsValue() {
        // creating a new Map
        Map<int, String> example = new Map<int, String>();

        // populate Map below
        example.put(1, "Pink");
        example.put(2, "Rainbow");
        example.put(3, "Diamond");

        // check existence of value Rainbow
        System.out.println("Check if value Rainbow exists: " + newmap.containsValue("Rainbow"));

        //Output: Check if Rainbow exists: true
    }

    public Map remove() {
        // creating a new Map
        Map<String, String> example = new Map<String, String>();

        // create new ArrayList to store the key/value pairs until you can remove them
        List keysToRemove = new ArrayList<>();

        // iterate through key/value pairs using Map.Entry and Map.entrySet
        for (Map.Entry entry : map.entrySet()) {
            String value = entry.getValue();
            if (testIfShouldBeRemoved(value)) {
                keysToRemove.add(entry.getKey());
            }
        }

        // now do remove
        for (K key : keysToRemove) {
            map.remove(key);
        }
    }

}

    public Map clear() {
        // Create new Map
        Map<String, String> map = new Map<String, String>();

        //Populate new map
        map.put("Beyonce", "Jay-Z");
        map.put("Chrissy Teigan", "John Legend");
        map.put("David Beckham", "Victoria Beckham");

        //clears all contents of a map
        map.clear();

        System.out.println(map);
        //Output will return as: {}
    }


    public Map keySet() {
        // create hash map
        HashMap newmap = new HashMap();

        // populate hash map
        newmap.put(1, "Jess");
        newmap.put(2, "Cam");
        newmap.put(3, "is best");

        // get keyset value from map
        Set keyset = newmap.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);

        //Output: Key set values are: [1, 2, 3]
    }

}

