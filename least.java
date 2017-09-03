import java .io.*;
import java.util.*;
public class least
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] str1=str.split("");
        int a[]=new int[str.length()];
        int k=s.nextInt();
        for(int i=0;i<str.length();i++)
        {
            a[i]=Integer.parseInt(str1[i]);
            
        }
        Arrays.sort(a);
        for(int i=0;i<a.length-k;i++)
        {
            System.out.print(a[i]);
        }
        
        }
}
