package com.zipcodewilmington.javazipbook1;

import Java.io.InputStream


/**
 *
 * @author Peteyocre
 */
public class ExerciseInputStream {

    ExerciseInputStream() {
    public abstract int read() throws IOException{}

    public static void main(String[] args){
        try {
            System.out.println("Available bytes :"+System.in.available());
            System.out.print("Write something :");
            int b = System.in.read();
            System.out.println("Available bytes :"+System.in.available());
            System.out.println("Input was :"+b);
        } catch (IOException e) {
            e.printStackTrace();z
        }
    }

    public public void close() throws IOException{
    }
    }


    public long skip(long n) throws IOException {

    }

    public class CopyBytes {
        public static void main(String[] args) throws IOException {

            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream("Pachimari.txt");
                out = new FileOutputStream("OutputFileFromRead.txt");
                int c;

                while ((c = in.read()) != -1) {
                    out.write(c);
                    }
                } finally {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                }
            }
        }
        inputStream = new BufferedReader(new FileReader("Pachimari.txt"));
    // This will read xanadu.txt from memory buffer and is not read by the OS

        //Below is an example of the subclass AudioInputStream

        public AudioInputStream(InputStream audioStreamFile, AudioFormat format, long length)

}
