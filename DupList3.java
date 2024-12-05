import java.util.*;
public class DupList3 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7);
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> dup = new ArrayList<>();
        for (int i : mergedList) {
            if (!uniqueSet.add(i)) { // If the element is already in the set, it's a duplicate
                dup.add(i);
            }
        }
        List<Integer> resultList = new ArrayList<>(uniqueSet);
        System.out.println("Unique List (Result): " + resultList);
        System.out.println("Duplicates are: " + dup);
    }
}