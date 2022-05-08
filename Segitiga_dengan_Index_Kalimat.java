
package dasar2;

import java.util.*;

public class Segitiga_dengan_Index_Kalimat {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("INPUT");
        System.out.print("Masukkan kalimat : ");
        String kalimat = scan.nextLine();
        
        System.out.println("OUTPUT");
        System.out.println("Cara ke-1 ----------------------");
        for(int i=0; i<kalimat.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(kalimat.charAt(j));
            }
            System.out.println();
        }
        System.out.println("Cara ke-2 ----------------------");
        for(int i=1; i<=kalimat.length(); i++){
            System.out.println(kalimat.substring(0, i));
        }
    }
}
