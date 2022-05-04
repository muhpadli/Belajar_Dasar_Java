package dasar2;

import java.util.*;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang data : ");
        int batas = sc.nextInt();
        sc.nextLine();
        
        //deklarasi array
        String [] dataString = new String[batas];
        
        //inisialisasi array
        for(int i=0; i<batas; i++){
            System.out.print("Data["+i+"]: ");
            dataString[i] = sc.nextLine();
        }
        
        //menampilkan data array
        System.out.println("output cara ke-1 }-----------------------");
        System.out.println(Arrays.toString(dataString));
        
        System.out.println("output cara ke-2 }-----------------------");
        for(int i=0; i<batas; i++){
            System.out.print(dataString[i]+"\t");
        }
    }
}
