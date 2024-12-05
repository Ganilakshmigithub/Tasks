import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//hashset
public class DupStr1 {
    public static void main(String[] args) {
        String word="ganilakshmi";
        int count=0;
        HashSet<Character> unique=new HashSet<>();
        List<Character> duplicates=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(!unique.add(word.charAt(i))){  //if unqiuelist already contain then remaining will add into duplicates list
                duplicates.add(word.charAt(i));
                count++;
        }
    }
    System.out.println("duplicates found in string are: "+duplicates);
    System.out.println("and total duplicates found are: "+count);

}
}
