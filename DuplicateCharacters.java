import java.util.stream.Collectors;
//hasmap

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "ganilakshmi";

        String duplicates = str.chars() //convert string to stream of characters ascii
                .mapToObj(c -> (char) c) //convert int to char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())) //creates map of character and its frequency..character(key)
                .entrySet().stream()  //creates stream
                .filter(e -> e.getValue() > 1) //extracts count of character greater than 1
                .map(e -> e.getKey().toString()) //converts entry to string
                .collect(Collectors.joining()); //combines into string

        System.out.println("Duplicate characters: " + duplicates);
    }
}