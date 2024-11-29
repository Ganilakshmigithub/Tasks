public class SumOfDigit3 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("sum of digit is: "+sumOfDigit(n));
    }
    public static int sumOfDigit(int n) {
        return n==0?0:n%10+sumOfDigit(n/10);  

}
}