public class Calculator {

    @FunctionalInterface
    interface Operation{
        double apply(double a,double b);
       
    }
    public static void main(String[] args){
        Operation add=(a,b)->a+b; //lambda expression
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
        short num1=300;
        short num2=5;
        double result=add.apply(num1, num2); //arguments
        System.out.println("addition "+result);
        double res=sub.apply(num1, num2);
        System.out.println("subtraction "+res);
        double r=mul.apply(num1, num2);
        System.out.println("multiplication "+r);
        double resut=div.apply(num1, num2);
        if(!Double.isNaN(result)){
        System.out.println("divison "+resut);



    }
}
}

