import java.util.Scanner;

public class Profit {
    public static int price(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                index = i;
            }
        }
        for(int i=index; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int profit = max-min;
        if(profit>=0)
        {
            return profit;
        }
        else
        {
            return 0;
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(price(arr));
    }

}
