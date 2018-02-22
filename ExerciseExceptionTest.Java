import org.junit.Test;

//I I wrote a test for my own personal practice
public class ExerciseExceptionTest
{
    private ExerciseException exerciseExceptionsTest;

    @Before
    public void setup(){
        this.exerciseExceptionsTest = new ExerciseException();}

    @Test
    public void goOutOfBoundsForNamesTest1()
    {
        String [] expected = {"Garrett", "Peter", "Keith", "Katrina" "Kieran", "Amy", "Gio", "April", "Bo", "Katrice", "Dan", "Jess", "Ahson"};
        String [] actual = exerciseExceptionsTest.goOutOfBoundsForNames(expected);
        Assert.assertEquals(expected, actual);
    }


}