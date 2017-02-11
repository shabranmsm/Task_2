/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Shabran
 */
public class Mahasiswa {
     private String nim;
     private String nama;
     private String status;
     private char nilai []; 
     private int i;
 

     
     public Mahasiswa() {
         
         status = "Tidak Lulus" ;
         i=0;
         nilai= new char[10];
     }
 
     public Mahasiswa(String nim, String nama) {
         this.nim = nim;
         this.nama = nama;
         status = "Tidak Lulus" ;
         i=0;
         nilai= new char[10];
         
     }
     
     
 
 
     public void setNIM(String NIM) {
         this.nim = nim ;
     }
 
     public void setNama(String Nama) {
         this.nama = nama;
     }
 
     public void setStatus (String Status){
         this.status = status;
     }
   
     public void setNilai(char[] nilai) {
         this.nilai = nilai;
     }
     
     public void seti (int i){
         this.i = i;
     }
    
     
     public String getNIM (String NIM){
         return nim;
     }
     
     public String getNama (String Nama){
         return nama;
     }
     
     public String getStatus (String Status) {
         return status;
     }
 
     public char[] getNilai() {
         return nilai;
     }
     
     public void addNilai(char nilai){
         if (i < 10){
             i++;
             this.nilai[i] = nilai;
         }
     }
     
     public char getNilai(int i){
         return nilai [i+1];
     }
     
     public String toString() {
        String s = nim + "," +nama+ "," +status+ "," + "Nilai = ";
         for (int m = 0; m <= i; m++){
             s =s + nilai[m] + ",";
         }
         return s;
     }
     
     public char cekNilai(Mahasiswa m){
         char b = 0;
         for(char d = 'A'; d< 'E'; d++){
             for (int e = 0; e < i; e++){
                 if (nilai[e] == d){
                     for (int c = 0; c < m.i; c++){
                         if (m.nilai[c] == d) {
                             return d;
                         }
                     }
                 }
             }
         }
         return b;
     }
     
    
 }

