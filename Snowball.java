import java.util.*;
class Snowball
{
    String[] words(String s)
    {
        String Words[]=s.split(" ");
        for(int i=0; i<Words.length; i++)
        {
            Words[i]=Words[i].trim();
            if(i==Words.length-1)
            Words[i]=Words[i].substring(0,Words[i].length()-1);
        }
        return Words;
    }
    boolean snowball(String a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i].length()!=a[i+1].length()-1)
            return false;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Snowball obj = new Snowball();
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        if(".?".indexOf(s.charAt(s.length()-1))==-1)
        {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
            System.exit(0);
        }
        if(obj.snowball(obj.words(s)))
        System.out.println("IT IS A SNOWBALL STRING");
        else
        System.out.println("IT IS NOT A SNOWBALL STRING");
    }
}