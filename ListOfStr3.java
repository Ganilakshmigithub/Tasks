import java.util.Arrays;
import java.util.Comparator;
//streams

public class ListOfStr3 {
    public static void main(String[] args) {
        String[] str = {"watermelon", "banana", "grapes", "date", "apple"};
        String[] sa=Arrays.stream(str).sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);
        System.out.println(Arrays.toString(sa));
    }
}
