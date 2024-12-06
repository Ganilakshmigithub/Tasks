//String immutability demonstration example:1
public class Strimt {
    public static void main(String[] args) {
        String s="gani";
        s.concat("laxmi"); //it will print gani because we cant perform operation same object we need to create another string object to concat "laxmi"
        System.out.println(s);
    }

}
//another object to concat laxmi..so that it will not effect s(original) object [ in strimt2 ]
