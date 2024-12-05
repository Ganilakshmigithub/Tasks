import java.util.*;
//using for loop to iterate over the array
public class DupList2{
    public static void main(String[] args) {
        List<Integer> l1=List.of(11,35,23,8,13,56,14);
        List<Integer>l2=List.of(2,11,13,77,45,88,11);
        HashSet<Integer> dup=new HashSet<>();
        for(int i:l1){
            for(int j:l2){
                if(i==j){
                    dup.add(i);
        }

    }
}
System.out.println(dup);

    }
}