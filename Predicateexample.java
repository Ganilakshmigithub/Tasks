import java.util.function.Predicate;
//Boolean value
public class Predicateexample {
    public static void main(String[] args) {
        Predicate<String> checkstring=str->str.length()>5;
        System.out.println(checkstring.test("ganilakshmi"));
    }

}
