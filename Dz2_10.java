// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz2_10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=0; i<=5; i++){ 
       System.out.println ("Please input simple number [three digits: xxx]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (l != 3){
           System.out.println("Just three digits! no less, no more ! not as you have done "+l);
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
      //int a3=a%10;
      //int a2= ((int)(a/10))%10;
      //int a1=(int)(a/100);
      //int c=a1+a2+a3;
      //int d=a1*a2*a3;
      //System.out.println("So, "+ a1 + " + " + a2 + " + " + a3 + " = "+c);
      //System.out.println("and "+ a1 + " * " + a2 + " * " + a3 + " = "+d);      
      
      int summ=0, mult=1;
      String s_summ="",s_mult="";
      s1=""+a;
      int l=s1.length();
      
      for(int i=0;i<=l-1;i++){
        summ+=a%10;
        mult*=a%10;
        s_summ="+"+a%10+s_summ;
        s_mult="*"+a%10+s_mult;  
        a=(int)(a/10);
      }
      System.out.println("So, "+ s_summ + " = "+summ);
      System.out.println("and "+ s_mult + " = "+mult);
      System.out.println("Tada! ");
        }
      }
    }