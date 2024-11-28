import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;
//using IntStream
public class MergeArray {
    public static void main(String[] args) {
    int array1[]={10,23,2,45,11,2,34,56,1,3};
    int array2[]={3,21,1,45,23,2,67,22,89,13};
    /*1.merging two arrays
     * 2.sorting the merged array
     * 3.removing the duplicates
     */
    HashSet<Integer> unique=new HashSet<>();
    List<Integer> duplicate=new ArrayList<>();
    IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).forEach(num->{
        if(!unique.add(num)){
            duplicate.add(num);
        }
    });
    int mergedArray[]=IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().distinct().toArray();
    System.out.println(Arrays.toString(mergedArray));
    System.out.println(duplicate);

}
}