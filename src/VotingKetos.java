
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class VotingKetos {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("=== Program Voting Ketua OSIS ===");
        System.out.println("Kandidat: A dan B");
        System.out.println("Ketik 'selesai' untuk mengakhiri pemungutan suara.\n");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine().trim();

            if (pilihan.equalsIgnoreCase("selesai")) {
                break;
            }

            if (pilihan.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (pilihan.equalsIgnoreCase("B")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau 'selesai'.");
            }
        }

        System.out.println("\n=== HASIL VOTING ===");
        System.out.println("Total Suara Kandidat A: " + suaraA);
        System.out.println("Total Suara Kandidat B: " + suaraB);
    }
}

