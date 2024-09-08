class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        int smallnum = Integer.MAX_VALUE;
        int count = 0;
        do{
            smallnum = Integer.MAX_VALUE;
            // SMALLEST value
            for(int i=0; i<n; i++)
            {
                if(arr[i]<smallnum)
                {
                    smallnum = arr[i];
                }
            }
            // swapping 
            for(int i=0; i<n; i++)
            {
                if(arr[i]==smallnum)
                {
                    int temp = arr[n-1];
                    arr[n-1] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            count ++;
            n--;
        }while(count!=k);
        return smallnum;
    }
}
