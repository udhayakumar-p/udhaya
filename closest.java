import java.util.*;
public class closest
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int[] arr=new int[l];
        int max=9999;
        int d=9999;
        int n=0,m=0;
        for(int i=0;i<l;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int j=0;j<l;j++)
        {
            for(int k=j;k<l;k++)
            {
                if((arr[k]+arr[j])<max && j!=k)
                {
                    max=Math.abs(arr[j]+arr[k]);
                    if(Math.abs(max)-0<d)
                    {
                        d=max;
                    n=arr[j];
                    m=arr[k];
                }
            }
        }
        }
        System.out.println(n+","+m);
}
}

