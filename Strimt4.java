//String immutability demonstration example:4
public class Strimt4 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";  //s1 and s2 will hold same memory location 
        System.out.println(s2);           //promoting string immutability by not getting affected even changes made in s1 string
        System.out.println(s1);
        String s3=s1.concat(",world!"); // original string s1 will not get effected and even s2 hold same memory location it will not get affected
        System.out.println(s3);
        
    }

}
