# Object
## java.lang.Object

### Constructors
```Java
Set<E> // E - the type of elements maintained by this set


public interface Set<E>
extends Collection<E>

A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2)
, and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
```

### Popular Methods

```Java
boolean	add(E e) // Adds the specified element to this set if it is not already present (optional operation).

boolean addAll(Collection<? extends E> c) // Adds all of the elements in the specified collection to this set if they're not already present (optional operation).

void	clear() // Removes all of the elements from this set (optional operation).

boolean	contains(Object o) //Returns true if this set contains the specified element.

boolean	remove(Object o)// Removes the specified element from this set if it is present (optional operation).

int	size()//Returns the number of elements in this set (its cardinality).
```

See ExerciseUtilSet.java for more details.
