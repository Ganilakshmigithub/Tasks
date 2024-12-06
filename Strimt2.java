//String immutability Demonstration example:2
public class Strimt2 {
    public static void main(String[] args) {
        String s="gani";
        String s1=s.concat("laxmi");
        System.out.println("concated string: "+s1);
        System.out.println("original string: " +s); //original string isnt affected promoting string immutability
    }

}
