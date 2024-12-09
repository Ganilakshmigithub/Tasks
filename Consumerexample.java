import java.util.function.Consumer;
//no output,modifies data
class Car{
    String carname;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }
    
}

public class Consumerexample {

    public static void main(String[] args) {
        Car c=new Car();
        Consumer<Car> name=t->t.setCarname("Audi");
        name.accept(c);
        System.out.println(c.getCarname());
        
        
    }

}
