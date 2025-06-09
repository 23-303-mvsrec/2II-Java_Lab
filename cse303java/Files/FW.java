//program to demostrate read()to read from user
import java.io.*;
public class FW{
   public static void main(String[] args){
      try{
        FileWriter f=new FileWriter("f.txt");//may raise io exception
        System.out.println("Enter line of text to stop type *");
        char ch;
        while(true){
           int b=System.in.read();//reads as bytes and returns integer(ASCII)
           ch=(char)b;
           if((ch!='*'))
           {
            f.write(ch);
           }
           else
              break;
      }
     f.close();
      }catch(Exception e){
         System.out.println(e);
      }
    
    }
}
           
