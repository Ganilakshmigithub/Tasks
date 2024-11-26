import java.util.Collections;
import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(45,2,11,8,4,56);
        int max=Collections.max(numbers);
        int min=Collections.min(numbers);
        System.out.println("maximum element is: "+max);
        System.out.println("minimum element is: "+min);
}
}
