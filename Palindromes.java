import java.util.*;
class Palindromes
{
    int cons(String s)
    {
        int c=1;
        for(int i=s.length()-1; i>0;i--)
            if(s.charAt(i)==s.charAt(i-1))
            c++;
            else 
            break;
        return c;
    }
    String process(String s)
    {
        String t=""; t+=s;
        int i=s.length()-1-cons(s);
        while(!isPalindrome(t))
        t=t+s.charAt(i--);
        return t;
    }
    boolean isPalindrome(String s)
    {
        for(int i=0; i<s.length()/2; i++)
        if(s.charAt(i)!=s.charAt(s.length()-1-i))
        return false;
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Palindromes obj = new Palindromes();
        System.out.println("Enter a sentence");
        String s=sc.nextLine().toUpperCase();
        if(".?!".indexOf(s.charAt(s.length()-1))==-1)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println(s);
        StringTokenizer st = new StringTokenizer(s," .?!");
        while(st.hasMoreTokens())
        System.out.print (obj.process(st.nextToken()) + " ");
        System.out.println();
    }
}