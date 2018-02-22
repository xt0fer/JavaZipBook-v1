# HashMap
## java.util.HashMap

HashMap is a Map based collection class that is used for storing Key & value pairs, it is denoted as HashMap<Key, Value> or HashMap<K, V>. 
This class makes no guarantees as to the order of the map. It is similar to the Hashtable class except that it is unsynchronized and permits nulls(null values and null key).

It is not an ordered collection which means it does not return the keys and values in the same order in which they have been inserted into the HashMap. 
It does not sort the stored keys and Values. You must need to import java.util.HashMap or its super class in order to use the HashMap class and methods.

### Constructors
```Java
HashMap() // Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
```

### Popular Methods

```Java
void put(K key, V value) // Associates the specified value with the specified key in this map.

boolean putIfAbsent(K key, V value) // If a specified key value not associated with a value(or value is null), this medhos associates it with the g

boolean isEmpty() // Returns true if this map contains no key-value mappings

boolean containsKey(Object key) // Returns true if this map conains a mapping for the specified key

boolean containsValue (Object value) // Returns true if this map maps one or more keys to the specified value

void clear() // Removes all the mappings from this map

```

See ExerciseObject.java for more details.
