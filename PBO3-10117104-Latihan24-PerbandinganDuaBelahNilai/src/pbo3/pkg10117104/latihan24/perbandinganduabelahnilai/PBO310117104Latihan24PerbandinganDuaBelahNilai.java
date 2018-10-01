/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan24.perbandinganduabelahnilai;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama      : Aditya Suheryana
 * Kelas     : IF-3/PBO3
 * Nim       : 10117104
 * Deskripsi : Menampilkan Program yang berisi Perbandingan Dua Buah Nilai
 */
public class PBO310117104Latihan24PerbandinganDuaBelahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilaiPertama,nilaiKedua;
    String lagi;
        
    Scanner scn=new Scanner(System.in);    
    System.out.println("==========Program Perbandingan Dua Nilai=============");
    do{
    System.out.printf("Masukkan nilai pertama : ");
    nilaiPertama=scn.nextInt();
    System.out.printf("Masukkan nilai Kedua   : ");
    nilaiKedua=scn.nextInt();
    if(nilaiPertama>nilaiKedua){
    System.out.println("Hasil : "+nilaiPertama+" Lebih Besar dari "+nilaiKedua); 
    }
    else if(nilaiPertama<nilaiKedua){
    System.out.println("Hasil : "+nilaiPertama+" Lebih Kecil dari "+nilaiKedua);
    }
    else{
        System.out.println("Hasil : "+nilaiPertama+" Sama dengan "+nilaiKedua);
    }
        System.out.println("");
        System.out.printf("Ulangi Aktifitas ? (Ya/Tidak) : ");
        lagi=scn.next();
        }
        while(!lagi.equals("Tidak"));
    }
    }


