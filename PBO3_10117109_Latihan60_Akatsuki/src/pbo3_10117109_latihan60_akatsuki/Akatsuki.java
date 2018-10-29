/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan60_akatsuki;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan tokoh tokoh
* dan peran dalam film Akatsuki
 */
public class Akatsuki {
    
    protected String anggota;

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public void tampilAkatsuki(){
        System.out.println("Nama Anggota : "+getAnggota());
          
    } 
}
