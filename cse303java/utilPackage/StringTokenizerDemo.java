//package cse303java.utilPackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
   public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println("no of tokens: " + st.countTokens());
        System.out.println("First token: " + st.nextToken());
        System.out.println("Remaining tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("no of tokens: " + st.countTokens());
        System.out.println("-----------------------------------------------------------------------------");
        StringTokenizer st1 = new StringTokenizer(
            "Hello,everyone,how,are,you",
            ","
        );
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextElement());
        }
   } 
}
