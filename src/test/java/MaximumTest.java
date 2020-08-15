import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //Test cases for Maximum Integer
    @Test
    public void givenMaxValue_atPos1_shouldReturn_maximumNumber() {
        Maximum maximum =new Maximum();
        int maximumNumber=maximum.testMaximumInteger(6,4,5);
        Assert.assertEquals(6,maximumNumber);
    }

    @Test
    public void givenMaxValue_atPos2_shouldReturn_maximumNumber() {
        Maximum maximum=new Maximum();
        int maximumNumber=maximum.testMaximumInteger(7,8,3);
        Assert.assertEquals(8,maximumNumber);
    }

    @Test
    public void givenMaxValue_atPos3_shouldReturn_maximumNumber() {
        Maximum maximum=new Maximum();
        int maximumNumber=maximum.testMaximumInteger(10,12,13);
        Assert.assertEquals(13,maximumNumber);
    }
}