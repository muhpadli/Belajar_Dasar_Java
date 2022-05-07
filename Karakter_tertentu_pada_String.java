
package dasar2;

import java.util.*;

public class Karakter_tertentu_pada_String {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("INPUT");
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Masukkan inddex kalimat yang dipilih : ");
        int index = sc.nextInt();
        System.out.println("OUTPUT");
        char karakter = kalimat.charAt(index);
        System.out.println("Karakter yang dipilih : "+karakter);
        
        
    }
}
