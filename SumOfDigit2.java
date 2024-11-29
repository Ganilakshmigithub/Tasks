public class SumOfDigit2 {

    public static void main(String[] args) {
        int num=153;
        int sum=0;
        for(int temp=num;temp>0;temp/=10){ //temp=153,temp=15 ,temp=1
            sum+=temp%10; //153%10=3 ,15/10=5+3=8 ,1%10=1+8=9
        }
        System.out.println("sum is: "+sum);
    }
}
