import java.util.stream.Collectors;
import java.util.Map;
//streams
public class CharacterCounter {
    public static void main(String[] args) {
        String str = "ganilakshmi";
        Map<Object, Long> charCount = str.chars()
                .mapToObj(c->(char)c) //converting int to char
                .collect(Collectors.groupingBy(c ->c, Collectors.counting())); //map with character as key and count as value
        charCount.forEach((k, v) -> System.out.println("Character: " + k + " Count: " + v));
    }
}