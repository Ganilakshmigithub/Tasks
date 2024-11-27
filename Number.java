import java.util.List;

public class Number implements Comparable<Number> {
    private int value;
    Number(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    
    @Override
    public int compareTo(Number o) {
        return Integer.compare(this.value, o.value);

    }
}
class Main {
    public static void main(String[] args) {
        List<Number> numbers=List.of(
        new Number(20),
        new Number(30),
        new Number(2),
        new Number(42),
        new Number(56),
        new Number(1));
        Number max=numbers.stream().max(Number::compareTo).get();
        Number min=numbers.stream().min(Number::compareTo).get();
        System.out.println("max number : "+max.getValue());
        System.out.println("min number is: "+min.getValue());
    }

}

