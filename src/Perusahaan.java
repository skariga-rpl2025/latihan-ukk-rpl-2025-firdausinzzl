/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class Perusahaan {
     public static void main(String[] args) {

        Karyawan kry = new Karyawan();

        kry.setNIP("K008");
        kry.setNama("Lee Jeno");
        kry.setDivisi("Marketing");
        
        System.out.println("=== Data Karyawan ===");
        System.out.println("NIP     : " + kry.getNIP());
        System.out.println("Nama    : " + kry.getNama());
        System.out.println("Divisi  : " + kry.getDivisi());
    }
}
