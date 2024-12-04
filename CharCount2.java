import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=scanner.nextLine();
        int count = 0;
        System.out.println("enter the character you want to count");
        char t=scanner.next().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t){
                count++;
            }

    }
    System.out.println(t+ " count is: "+count);

    scanner.close();

}
}