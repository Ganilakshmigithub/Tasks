import java.util.*;
public class CheckNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something: ");
        String input=sc.nextLine();
        try{
            Integer.parseInt(input);
            System.out.println("Number is valid");
        }
        catch(NumberFormatException e){
            System.out.println("Number is not valid"+e);
        }
        sc.close();;
    }

}
