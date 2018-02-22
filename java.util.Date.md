##Date
#### java.util.Date

###Constructors
````Java
Date() // represents a specific instant in time, with millisecond precision.
```` 

### Popular Methods

````Java
boolean after(Date when) // Tests if current date is after the given date.

int compareTo(Date when) //Compares current date with given date.

boolean before(Date when) //Tests if current date is before the given date.

void setTime() //Sets this Date object to represent a point in time that is time milliseconds after January 1, 1970 00:00:00 GMT.

long getTime() //Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.


See ExerciseDate.java for more details.
