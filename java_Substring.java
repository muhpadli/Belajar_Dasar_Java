
package dasar2;

import java.util.*;

public class java_Substring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- INPUT -------------");
        String kalimat = sc.nextLine();
        int beginIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        String mySubstring = kalimat.substring(beginIndex, endIndex);
        System.out.println("--OUTPUT------------");
        System.out.println(" NIM\t:"+ kalimat);
        System.out.println(" beginIndex\t:"+ beginIndex);
        System.out.println(" endIndex\t:"+ endIndex);
        System.out.println(" Hasil Substring\t:"+ mySubstring);
    }
}
