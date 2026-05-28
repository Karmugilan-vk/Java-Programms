import java.util.Arrays;
public class DescendingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 , 10, 18};
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
