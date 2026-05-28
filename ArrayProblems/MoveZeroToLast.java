import java.util.Arrays;
public class MoveZeroToLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 5};
        int index = 0;
        int n  = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < n) {
            arr[index] = 0;
            index++;

        }

        System.out.println(Arrays.toString(arr));
    }
}
