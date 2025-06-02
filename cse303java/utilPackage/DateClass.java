import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println("Current Date and Time: " + myDate);
        //setting a specific time
        myDate.setTime(15680L);
        System.out.println("Updated Date and Time: " + myDate);
        
        //creating 2 date objects 
        Date date1 = new Date(1595, 2, 16);
        Date date2 = new Date(2025, 6, 2);
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        //using after method
        if (date1.after(date2)) {
            System.out.println("Date 1 is after Date 2");
        } else {
            System.out.println("Date 1 is not after Date 2");
        }
        //using clone method
        Date clonedDate = (Date) date1.clone();
        System.out.println("Cloned Date: " + clonedDate);
    }
}
