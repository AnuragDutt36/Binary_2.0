import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        // Create a Date object
        Date currentDate = new Date();

        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Convert the date to a string
        String dateString = dateFormat.format(currentDate);

        // Display the converted string
        System.out.println("Date as String: " + dateString);
    }
}
