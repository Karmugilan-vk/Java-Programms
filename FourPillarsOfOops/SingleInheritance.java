package FourPillarsOfOops;

class A{
    String name;
    void display() {
        System.out.println(name);
    }
    void show() {
        System.out.println("Nothing");
    }
}

class B extends A {
    void hide() {
        System.out.println("Hii");
        show();
        display();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.name = "kaushik";
        obj.hide();
        A obj1 = new A();
        obj1.name = "kar";
        obj1.display();
        obj1.show();
    }
}