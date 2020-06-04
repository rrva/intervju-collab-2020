package numberseries;

import org.junit.Assert;
import org.junit.Test;

public class NumberSerie {

    @Test
    public void sum_1_3() {
        Assert.assertEquals(6, Main.getSum(1, 3));
    }

}