
package dasar2;

import java.util.*;

public class Segitiga_Bintang {     
   public static void main (String [] args){
       Scanner sc = new Scanner (System.in);
       
       System.out.println(">> INPUT -----------------");
       System.out.print(">> Masukkan panjang bintang : ");
       int size = sc.nextInt();
       
       System.out.println(">> OUTPUT ----------------");
       
       //nested looping for untuk mencetak segitiga bintang
       System.out.println("  PROGRAM SEGITIGA RATA KANAN");
       for(int i=1; i<=size; i++){
           for(int j=0; j< (size-i); j++){
               System.out.print("  ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
       
       System.out.println("  PROGRAM SEGITIGA RATA KIRI");
       for(int i = 1; i<=size; i++){
           for(int j=1; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
   } 
}
