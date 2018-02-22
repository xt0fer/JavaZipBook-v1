ackage com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danzcw
 */
public class ExerciseURL {

    ExerciseURL() {
    }

    public static void excercise() {
        URL u = new URL("http://www.zipcodewilmington.com/");
        System.out.println("The URL is " + u);
        System.out.println("The file part is " + u.getFile());
        System.out.println("The reference of this URLis " + u.getRef());
        System.out.println("The String representation of this website is " + u.toString());




    }


}



