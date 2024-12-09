import java.util.function.Function;
//Function takes input and gives output
public class Functionexample {
    public static void main(String[] args) {
        Function<Integer,String> fun=t->t*10+" data mulitiplied by 10";
        System.out.println(fun.apply(2));
    }

}
