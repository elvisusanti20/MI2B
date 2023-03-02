/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author M3400QA
 */
public class Mahasiswa {
    String nama, nobp, kelas, prodi, jurusan;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama ="susan";
        mhs.nobp = "2101092046";
        mhs.kelas = "mi 2b";
        mhs.prodi = "manajemen informatika";
        mhs.jurusan = "Teknologi informasi";
        
        System.out.println("nama : "+mhs.nama+ "\n"
                +"no bp : "+mhs.nobp+"\n"
                    +"kelas : "+mhs.kelas+"\n"
                       +"prodi : "+mhs.prodi+"\n" 
                          +"jurusan : "+mhs.jurusan+"\n");
        
        System.out.println("");
         Mahasiswa mhs2 = new Mahasiswa();
        
        mhs2.nama = "Chantika";
        mhs2.nobp = "2101091002";
        mhs2.kelas = "AB 2b";
        mhs2.prodi = "AB";
        mhs2.jurusan = "AN";
        
        System.out.println("nama : "+mhs2.nama+ "\n"
                +"no bp : "+mhs2.nobp+"\n"
                    +"kelas : "+mhs2.kelas+"\n"
                       +"prodi : "+mhs2.prodi+"\n" 
                          +"jurusan : "+mhs2.jurusan+"\n");
                        
    }
    
}
