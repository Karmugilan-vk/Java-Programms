public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        int sq = n*n;
        int temp=n;
        while (temp!=0){
            if (temp%10 != sq%10){
                System.out.println(n+" is not an Automorphic Number.");
                return;
            }
            temp/=10;
            sq/=10;
        }
        System.out.println(n+" is an Automorphic Number.");
    }
}
