
package dasar2;
import java.util.*;
public class java_EqualIgnoreCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        boolean menu = true;
        while(menu){
            System.out.println("-- DAFTAR MENU : ");
            System.out.println("-- a > Nasi Goreng\t=  Rp. 10.000");
            System.out.println("-- b > Mie Bakso\t=  Rp. 15.000");
            System.out.println("-- c > Mie Pangsit\t=  Rp. 12.000");
            System.out.print("-- Masukkan pilihan Menu : ");
            String mpilihan = sc.nextLine();
            if (mpilihan.equalsIgnoreCase("a")){
                int harga = 10000;
                String menuPilihan = "Nasi Goreng";
                System.out.println("-- Pilihan menu\t: "+menuPilihan);
                System.out.println("-- Harga\t: "+harga);
                System.out.print("-- Lanjut Transaksi ? y/t : ");
                String subPil = sc.nextLine();
                if(subPil.equalsIgnoreCase("y")){
                    System.out.println("-- Kwitansi pembayaran");
                    System.out.println("-- Nama\t\t: "+nama);
                    System.out.println("-- Menu Pilihan\t: "+menuPilihan);
                    System.out.println("-- Harga\t: "+harga);
                }else{
                    break;
                }
            }
            else if (mpilihan.equalsIgnoreCase("b")){
                int harga = 12000;
                String menuPilihan = "Mie Pangsit";
                System.out.println("-- Pilihan menu\t: "+menuPilihan);
                System.out.println("-- Harga\t: "+harga);
                System.out.print("-- Lanjut Transaksi ? y/t : ");
                String subPil = sc.nextLine();
                if(subPil.equalsIgnoreCase("y")){
                    System.out.println("-- Kwitansi pembayaran");
                    System.out.println("-- Nama\t\t: "+nama);
                    System.out.println("-- Menu Pilihan\t: "+menuPilihan);
                    System.out.println("-- Harga\t: "+harga);
                }else{
                    break;
                }
            }
            else if (mpilihan.equalsIgnoreCase("c")){
                int harga = 12000;
                String menuPilihan = "Mie Bakso";
                System.out.println("-- Pilihan menu\t: "+menuPilihan);
                System.out.println("-- Harga\t: "+harga);
                System.out.print("-- Lanjut Transaksi ? y/t : ");
                String subPil = sc.nextLine();
                if(subPil.equalsIgnoreCase("y")){
                    System.out.println("-- Kwitansi pembayaran");
                    System.out.println("-- Nama\t\t: "+nama);
                    System.out.println("-- Menu Pilihan\t: "+menuPilihan);
                    System.out.println("-- Harga\t: "+harga);
                }else{
                    break;
                }
            }else{
                System.out.println("--Mohon Maaf Menu yang Anda Masukkan Salah");
                System.out.println("--Sistem telah berhenti");
                menu = false;
            }
        }
    }
}
