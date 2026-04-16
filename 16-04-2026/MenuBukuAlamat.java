/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radit160426;

/**
 *
 * @author LAB-SI-PC
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MenuBukuAlamat {

public class BacaString {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menu Buku Alamat");
        System.out.println("1.Memasukan Data");
        System.out.println("2.Menghapus Data");
        System.out.println("3.Menampilkan Seluruh Data");
        System.out.println("4.Update Data");
        
        System.out.print("");
        String teks = dataIn.readLine();
        
        System.out.println("Teks yang dimasukkan: " + teks);
    }
 }
}
