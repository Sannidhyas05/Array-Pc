import java.util.Scanner;

public class Amcat
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(size);
        for(int i=0;i<size;i++)
        {
            do{
                if(arr[i]>0)
                sum += arr[i]%10; 
                arr[i] = arr[i]/10;           
            } while(arr[i]>0);
            System.out.print(sum +"\t");
            sum =0;
        }
    }
}