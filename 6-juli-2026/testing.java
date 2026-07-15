/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juli;

/**
 *
 * @author Lenovo
 */
public class testing {
    public static void main(String[] args) {
        try {
            // Perulangan for berada sepenuhnya di dalam blok try
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (Exception ex) {
            // Blok catch menangkap exception saat perulangan melewati batas indeks array
            System.out.println("Exception caught!");
        }
    }
}