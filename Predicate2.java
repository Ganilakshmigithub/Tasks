import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> num = n -> n % 2 == 0;
        List<Integer> list = List.of(34, 12, 56, 78, 23, 67, 89);
        for (Integer number : list) {
            if (num.test(number)) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
