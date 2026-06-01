package Methods;

public class TimePalindrome {
    static boolean ispalindrome(int h, int m){
        int h1 = h / 10;
        int h2 = h % 10;
        int m1 = m / 10;
        int m2 = m % 10;
        return h1 == m2 && h2 == m1;
    }

    static int palindrome(int h, int m){
        int min = 0;
        while(!ispalindrome(h, m)) {
            m++;
            if(m == 60) {
                m = 0;
                h = (h + 1) % 24;
            }
            min++;
        }
        return min;
    }

    public static void main(String[] args) {
        String str = "05:39";
        int h = Integer.parseInt(str.substring(0, 2));
        int m = Integer.parseInt(str.substring(3, 5));
        System.out.println(palindrome(h, m));
    }
}