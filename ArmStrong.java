import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" arm strong number");
        }
        else{
            System.out.println(temp +" not an armstrong");
        }
        sc.close();
    }

}
