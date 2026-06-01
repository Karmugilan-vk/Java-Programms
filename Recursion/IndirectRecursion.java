package Recursion;

public class IndirectRecursion {
    static void method1(int n) {
        if(n > 0) {
            System.out.println(n + " ");
            method2(n - 1);
        }
    }

    static void method2(int n) {
        if (n > 0) {
            System.out.println("hiii..!!");
            method1(n - 1);
        }
    }

    public static void main(String[] args){
        method1(5);
    }
}
