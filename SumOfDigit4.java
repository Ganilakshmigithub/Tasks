public class SumOfDigit4 {
    public static void main(String[] args) {
    int n = 321;
  int sum= String.valueOf(n).chars().map(Character::getNumericValue).sum();  
  System.out.println("sum is: "+sum);
    }
}

