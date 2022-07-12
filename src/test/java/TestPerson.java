import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        String expectedName = "Steven";
        long expectedId = 0;
        Person person = new Person(expectedId, expectedName);

        // When
        String actualName = person.getName();
        long actualId = person.getId();


        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetName() {

    }

}
