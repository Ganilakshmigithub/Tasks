import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,5,1,3,56,21);
        int max=numbers.size()-1; // loop starts from first element even we are using last element as max
        int min=numbers.get(0);
        for(int nums:numbers){
            if(nums>max){
                max=nums;
                System.out.println("max: "+max);
            }
            if(nums<min){
                min=nums;
                System.out.println("min: "+min);
        }
    }
}
}
