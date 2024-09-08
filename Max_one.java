public class Max_one {
    public static int func(int arr[])
    {
        int sum = 0; 
        int maxsum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(arr[i] == 0)
            {
                sum = 0;
            }
            if(sum >= maxsum)
            {
                maxsum = sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,1,0,1,1,1,1};
        System.out.println(func(arr));
    }
}
