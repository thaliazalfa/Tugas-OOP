package polymorphism;

public class Persegi extends BangunDatar{
    float sisi;

    public Persegi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        return this.sisi*sisi;
    }

    @Override
    public float keliling(){
        return this.sisi*4;
    }
}