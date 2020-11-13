/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * biaya emas kawin
 */
public class BiayaEmasKawin {
    private double emas, harga;
    private String nama;
    
    public BiayaEmasKawin(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public double getEmas() {
        return this.emas;
    }
    
    public void setEmas(double emas) {
        this.emas = emas;
    }
    
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double totalBayar(double emas, double harga) {
        return emas * harga;
    }
}

