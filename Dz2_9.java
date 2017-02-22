// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz2_9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=0; i<=5; i++){ 
       System.out.println ("Please input simple number [four digits: xxxx]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (l != 4){
           System.out.println("Just four digits! no less, no more ! not as you have done "+l);
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
      int l=s1.length();
      int[] aa = new int[l];
      String _s="";
      
      for(int i=0;i<=l-1;i++){
        aa[i]=a%10;
        _s=" "+aa[i]+_s;
        a=(int)(a/10);
      }

      boolean _flag=true;
      for(int i=0;i<=l/2;i++){
        if(aa[i]!=aa[l-1-i]){_flag=false;}
      }
        
      if(_flag){System.out.println("So, verdict: "+ _s + " is a polindrom ");}
      else{System.out.println("So, verdict:"+ _s + " is not a polindrom");}
      
      System.out.println("Tada! ");
        }
      }
    }