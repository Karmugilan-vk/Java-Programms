package Methods;

//with parameter and with return type
public class MethodExample {
    static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static  void main(String[] args){
        int a = 10;
        int b = 20;
        add(a,b);
    }
}
