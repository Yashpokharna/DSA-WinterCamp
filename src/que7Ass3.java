import java.util.Arrays;

public class que7Ass3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = arr[0];
        int i;
        for (i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = k;
        System.out.println(Arrays.toString(arr));
    }
}
