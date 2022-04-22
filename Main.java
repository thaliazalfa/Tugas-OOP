package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Thalia cantik siapa yang punya?");
        System.out.println("Kita belajar programming");

        String namaOrang;
        namaOrang = "jemima";
        System.out.println("Nama pengguna " + namaOrang);

        int angka = 22;
        int angka2 = 35;
        int jumlah = angka+angka2;
        System.out.println(jumlah);

        double desimal = 89.7;
        System.out.println("angka desimal " + desimal);

        boolean apakahMasuk = true;
        System.out.println("apakah berhasil " + apakahMasuk);

        int nilai = 78;
        if(nilai >= 78){
            System.out.println("Anda lulus ujian");
        } else{
            System.out.println("Anda remedial");
        }

        if(nilai>=80){
            System.out.println("Anda lulus tahap seleksi");
        }else if(nilai >=50){
            System.out.println("Maaf anda harus mengulang tahap seleksi");
        }else if(nilai == 49){
            System.out.println("Mohon maaf, anda kurang beruntung");
        }else {
            System.out.println("Tetap semangat, anda telah melakukan yang terbaik");
        }

        System.out.println();

        if(namaOrang.equals("namira")){
            System.out.println("selamat kamu mendapat bonus");
        }else{
            System.out.println("Maaf kamu tidak bisa menikmati bonus");
        }

        if( apakahMasuk == false){
            System.out.println("Maaf anda kurang beruntung");
        } else {
            System.out.println("Selamat anda berhasil masuk");
        }

        System.out.println("bobo dulu guys");
    }
}
