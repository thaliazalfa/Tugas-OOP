package polymorphism;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi rectangle = new Persegi(5);
        Segitiga triangle = new Segitiga(9,10);
        Lingkaran circumference = new Lingkaran(28);

        bangunDatar.keliling();
        bangunDatar.luas();

        System.out.println("Keliling persegi : " + rectangle.keliling());
        System.out.println("Luas persegi : " + rectangle.luas());
        System.out.println("\nKeliling segitiga : " + triangle.keliling());
        System.out.println("Luas segitia : " + triangle.luas());
        System.out.println("\nKeliling lingkaran : " + circumference.keliling());
        System.out.println("Luas lingkaran : " + circumference.luas());
    }
}