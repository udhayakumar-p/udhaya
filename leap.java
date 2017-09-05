import java.io.*;
import java.util.*;
class leap
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%4==0)
        {
            System.out.print("Leap Year");
        }
        else
        {
            System.out.print(" Non Leap Year");
        }
    }
}
        
