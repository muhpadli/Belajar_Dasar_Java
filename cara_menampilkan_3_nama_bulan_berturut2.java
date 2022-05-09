
package dasar2;

import java.util.*;

public class cara_menampilkan_3_nama_bulan_berturut2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        String [] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                                "Juli", "Agustus", "September", "Oktober", "November","Desember"};
        System.out.print("Masukkan Index nama Bulan : ");
        int index = scan.nextInt();
        
        if(index>=1 && index<=12){
            index--;
            System.out.println(namaBulan[index]+"\n"+namaBulan[(++index)%12]+"\n"+namaBulan[(++index)%12]);
        }else{
            System.out.println("Index bulan yang anda masukkan tidak ada");
        }
    }
}
