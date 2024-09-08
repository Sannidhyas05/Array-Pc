import java.util.Scanner;

public class Rainwater {
     public static int Leftmax(int height[])
     {
        int trappedwater = 0;
        int lmax[] = new int[height.length];
        lmax[0] = height[0];
        for(int i=1;i<height.length; i++ )
        {
            lmax[i] = Math.max(height[i], height[i-1]);
        }
        

        int rmax[] = new int[height.length];
        rmax[height.length-1] = height[height.length-1];
        for(int i=height.length-1; i>=0; i--)
        {
            rmax[i] = Math.max(height[i], height[i+1]);
        }


        for(int i=0; i<height.length; i++)
        {
            int waterlevel=Math.min(lmax[i], rmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int height[] = new int[size];
        for(int i=0; i<height.length;i++)
        {
            height[i] = sc.nextInt(); 
        }
        System.out.println(Leftmax(height));
     }
}
