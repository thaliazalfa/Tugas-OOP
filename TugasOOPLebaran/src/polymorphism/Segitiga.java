package polymorphism;

public class Segitiga extends BangunDatar{

    float tinggi;
    float alas;

    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float keliling (){
        return this.alas*3;
    }

    float luas(){
        return (this.alas*this.tinggi)/2;
    }
}