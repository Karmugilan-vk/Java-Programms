package FourPillarsOfOops;

class W {
    int add (int a, int b){
        return a + b;
    }

    void add (int a, int b, int c){
        System.out.println( a + b + c) ;
    }

    void add (int a, String b) {
        System.out.println(a + " " + b);
    }
}

public class PolymorphismEg1 {
    public static void main(String[] args) {
        W obj = new W();
        obj.add(5, 10, 15);
        System.out.println(obj.add(5, 10));
        obj.add(5, "kaushik");
    }
}