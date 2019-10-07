/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan23.nilaiterbesar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan23NilaiTerbesar {
    
  public static int banyak,kecil,besar,i;
    public static String petugas;
    
    public static void main(String[] args) {
        
       Scanner userInput = new Scanner(System.in);
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        
        System.out.print("Petugas : ");
        petugas = userInput.next(); 
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyak = userInput.nextInt(); 
        
        int[] nilai = new int[banyak]; 
        
        for(i = 0; i < banyak; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai[i] = userInput.nextInt(); 
        }
        
        besar = nilai[0]; 
        kecil = nilai[0]; 
        
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for( i = 0; i < banyak; i++) {
       
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+"=" + nilai[i]);
            
            
            if(besar <= nilai[i]) besar = nilai[i];
            if(kecil >= nilai[i]) kecil = nilai[i];
        }
        
    
        System.out.println("Nilai Terbesar adalah " + besar);
        System.out.println("Nilai Terkecil adalah " + kecil);
        
        System.out.println("Petugas:"+petugas);
               
        
        
        
        
        
    }
    
}
