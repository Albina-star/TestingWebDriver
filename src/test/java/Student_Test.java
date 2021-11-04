import org.testng.Assert;
import org.testng.annotations.Test;

public class Student_Test {

    @Test
    public void testName() {
        String testParamOne = "Alex";
        String testParamTwo = "Barabash";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();
        studentOne.graduate();

        boolean isNameCorrect = studentOne.name.contentEquals("ALex");
        
        Assert.assertEquals(studentOne.name, "Alex");
    }

}
