import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(Character.isLetter(c))
        {
        if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u')
        {
            System.out.print("Character is Vowel");
        }
        else if(c!='a'||c!='i'||c!='o'||c!='e'||c!='u')
        {
            System.out.print("Character is consonant");
        }
        }
    }
}
