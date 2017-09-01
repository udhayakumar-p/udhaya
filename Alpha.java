import java.io.*;
import java.util.*;
class Alpha
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(Character.isLetter(c))
        {
       
                   System.out.print("Characteris Alphabet");
        }
        else 
    {
            System.out.print("Character is not Alphabet");
        
        }
    }
}
