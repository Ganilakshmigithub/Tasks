import java.time.LocalDate;
import java.time.Period;

public class BirthDate {
    public static void main(String[] args) {
        LocalDate birthdate=LocalDate.parse("2003-07-13");
        LocalDate currentdate=LocalDate.now();
        Period period=Period.between(birthdate, currentdate);
        System.out.println("age of the person is "+period.getYears()+" years  "+period.getMonths()+" months  "+period.getDays()+ "days");
        
    }

}
