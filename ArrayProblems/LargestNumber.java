public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 12, 13, 15, 18};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
} 