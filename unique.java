import java.io.*;
import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();  
        }
    
            for(int k=0;k<n;k++)
            
            {
                for(int j=0;j<n;j++)
                {
                   if(k!=j)
                   { 
                
                if(arr[k]!=arr[j]) 
                {
                    c=1;
                }
                else
                {
                    c=0;
                    break;
                }
                }
                }
               if(c==1)
               {
                   System.out.print(arr[k]);
               }
            }
        }
        }

      
