
package dasar2;
import java.util.*;
public class Uppercase_Lowercase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        System.out.print("Masukkan kata/kalimat dengan huruf kecil : ");
        String klmtKecil = sc.nextLine();
        System.out.print("Masukkan kata/kalimat dengan huruf kapital :");
        String klmtKapital = sc.nextLine();
        System.out.println("OUTPUT");
        System.out.println("Hasil konversi ke huruf kapital : "+klmtKecil.toUpperCase());
        System.out.println("Hasil konversi kehuruf kecil : "+klmtKapital.toLowerCase());
    }
}
