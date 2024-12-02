import java.util.Arrays;
import java.util.Collections;
import java.util.List; 
//ArrayList

public class ListOfStr2 {
    public static void main(String[] args) {
        List<String> strings=Arrays.asList("watermelon","apple","pineapple","grape");
        Collections.sort(strings,(a,b)->Integer.compare(a.length(), b.length()));
        System.out.println(strings);
    }

}
