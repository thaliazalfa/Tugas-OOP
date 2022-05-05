package inheritance;

class Introduction {
    public void tittle(){
        System.out.println("   ===  INTRODUCTION IN FRANCE  ===   ");
    }
}

class ShowMine extends Introduction{
    String name;
    Byte umur;

    void myName(String name){
        System.out.println("Salut " + this.name + "! Je m'appelle " + name);
    }

    void myAge(Byte umur){
        System.out.println("Maintenant, j'ai " + umur + " ans et j'aurai " + this.umur + " ans dans 8 jours.");
    }

    void myAddress(String alamat){
        System.out.println("J'habite à " + alamat + " depuis ma naissance");
    }
    void myMethode(){
        super.tittle();
        var intro1 = new ShowMine();
        intro1.name = "Sannie";
        intro1.myName("Thalia");
        intro1.umur = 19;
        intro1.myAge((byte) 18);
        intro1.myAddress("Jakarta");

    }

}
public class Perkenalan {

    public static void main(String[] args) {
        ShowMine display = new ShowMine();
        display.myMethode();
    }
}
