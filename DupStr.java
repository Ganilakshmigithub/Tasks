import java.util.ArrayList;
import java.util.List;
//for loop

public class DupStr{
    public static void main(String[] args) {
        String s="ganilakshmi";
        int count=0;
        List<Character> dup=new ArrayList<>();
        for(int i=0;i<s.length();i++){    //outer loop to go through string
            for(int j=i+1;j<s.length();j++){   //inner loop to compare each character
                if(s.charAt(i)==s.charAt(j)){  //if there is character repeated it will be added into duplicate list
                    dup.add(s.charAt(i));
                    count++;
                }
            }
        }
        System.out.println("duplicate characters are "+dup);
        System.out.println("and count of duplicate characters are "+count);
    }


}

