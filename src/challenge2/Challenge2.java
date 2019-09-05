/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

/**
 *
 * @author asd
 */
import java.util.Scanner;
public class Challenge2 {
  

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        System.out.println("--PENGUMPULAN NILAI--");
        int nilailaporan;
        int nilaiLaporan;
        int nilaitugas;
        int nilaiujian;
        int nilaiUjian;
       int nilaitugasharian;
       int nilaiAkhir;
      
       
        
        // membuat Scanner
        Scanner baca = new Scanner(System.in);
        
  // Input
System.out.print("masukkan nilai tugas : ");
nilaitugas = baca.nextInt();
nilaitugasharian = nilaitugas * 30 / 100;
System.out.println("nilai tugas : " + nilaitugasharian);

System.out.print("masukkan nilai laporan : ");
nilailaporan = baca.nextInt();
nilaiLaporan = nilailaporan * 20 / 100;
System.out.println("nilai laporan : " + nilaiLaporan);

System.out.print("masukkan nilai ujian : ");
nilaiujian = baca.nextInt();
nilaiUjian = nilaiujian * 50 / 100;
System.out.println("nilai ujian : " + nilaiUjian);

nilaiAkhir = nilaitugasharian + nilaiLaporan + nilaiUjian;
System.out.println("Total nilai:" + nilaiAkhir);

// Konversi ke huruf
 if(nilaiAkhir <= 40) {
     System.out.println("Nilai akhir = F");
 }else if(nilaiAkhir <= 55) {
     System.out.println("Nilai akhir = E");
 }else if(nilaiAkhir <= 74) {
     System.out.println("Nilai akhir = D");
 }else if(nilaiAkhir <= 85){
     System.out.println("Nilai akhir = C ");
 }else if(nilaiAkhir <= 92) {
     System.out.println("Nilai akhir = B");
 }else if(nilaiAkhir <= 100) {
     System.out.println("Nilai akhir = A");
 }
     System.out.println("--KETENTUAN KELULUSAN--");
     if(nilaiAkhir <= 55) {
         System.out.println("Anda tidak lulus,tingkatkan belajar anda");
     }else if(nilaiAkhir <= 74) {
         System.out.println("Anda tidak lulus tingkatkan belajar anda");
     }else if(nilaiAkhir <= 85) {
         System.out.println("Anda lulus dengan cukup,tingkatkan belajar anda");
     }else if(nilaiAkhir <= 92) {
         System.out.println("Anda lulus dengan baik,pertahankan prestasimu");
     }else if(nilaiAkhir <= 100) {
         System.out.println("Anda lulus,Excellent");
     
         
     }
     
     
     }
     
         
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 
     
    
 
    
    
   
    
    
    
 
 
     
 
 

     
 






        
        
        
    
    

