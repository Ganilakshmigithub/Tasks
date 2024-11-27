import java.util.*;
public class CheckNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        String input=sc.nextLine();
        try{
            Double.parseDouble(input);
            System.out.println("You entered a number");
        }
        catch(NumberFormatException e){
            System.out.println("You did not enter a number"+e);
        }
        sc.close();
    }

}
