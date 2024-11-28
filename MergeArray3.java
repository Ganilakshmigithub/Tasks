import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
// using HashSet to remove duplicates and sort the list
public class MergeArray3 {

    public static void main(String[] args) {
        int[] arr1 = {1,2, 3, 5, 7, 9,22,12};
        int[] arr2 = {2, 4,9, 8, 10,32,12};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicate=new ArrayList<>();
        for(int i : arr1) {
            if(!set.add(i)){
                duplicate.add(i);
            }
            }
            for(int i : arr2) {
                if(!set.add(i)){
                    duplicate.add(i);
                }
            }
                List<Integer> list=new ArrayList<>(set);
                Collections.sort(list);
                System.out.println(list);
                System.out.println(duplicate);
    }
}
