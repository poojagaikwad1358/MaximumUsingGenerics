import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //Test cases for Maximum Integer
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int)maximum.testMaximumValue(6, 4, 5, 3);
        Assert.assertEquals(6, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int)maximum.testMaximumValue(6, 4, 5, 3);
        Assert.assertEquals(6, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int)maximum.testMaximumValue(6, 4, 5, 3);
        Assert.assertEquals(6, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int)maximum.testMaximumValue(6, 4, 5, 3);
        Assert.assertEquals(6, maximumNumber);
    }

    //Test cases for maximum float
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    //Test cases for String
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Banana", "Mango", "Peach");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Banana", "Mango", "Peach");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Banana", "Mango", "Peach");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Banana", "Mango", "Peach");
        Assert.assertEquals("Peach", maximumString);
    }
}