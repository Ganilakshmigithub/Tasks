import java.util.function.Supplier;

public class Supplierexample2 {
    public static void main(String[] args) {
        String str="ganilakshmi";
        Supplier<String> sup=()->str.toUpperCase();
        System.out.println(sup.get());
    }

}
