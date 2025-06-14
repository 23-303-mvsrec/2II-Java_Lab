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
        boolean a = date1.after(date2);
        System.out.println("Date 1 is after Date 2: "+a);
        
        //using clone method
        Date clonedDate = (Date) date1.clone();
        System.out.println("Cloned Date: " + clonedDate);

        //use of before() to check date2 is after date1
        boolean b = date2.before(date1);
        System.out.println("Is date2 is before date1 :"+b);

        Date d1 = new Date(97,10,27);
        Date d2 = new Date(97,6,12);
    }
}
