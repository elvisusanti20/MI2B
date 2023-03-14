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
class SekolahPerpustakaan extends Perpustakaan {
    private int jumlahSiswa;
    
    public SekolahPerpustakaan(int jumlahSiswa) {
        super();
        this.jumlahSiswa = jumlahSiswa;
    }
    
    public int getJumlahSiswa() {
        return jumlahSiswa;
    }
}