import java.util.*;
class Cipher
{
    String alpha="";
    void updateAlpha(String s)
    {
        //Updating the alphabet
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            if(alpha.indexOf(s.charAt(i))==-1)
            alpha+=s.charAt(i);
        }
        //Inserting all other characters
        for(char c='A'; c<='Z'; c++)
        if(alpha.indexOf(c)==-1)
        alpha+=c;
    }
    String decode(String s)
    {
        String A="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String t="";
        for(int i=0;i<s.length(); i++)
        {
            //Forming the decoded string
            if(Character.isLetter(s.charAt(i)))
            t+=A.charAt(alpha.indexOf(s.charAt(i)));
            else
            t+=s.charAt(i);
        }
        return t;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cipher obj = new Cipher();
        System.out.println("ENTER KEYWORD");
        String s=sc.nextLine();
        obj.updateAlpha(s);
        System.out.println("ENTER TEXT TO BE DECODED:");
        String t=sc.nextLine();
        if(!t.equals(t.toUpperCase()))
        System.out.println("INVALID INPUT");
        else
        System.out.println("DECODED TEXT : " + obj.decode(t));
    }
}