// program to demonstrate charaacter streams
import java.io.*;
public class FileWriterReaderDemo{
   public static void main(String[] args){
      try{
        FileWriter fw=new FileWriter("FileWriter.txt");//may raise io exception
        fw.write("welcome to MVSREC");
        fw.close();
     }catch(Exception e){
        System.out.println(e);
     }
     System.out.println("Success..!");
     try{
      FileReader fr=new FileReader("FileWriter.txt");
      int i;
      while((i=fr.read())!=-1)//read method returns integer value(ASCII) of character
      System.out.print((char)i);//converting integer to char and displaying it
     }catch(Exception e){
      System.out.println(e);
    }
    }
}
