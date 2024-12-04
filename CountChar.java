import java.util.HashMap;
//hashmap
public class CountChar {
    public static void main(String[] args) {
        String s="ganilakshmi";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);  //a and i two times so map will store a=2 and i=2(increments)
            map.put(ch, map.getOrDefault(ch, 0) + 1); // Increment the count for the character
        }
        
        for (char key : map.keySet()) {
            System.out.println(key + " count is " + map.get(key));
        }
    }
}
