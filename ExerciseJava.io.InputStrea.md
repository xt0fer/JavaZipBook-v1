# Java Zip Book (version 1)

Add popular Java class notes to this for use by ZipCoders.

## Object (Java.io.InputStream)

see [ExerciseJava.io.InputStream.md](https://github.com/xt0fer/JavaZipBook-v1/blob/master/java.lang.Object.md)

int	available()
Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking by the next invocation of a method for this input stream.

void	close()
Closes this input stream and releases any system resources associated with the stream.

void	mark(int readlimit)
Marks the current position in this input stream.

boolean	markSupported()
Tests if this input stream supports the mark and reset methods.

abstract int	read()
Reads the next byte of data from the input stream.

int	read(byte[] b)
Reads some number of bytes from the input stream and stores them into the buffer array b.

int	read(byte[] b, int off, int len)
Reads up to len bytes of data from the input stream into an array of bytes.

void	reset()
Repositions this stream to the position at the time the mark method was last called on this input stream.

long	skip(long n)
Skips over and discards n bytes of data from this input stream.