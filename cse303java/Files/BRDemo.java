import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BRDemo{
   public static void main(String arg[]){
    try{
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter your name: ");
      String name=reader.readLine();
      System.out.println("hello "+name);
      }
      catch(Exception e)
      {
         System.out.println(false);
      }
 }
}
