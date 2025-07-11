import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormatExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("System Date: "+currentDate);
        SimpleDateFormat formatter = new SimpleDateFormat("EEE dd-MM-yyyy HH:mm:ss");

        String formattedDate = formatter.format(currentDate);

        System.out.println("Formatted Date: " + formattedDate);
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy"); 
        String formattedDate1 = formatter1.format(currentDate);
        System.out.println("Formatted Date1: " + formattedDate1);
    }
}
/*
 * System Date: Sat Jun 14 11:28:51 IST 2025
Formatted Date: Sat 14-06-2025 11:28:51
Formatted Date1: 14/06/2025
 */
