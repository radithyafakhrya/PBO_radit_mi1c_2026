/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testuas;

/**
 *
 * @author Lenovo
 */
public class Gaji extends Karyawan {
    private Double Gajibersih;
    private String Status;
    
    public Gaji(){
    }
    
    public Gaji(Double Gajibersih,String Status){
        this.Gajibersih = Gajibersih;
        this.Status = Status;
    }

    public Double getGajibersih() {
        return Gajibersih;
    }

    public void setGajibersih(Double Gajibersih) {
        this.Gajibersih = Gajibersih;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
