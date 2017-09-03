import java.io.*;
import java.util.*;
class subset
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a1=new int[n];
       for(int i=0;i<n;i++)
        {
          a1[i]=s.nextInt();  
         
        }        
     int m=s.nextInt();
     int a2[]=new int[m];
        for(int i=0;i<m;i++)
        {
          a2[i]=s.nextInt();
          }
        int count=0;
            for(int k=0;k<n;k++)
            
            {
                for(int j=0;j<m;j++)
                {
                  
                if(a1[k]==a2[j]) 
                {
                    count++;
                    
                }
                else
                {
                    continue;
                   
                }
                
                }
            }
               if(count==m)
               {
                   System.out.print("a1[] is subset of a2[]");
               }
               else
               {
                   System.out.print("a1[] is not subset of a2[]");
               }
               
            
        }
        }

      
