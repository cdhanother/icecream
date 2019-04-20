/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Icecream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ,m ,p;
        int V=1, C=1,S=1,A=0;
        
        
       System.out.println("please input:"); 
       Scanner sc = new Scanner(System.in);
       String inputString = sc.nextLine();
       String stringArray[] = inputString.split(" ");
      
       n= Integer.parseInt(stringArray[0]);
       m= Integer.parseInt(stringArray[1]);
       p= Integer.parseInt(stringArray[2]);
       
       inputString = sc.nextLine();
       String stringArray2[] = inputString.split(" ");
       V = Integer.parseInt(stringArray2[0]); 
       C=  Integer.parseInt(stringArray2[1]);
       S=  Integer.parseInt(stringArray2[2]);
       A= Integer.parseInt(stringArray2[3]);
        
       int[] nq = new int[V]; 
       int[] nc = new int[V]; 
       int[] mq = new int[C]; 
       int[] mc = new int[C]; 
       int[] pq = new int[S]; 
       int[] pc = new int[S];
        
       for (int i =0 ; i < V; i++){
            inputString = sc.nextLine();
            String temp[] = inputString.split(" ");
            nq[i]= Integer.parseInt(temp[0]);
            nc[i]= Integer.parseInt(temp[1]);
        }
        
        for (int i =0 ; i < C; i++){
            inputString = sc.nextLine();
            String temp[] = inputString.split(" ");
            mq[i]= Integer.parseInt(temp[0]);
            mc[i]= Integer.parseInt(temp[1]);
        }
        
       for (int i =0 ; i < S; i++){
            inputString = sc.nextLine();
            String temp[] = inputString.split(" ");
            pq[i]= Integer.parseInt(temp[0]);
            pc[i]= Integer.parseInt(temp[1]);
        }
       
  
       int[] mixq = new int[A]; 
       int[] mixc = new int[A];
       for (int i =0 ; i < A; i++){
           inputString = sc.nextLine();
           String temp[] = inputString.split(" ");
           mixq[i]= Integer.parseInt(temp[0]);
           mixc[i]= Integer.parseInt(temp[1]); 
        }
  
      int output1=0,output2=0,output3=0,outputm =0;
      int remainder = 0;
      if ( A!=0){
          int min =n;
          if (m < min) min = m;
          if (p < min) min = p;
          remainder = min;
          
         for (int i = 0 ; i < A; i++){
             outputm = outputm + remainder/mixq[A-i-1]* mixc[A-i-1];
             remainder = remainder%mixq[A-i-1];
             
         }
         n = n - min;
         m = m - min;
         p = p - min;
          
      }
      
      remainder = n;
      for (int i = 0 ; i < V; i++){
             output1 = output1 + remainder/nq[V-i-1]* nc[V-i-1];
             remainder = remainder%nq[V-i-1];
             
      }
         
      remainder = m;
      for (int i = 0 ; i < C; i++){
             output2 = output2 +  remainder/mq[C-i-1]* mc[C-i-1];
             remainder = remainder%mq[C-i-1];
            
         }
         
         remainder = p;
         for (int i = 0 ; i < S; i++){
             output3 = output3 + remainder/pq[S-i-1]* pc[S-i-1];
             remainder = remainder%pq[S-i-1];
             
         }
         
         System.out.println("output:"); 
         System.out.println("output1");
         System.out.println("output2");
         System.out.println( output1+output2+ output3 + outputm);
         
   //  }
        
        // TODO code application logic here
    }
    
}
