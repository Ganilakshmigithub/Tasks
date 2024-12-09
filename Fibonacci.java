import java.util.Scanner;
public class Fibonacci{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter range:");
int n=sc.nextInt();
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
int i=0;
while(i<=n){
int c=a+b;
System.out.println(c);
a=b;
b=c;
i++;
}
sc.close();;
}
}