import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {45, 23, 12, 67, 89, 4, 56, 5, 2};
        System.out.println("enter key to search in the array: ");
        int key = sc.nextInt();
        Arrays.sort(a);
        int result = Arrays.binarySearch(a, key);
        if (result >= 0) {
            System.out.println(key + " found in the array");
        } else {
            System.out.println(key + " is not found in the array");
        }
        sc.close();
    }
}
