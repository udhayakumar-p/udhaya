import java.io.*;
import java.util.*;
class repeated
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
                       
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(b[i]==b[j] && i!=j)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
