#Iterator
## java.util.Iterator


###Constructors
```Java
Iterator<E> //creates an e generic iterator
```

###Popular Methods

```Java
public boolean hasNext() //Returns true if the iteration has more elements

public E next() //Return the next element in the iteration

public void remove() //Removes from the underlying collection the last element returned by this iterator

public void add(E e) //Inserts the specified element into the list

public E previous() //Returns true if this list iterator has more elements when traversing the list in the reverse direction

public void set(E e) //Replaces the last element returned by next() or previous() with the specified element
```

See ExerciseIterator.java for more details.