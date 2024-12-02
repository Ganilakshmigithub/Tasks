import java.util.Arrays;
import java.util.Comparator;
//Arrays

public class ListOfStr1{
    public static void main(String[] args) {
        String[] strings={"apple","banana","pineapple","watermelon","guvava"};
        Arrays.sort(strings,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strings));
    }

}
