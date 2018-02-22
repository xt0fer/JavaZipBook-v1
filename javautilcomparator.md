# Comparator
## java.lang.Comparator

### Constructors
```Java
public int compare(Object obj1, Object obj2) // creates a comparator for objects.
```

### Popular Methods

```Java
Comparator<? super E> comparator, Iterable<? extends E> elements)

return new Comparator<Object[]>() {
    
}
for (Comparator<byte[]> comparator : Arrays.asList(



//     defines two methods, compare() and equals().
// Compare Method:
//  obj1 and obj2 are the objects to be compared. This method returns zero if the objects are equal.
//  It returns a positive value if obj1 is greater than obj2. Otherwise, a negative value is returned.

// Equals Method:
//  The equals( ) method, below, tests whether an object equals the invoking comparator −
//      boolean equals(Object obj)
//  obj is the object to be tested for equality. The method returns true if obj and the invoking object
//  are both Comparator objects and use the same ordering. Otherwise, it returns false.

```

See ExerciseComparator.java for more details.
