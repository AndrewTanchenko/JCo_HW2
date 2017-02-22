// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz2_6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=0; i<=5; i++){ 
       System.out.println ("Please input number [seconds]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (a<0){
           System.out.println("Must be positive value, more than 0! not as you have shared "+s1);
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
      System.out.println("You are give "+ a+ " seconds");  
      
      /*s1=""+a;      
      if(s1.length()==3&((int)(a/2))!=((float)(a)/2)){System.out.println("Number checking: has 3 digits and ne4et - true");}
      else {System.out.println("Number checking: 3 digits and ne4et - fail");}
      */
      int days=0, hours=0, minutes=0;
      if(a>60*60*24){days =a/60/60/24;}
       a=a-60*60*24*days;
      if(a>60*60){hours =a/60/60;}
       a=a-60*60*hours;
      if(a>60){minutes =a/60;}
       a=a-60*minutes;
      
      System.out.println("So, it's: "+days+" days "+ hours+" hours "+ minutes+" minutes and "+a+" seconds");
      }   

      System.out.println("Tada! ");
        }
      }