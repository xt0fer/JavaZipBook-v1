# URL
## java.net.URL

Class URL represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web. A resource can be something as simple as a file or a directory, or it can be a reference to a more complicated object, such as a query to a database or to a search engine. More information on the types of URLs and their formats can be found at: Types of URL

### Constructors
```Java
URL(String spec)
Creates a URL object from the String representation.

URL(String protocol, String host, int port, String file)
Creates a URL object from the specified protocol, host, port number, and file.

URL(String protocol, String host, int port, String file, URLStreamHandler handler)
Creates a URL object from the specified protocol, host, port number, file, and handler.

URL(String protocol, String host, String file)
Creates a URL from the specified protocol name, host name, and file name.

URL(URL context, String spec)
Creates a URL by parsing the given spec within a specified context.

URL(URL context, String spec, URLStreamHandler handler)
Creates a URL by parsing the given spec with the specified handler within a specified context.
```

### Popular Methods

```Java
String  getFile() // Gets the name o this URL.

String  getPath() //  Gets the path part of the URL.

String  getRef() //   Gets the anchor / reference of the URL.

String  toString() // Returns a string representation of this URL.
```

See ExerciseURL.java for more details.