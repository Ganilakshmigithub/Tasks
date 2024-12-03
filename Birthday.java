import java.util.Calendar;
public class Birthday{
    public static void main(String[] args) {
        int birthYear = 2003;
        int birthMonth = 7;
        int birthDay = 13;
        Calendar currentCalendar = Calendar.getInstance();
        int currentYear = currentCalendar.get(Calendar.YEAR);
        int currentMonth = currentCalendar.get(Calendar.MONTH) + 1; // Calendar.MONTH is 0-based
        int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        System.out.println("The person's age is: " + age);
    }
}

