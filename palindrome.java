import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                System.out.println("not a palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
sc.close();
}
}
