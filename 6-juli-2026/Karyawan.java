/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testuas;

/**
 *
 * @author Lenovo
 */
public class Karyawan {
    private int Kode;
    private String Nama;
    private String Alamat;
    
    public Karyawan(){
    }
    
    public Karyawan(int Kode,String Nama,String Alamat){
        this.Kode = Kode;
        this.Nama = Nama;
        this.Alamat=Alamat;
    }

    public int getKode() {
        return Kode;
    }

    public void setKode(int Kode) {
        this.Kode = Kode;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
}
