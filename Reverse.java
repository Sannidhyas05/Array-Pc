import java.util.*;

public class Reverse {
    public static int []reverseSubArray(int[] arr, int l, int r) {
        for(int i=l ; i<=r ; i++)
        {
            if(l==r)
            {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[r-1];
            arr[r-1] = temp;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(reverseSubArray(arr, 2, 4));
    }
}
