// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz2_7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=0; i<=5; i++){ 
       System.out.println ("Please input simple number from 1 to 365 [day of year]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (a>365||a<0){
           System.out.println("Just more than 0 and less 365 ! not as you have done "+s1);
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
      
      s1=""+a;      
      if(s1.length()==3&((int)(a/2))!=((float)(a)/2)){System.out.println("Number checking: has 3 digits and ne4et - true");}
      else {System.out.println("Number checking: 3 digits and ne4et - fail");}
      
      a+=2;
      if(a>7){a-=7*(a/7);}
      String _s="";
      
      switch(a) {
        case 1:
          System.out.println("So, verdict: Day "+ s1+" is Monday");
          break;
        case 2:
          System.out.println("So, verdict: Day "+ s1+" is Tuesday");
          break;
        case 3:
          System.out.println("So, verdict: Day "+ s1+" is Wednesday");
          break;
        case 4:
          System.out.println("So, verdict: Day "+ s1+" is Thursday");
          break;
        case 5:
          System.out.println("So, verdict: Day "+ s1+" is Friday");
          break;
        case 6:
          System.out.println("So, verdict: Day "+ s1+" is Saturday");
          break;
        case 7:
          System.out.println("So, verdict: Day "+ s1+" is Sunday");
          break;
      }   

      System.out.println("Tada! ");
        }
      }
    }