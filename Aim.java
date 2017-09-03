import java.util.*;
public class Aim
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int t=s.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<h;k++)
        arr[k]=s.nextInt();
        for(int i=0;i<h;i++)
        {
           for(int j=i;j<h;j++)
           {
               if((arr[i]+arr[j])==t && i!=j)
               {
                   System.out.println(arr[i]+","+arr[j]);
                   System.exit(0);
               }
           }
        }
    }
}


