import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class MergeArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1,21,21, 3, 5, 7, 9};
        int[] arr2 = {5, 21, 3, 45, 4, 6, 5};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int i : arr1) {
            if (!set.add(i)) {
                duplicate.add(i);
            }
        }
        for (int i : arr2) {
            if (!set.add(i)) {
                duplicate.add(i);
            }
        }
        TreeSet<Integer> tree = new TreeSet<>(set);
        System.out.println("Unique elements: " + tree);
        HashSet<Integer> finalist=new HashSet<>(duplicate);
        System.out.println("duplicates list without repetition: "+finalist);


    }
}
