//only returns output

import java.util.function.Supplier;

public class Supplierexample {
    public static void main(String[] args) {
        Supplier<Integer> sup=()->Math.min(10,8);
        System.out.println("minimum num is: "+sup.get());
        
    }

}
