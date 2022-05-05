package polymorphism;

public class Lingkaran extends BangunDatar{
    float r;
    public Lingkaran(float r){
        this.r = r;
    }

    float keliling (){
        return (float) (Math.PI*this.r*this.r);
    }

    float luas (){
        return (float) (2*Math.PI*this.r);
    }
}