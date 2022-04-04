
package com.thalia.program;

class Personalization{
    String nama;
    String hobi;
    Byte umur;

}

public class LatihanPertama {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Personalization person1 = new Personalization();
        person1.nama = "Thalia Zalfa";
        person1.umur = 18;
        person1.hobi = "rap musik hip-hop";
        
        
        System.out.println("Nama : " + person1.nama);
        System.out.println("Umur : " + person1.umur);
        System.out.println("Hobi : " + person1.hobi);
        
        
        
    }
    
}
