import java.io.*;
import java.util.*;
class large
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[3];
        int count=0;
        for(int i=0;i<3;i++)
        {
            a[i]=s.nextInt();
            if(a[i]>count)
            {
                count=a[i];
            }
            
        }
        System.out.print(count);
       
    }
}

