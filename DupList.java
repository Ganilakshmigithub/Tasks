import java.util.HashSet;
import java.util.List;
//using Hashset 
public class DupList {
    public static void main(String[] args) {
        List<Integer> list1=List.of(12,13,2,5,6,1,3);
        List<Integer> list2=List.of(23,1,12,13,4,56,23);
        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();
        for(int num:list1){
            if(!unique.add(num)){
                dup.add(num);
        }
    }
        for(int num:list2){
            if(!unique.add(num)){
                dup.add(num);
            }
        }

    
    System.out.println("unique elements are:" +unique);
    System.out.println("duplicate elements are: "+dup);

    }
}
