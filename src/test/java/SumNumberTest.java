import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumNumberTest {

    @Test
    public void sumOf0to1(){
        assertEquals(1, SumNumber.sum(0,1));
    }
    @Test
    public void sumOf1to100(){
        assertEquals(5050, SumNumber.sum(1,100));
    }
}
