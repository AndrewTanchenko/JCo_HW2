// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz2_3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=0; i<=5; i++){ 
       System.out.println ("Please input simple number [two digits: xx]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (l != 2){
           System.out.println("Just two digits! no less, no more ! not as you have done "+l);
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          if (i<5) {System.out.println("Data has not ineger format, please try againe ");}
          if (i == 5) {System.out.println("Enought! Back to school!");} 
         continue;
        }  
      }
        
        if (flag) {   
      System.out.println("Your number is "+ a);      
      int a1= (int)(a/10);
      int a2=a%10;
      String s2 =""+a2+a1;
      a=Integer.parseInt(s2);     
      System.out.println("Maybe "+ a + "?");
        }
      }
    }