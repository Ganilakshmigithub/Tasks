import java.util.List;
public class MaxandMinStream {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,5,1,3,56,21);
        int max=numbers.stream().max(Integer::compare).get();
        int min=numbers.stream().min(Integer::compare).get();
        System.out.println("Max number is "+max);
        System.out.println("min number is "+min);

                        
        
    }
}
