import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student s = new Student(123, "Linda", 80);
        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student s = new Student(98, "Linda", 20);
        Assert.assertTrue(s instanceof Person);
    }
    // Create a testLearn method that ensures a Student's totalStudyTime
    // instance variable is incremented by the specified numberOfHours by invoking
    // the .learn method.
    @Test
    public void testLearn() {
        Student s = new Student(123, "Linda", 20);
        Double expected = 40.0;
        s.learn(20);

        Double actual = s.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
