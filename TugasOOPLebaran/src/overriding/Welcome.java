package overriding;

class Parent{
    String name;

    public void display (String jabatan){
        System.out.println("Bonjour, I am " + this.name + ". I am here as a " + jabatan);
    }
}

class Child extends Parent {
    String name;

    public void display (String jabatan){
        System.out.println("Hello, I am " + this.name + ". I am here as your " + jabatan);
    }
}
public class Welcome {
    public static void main(String[] args) {
        var parent = new Parent();
        parent.name= "Jennifer";
        parent.display("CEO");

        var child = new Child();
        child.name = "Aiden";
        child.display("Colleague");
    }
}


