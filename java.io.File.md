# File
##java.io.File
###Constructor for File
````
1. File(File parent, String child)
Creates a new File instance from a parent abstract pathname and a child pathname string.
2. File(String pathname)
Creates a new File instance by converting the given pathname string into an abstract pathname.
````
####Popular Methods
````
canExecute()     // Tests whether the application can execute the file denoted by this abstract pathname.

canRead()       // Tests whether the application can read the file denoted by this abstract pathname.

canWrite()     // Tests whether the application can modify the file denoted by this abstract pathname.

setReadOnly() // Marks the file or directory named by this abstract pathname so that only read operations are allowed.

delete()     // Deletes the file or directory denoted by this abstract pathname.
````
