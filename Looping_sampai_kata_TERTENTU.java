package dasar2;

import java.util.*;

public class Looping_sampai_kata_TERTENTU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("+-- SELAMAT DATANG DI WARUNG KOPI ONLINE --+");
            System.out.println("+ a. Daftar Menu                           +");
            System.out.println("+ b. Keranjang Belanja                     +");
            System.out.println("+ c. Exit                                  +");
            System.out.println("+------------------------------------------+");
            System.out.print("-- Masukkan pilihan anda : ");
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("a")) {
                System.out.println("+----- DAFTAR MENU WARUNG KOPI ONLINE ----+");
                System.out.println("+ a. Kopi Pahit      | Rp.8.000            +");
                System.out.println("+ b. Kopi susu       | Rp.12.000           +");
                System.out.println("+ c. Kopi biasa      | Rp.10.000           +");
                System.out.println("+ d. Cappucino       | Rp.15.000           +");
                System.out.println("+------------------------------------------+");
            }else if(pilihan.equalsIgnoreCase("b")){
                System.out.println("+-------- KERANJANG BELANJA ANDA ----------+");
                System.out.println("+   Keranjang belanja Anda Masih Kosong    +");
                System.out.println("+       Silahkan lihat daftar menu         +");
                System.out.println("+------------------------------------------+");
            }else if(pilihan.equalsIgnoreCase("c")){
                System.out.println("+------------------------------------------+");
                System.out.println("+          Anda berhasil keluar            +");
                System.out.println("+     Terimakasih Sampai Jumpa Kembali     +");
                System.out.println("+------------------------------------------+");
                run = false;
            }else{
                System.out.println("+------------------------------------------+");
                System.out.println("+  Mohon Maaf Pilihan Anda Tidak Tersedia  +");
                System.out.println("+                Butuh Aqua?               +");
                System.out.println("+------------------------------------------+");
            }
        }
    }
}
