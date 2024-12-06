//string immutability demonstration example:3
public class Strimt3 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";  //s1 and s2 will hold same memory location 
        System.out.println(s2);
        System.out.println(s1);

        if(s1==s2){ //checks if the memory location of both the strings are same
            System.out.println("s1 and s2 are same object");
        }

        if(s1.equals(s2)){ //checks if the content of both the strings are same
            System.out.println("s1 and s2 are same string");
        }
    }

}
