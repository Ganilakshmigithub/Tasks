import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter something: ");
 if(sc.hasNextInt()){
    System.out.println(" Given input is a Number");
 }
 else{
    System.out.println(" Given input is not a number");
 }
 sc.close();
}
}
