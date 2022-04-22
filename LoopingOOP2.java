package com.company;

public class LoopingOOP2 {
    public static void main(String[] args) {

        //for looping
        for (int i = 1; i<=3; i++){
            System.out.println( "urutan ke-" + i );

        }

        // while looping

        int u = 0;
        while (u < 5) {
            System.out.println(u);
            u++;
        }

        //do while looping
        int urutan = 1;
        do {
            System.out.println("pemenang ke-" + urutan);
            urutan++;
        }
        while (urutan < 5);
    }
}
