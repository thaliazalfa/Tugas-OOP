package com.company;
import java.util.Scanner;
public class TugasOOP2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //if-else condition
        int score;

        System.out.print("Masukan score Anda : ");
        score = input.nextInt();

        if (score >= 78){
            System.out.println("Selamat Anda Lulus Tahap Seleksi");
        }else {
            System.out.println("Tetap semangat! Anda telah melakukan yang terbaik.");
        }
        System.out.println(" ");

        //if - else if
        String nama;
        byte nilai;
        System.out.print("Masukan nama anda : ");
        nama = input.next();

        System.out.print("Masukan nilai Anda : ");
        nilai = input.nextByte();

        if (nilai == 78){
            System.out.println("Waah, kamu pinter banget " + nama);
        }else if (nilai <= 78){
            System.out.println("Maaf " + nama + " harus remedial ya");
        }
        else if (nilai >= 78){
            System.out.println("wah " + nama + " jenius bet");
        } else {
            System.out.println("Character yang Anda masukan bukan angka, coba lagi!");
        }
        System.out.println(" ");

        // nested if 
        byte angka1 = 70;
        byte angka2 = 40;
        byte angka3 = 45;
        if (angka1 >= 70 && angka2 >= 40){
            System.out.println("kerja bagus, anda lulus");
            if (angka3 == 45);{
                System.out.println("nilai pas rata-rata");
            }
        }
        
        //Switch
        int umur;
        System.out.print("Masukan angka kurang dari 15 : ");
        umur = input.nextInt();

        switch (umur){
            case 12 :
                System.out.println("Kamu terlalu tua");
                break;
            case 8 :
                System.out.println("OOPSS! kamu terlalu muda!");
                break;
            case 10 :
                System.out.println("Umur kamu pas!");
                break;
        }
        

    }
}
