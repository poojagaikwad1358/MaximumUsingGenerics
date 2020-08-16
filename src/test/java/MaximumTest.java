import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //Test cases for Maximum Integer
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumNumber() {
        Maximum maximum =new Maximum();
        int maximumNumber=maximum.testMaximumInteger(6,4,5);
        Assert.assertEquals(6, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumNumber() {
        Maximum maximum=new Maximum();
        int maximumNumber=maximum.testMaximumInteger(7,8,3);
        Assert.assertEquals(8, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumNumber() {
        Maximum maximum=new Maximum();
        int maximumNumber=maximum.testMaximumInteger(10,12,13);
        Assert.assertEquals(13, maximumNumber);
    }

    //Test cases for maximum float
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumFloat() {
        Maximum maximum =new Maximum();
        Comparable maximumFloat=maximum.testMaximumFloat(6.1f, 4.2f, 5.3f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumFloat() {
        Maximum maximum=new Maximum();
        Comparable maximumFloat=maximum.testMaximumFloat(7.1f,8.2f,3.3f);
        Assert.assertEquals(8.2f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumFloat() {
        Maximum maximum=new Maximum();
        Comparable maximumFloat=maximum.testMaximumFloat(10.1f,12.2f,13.4f);
        Assert.assertEquals(13.4f, maximumFloat);
    }
}