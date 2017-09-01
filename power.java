import java.io.*;
import java.util.*;
class power
{
    public static void main(String args[])
    
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int i=s.nextInt();
        System.out.println("Enter Power");
        int d=s.nextInt();
         System.out.print((int)Math.pow(i,d));
            
    }
}
