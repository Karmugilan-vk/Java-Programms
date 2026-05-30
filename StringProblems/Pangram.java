public class Pangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        boolean ispangram = true;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                ispangram = false;
                break;
            }
        }
        if (ispangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
