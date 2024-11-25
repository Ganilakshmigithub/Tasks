import java.util.Scanner;
public class Calculator {

    @FunctionalInterface
    interface Operation{
        double apply(double a,double b);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Operation add=(a,b)->a+b;
        Operation sub=(a,b)->a-b;
        Operation mul=(a,b)->a*b;
        Operation div=(a,b)->{
            if(b!=0){
                return a/b;
            }
            else{
                System.out.println("error while dividing by zero");
                return Double.NaN;
            }
        };

        System.out.println("welcome to the calucator!!");
        boolean iscontinue=true;
        while(iscontinue){
        System.out.println("enter first number:");
        Double num1=scanner.nextDouble();
        System.out.println("enter second number:");
        Double num2=scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        int choice = scanner.nextInt();
        double result = 0;

        switch(choice){
            case 1:
            result=add.apply(num1,num2);
            System.out.println("addition of "+num1+" and "+ num2 + " is " +result);
            break;
        case 2:
            result=sub.apply(num1,num2);
            System.out.println("subtraction of"+num1+" and "+ num2 + " is " +result);
            break;
        
        case 3:
            result=mul.apply(num1,num2);
            System.out.println("multiplication of"+num1+" and "+ num2 + " is " +result);
            break;
        case 4:
            result = div.apply(num1, num2);
            if (!Double.isNaN(result)) {
                System.out.println("divison of"+num1+" and "+ num2 + " is " + result);
            }
            break;
        default:
            System.out.println("Invalid choice! Please choose a valid operation.");
    }
    System.out.println("Do you want to continue? (yes/no)");
    scanner.nextLine(); 
    String input = scanner.nextLine().trim().toLowerCase();
    if (input.equals("n") || input.equals("no" )|| input.equals("n o")) {
        iscontinue = false;
    }
}
System.out.println("Good Bye!");

    

        scanner.close();
    }
}