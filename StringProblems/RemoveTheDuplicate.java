public class RemoveTheDuplicate {
    public static void main(String[] args) {
        String str = "Hello";
        for(int i = 0; i < str.length(); i++){
            boolean b = false;
            for(int j =i+1; j< str.length();j++){
                if(str.charAt(i) == str.charAt(j)) {
                    b = true;
                    break;
                }
            }
            if(!b){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    
}
