import java.io.*;
import java.util.*;
class natural
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0)
        {
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum=sum+i;
            
        }
        System.out.print(sum);
        }
        System.out.print("Not in Natural");
        
    }
}
