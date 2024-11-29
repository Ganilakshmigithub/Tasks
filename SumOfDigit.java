public class SumOfDigit {
    public static void main(String[] args) {
        int i=123;
        int sum=0;
        while(i!=0){
            sum=sum+(i%10);   //0+123%10=0+3-->3 , 12%10=2->3+2=5,5+1=6
            i=i/10;           //123/10=12 ,12/10=1 ,1/10=0
        }
        System.out.println("sum of number is:" +sum);

    }

}
