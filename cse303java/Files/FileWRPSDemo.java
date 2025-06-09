//program to demonsrate Byte Stream
import java.io.*;
import java.util.*;
class FileWRPSDemo{
  public static void main(String... args){
    try{
    FileOutputStream fos=new FileOutputStream("demo.txt");
    System.out.println("file created");
    Scanner sc= new Scanner(System.in);
    System.out.println("enterSomeData");
    String str=sc.nextLine();
    PrintStream ps=new PrintStream(fos);
    ps.println(str);
    ps.close();
    fos.close();
    System.out.println("DATA ENTERED INTO FILE");
    FileInputStream fis=new FileInputStream("demo.txt");
    int k;
    while((k=fis.read())!=-1)
    {
    System.out.print((char)k);
    }
    fis.close();
    }catch(Exception e){
       System.out.println(e);
    }
  }
}
