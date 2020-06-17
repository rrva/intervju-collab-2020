import java.util.stream.IntStream;

public class SummeraTal {
    public static void main(String[] args){
        System.out.println(summera(100));
    }

    public static int summera(int endInclusive) {
        return IntStream.rangeClosed(1, endInclusive).sum();
    }
}
