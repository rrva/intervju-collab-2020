import java.util.stream.IntStream;

public class SumNumber {
    public static int sum(int from, int to) {
        return IntStream.rangeClosed(from,to).sum();
    }
}
