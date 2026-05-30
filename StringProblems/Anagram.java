public class Anagram{
    public static void main(String[] args){
        String str = "listen";
        String str1 = "silent";

        if(str.length()!=str1.length()){
            System.out.println("Not a Anagram");
            return;
        }

        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'a']++;
            arr[str.charAt(i)-'a']--;
        }
        for (int i = 0; i<26; i++){
            System.out.println(arr[i]);
        }
    }
}