import java.io.Console;
public class Console1{
  public static void main(String args[]){
    Console console=System.console();
    System.out.println("enter yor name");
    String user=console.readLine();
    System.out.println ("hELLO "+user);
    System.out.println("enter your password: ");
    char[] ch=console.readPassword();
    String pass=String.valueOf(ch);
    System.out.println("Password: "+pass);
   }
}
