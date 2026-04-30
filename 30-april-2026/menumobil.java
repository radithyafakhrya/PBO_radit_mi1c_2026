/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
import java.io.*;
public class menumobil {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan ID Sewa: ");
            String id = br.readLine();

            System.out.print("Masukkan Nama Penyewa: ");
            String nama = br.readLine();

            System.out.print("Masukkan Jenis Mobil (Avanza/Innova/Fortuner): ");
            String jenis = br.readLine();

            System.out.print("Masukkan Lama Sewa (hari): ");
            int lama = Integer.parseInt(br.readLine());

            maret302026 sewa = new maret302026(id, nama, jenis, lama);
            sewa.hitungTotal();
            sewa.tampilkanData();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        } catch (NumberFormatException e) {
            System.out.println("Input angka tidak valid.");
        }
    }
}

