import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummeraTalTest {
    @Test
    public void summera1till100(){
        assertEquals(5050, SummeraTal.summera(100));
    }

    @Test
    public void summera1till3(){
        assertEquals(6, SummeraTal.summera(3));
    }
}