import java.util.*;
class CaeserCipher
{
    String cipher(String s)
    {
        String t="";
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                if(Character.isLowerCase(s.charAt(i)))
                {
                    if((int)s.charAt(i)>109)
                    t+= (char)(s.charAt(i)-13);
                    else
                    t+= (char)(s.charAt(i)+13);
                }
                else if(Character.isUpperCase(s.charAt(i)))
                {
                    if((int)s.charAt(i)>77)
                    t+= (char)(s.charAt(i)-13);
                    else
                    t+= (char)(s.charAt(i)+13);
                }
            }
            else
            t+= s.charAt(i);
        }
        return t;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CaeserCipher obj = new CaeserCipher();
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        if(s.length()<=3 || s.length()>=100)
        {
            System.out.println("INVALID LENGTH");
            System.exit(0);
        }
        System.out.println("The cipher text is:");
        System.out.println(obj.cipher(s));
    }
}