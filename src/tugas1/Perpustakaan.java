/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author M3400QA
 */

    import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    
    public Perpustakaan() {
        daftarBuku = new ArrayList<Buku>();
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    
    public void hapusBuku(int index) {
        daftarBuku.remove(index);
    }
    
    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
    
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("101", "Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        Buku buku2 = new Buku("102", "The Hobbit", "J.R.R. Tolkien");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        System.out.println("Daftar Buku:");
        
        for (Buku buku : perpustakaan.getDaftarBuku()) {
            System.out.println("Kode: " + buku.getKode() + ", Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang());
        }
        
        if (perpustakaan instanceof SekolahPerpustakaan) {
            SekolahPerpustakaan sekolahPerpustakaan = (SekolahPerpustakaan) perpustakaan;
            System.out.println("Jumlah Siswa: " + sekolahPerpustakaan.getJumlahSiswa());
        }
        
        perpustakaan.hapusBuku(0);
        
        System.out.println("Daftar Buku setelah menghapus buku pertama:");
        
        for (Buku buku : perpustakaan.getDaftarBuku()) {
            System.out.println("Kode: " + buku.getKode() + ", Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang());
        }
    }
}

class Buku {
    private String kode;
    private String judul;
    private String pengarang;
    
    public Buku(String kode, String judul, String pengarang) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getPengarang() {
        return pengarang;
    }
}
    

