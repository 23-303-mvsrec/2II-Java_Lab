//program to demostrate File class
import java.util.Scanner;
import java.io.File;
class FileDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter file name with extension");
    String fname=sc.nextLine();
    File file=new File(fname);
    if(file.exists())
    {
        System.out.println(fname +"exists");
        System.out.println("file location: "+file.getAbsolutePath());
        System.out.println("File Readable: "+file.canRead());
        System.out.println("File Writeable: "+file.canWrite());
        System.out.println("isFile? "+file.isFile());
        System.out.println("isDirectory? "+file.isDirectory());
        System.out.println("isHidden? "+file.isHidden());
        System.out.println("Length of the file="+file.length()+" bytes");
        int index=fname.lastIndexOf(".");
        if(index>0)
        {
          String ext=fname.substring(index);
          System.out.println("filetype="+ext);
        }
     }
     else{
     System.out.println(fname+"DOES NOT EXIST");
       try{
       file.createNewFile();
       System.out.println("file created "+file.getAbsolutePath());
      }catch(Exception e){System.out.println(e);}
    }
    sc.close();
  }
}

