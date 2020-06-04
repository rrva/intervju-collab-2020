package numberseries;

import java.util.stream.IntStream;

public class Main{

    public static void main(String[] args) {
        System.out.println(getSum(1, 50));
    }

    public static int getSum(int startInclusive, int endInclusive) {
        if(startInclusive < endInclusive)
            return IntStream.range(startInclusive, endInclusive + 1).sum();
        return 0;
    }
}