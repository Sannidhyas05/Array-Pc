import java.util.Scanner;

public class Repeat
{
    public static boolean check(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt(); 
        }
        System.out.println(check(arr));
    }
}