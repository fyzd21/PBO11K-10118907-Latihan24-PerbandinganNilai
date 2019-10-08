/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan membandingkan nilai
 * 
 */
public class PBO11K10118907Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai11, nilai22;
        String ulang;
        
        do {
        System.out.print("Masukkan nilai pertama : ");
        Scanner scanner = new Scanner(System.in);
        String nilai1 = scanner.next();
        System.out.print("Masukkan nilai kedua : ");
        Scanner scanner2 = new Scanner(System.in);
        String nilai2 = scanner2.next();
        
        nilai11 = Integer.parseInt(nilai1);
        nilai22 = Integer.parseInt(nilai2);
        
        String hasil = hitung(nilai11, nilai22);
        System.out.println(hasil);
        
        System.out.print("Ulangi aktivitas ? (Ya/Tidak) : ");
        Scanner scanner3 = new Scanner(System.in);
        ulang = scanner3.next();
        } while(ulang.toLowerCase().equals("ya"));
        
    }
    
    public static String hitung(int nilai1, int nilai2) {
        String banding, hasil;
        if(nilai1 > nilai2) {
            banding = "lebih besar dari";
        } else if(nilai1 < nilai2) {
            banding = "lebih kecil dari";
        } else {
            banding = "sama dengan";
        }
        
        hasil = nilai1+" "+banding+" "+nilai2;
        
        return hasil;
    }
    
}
