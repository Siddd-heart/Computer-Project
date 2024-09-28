import java.util.*;
class Decode
{
    boolean isValid(String s)
    {
        for(int i=0; i<s.length(); i++)
        if(!Character.isDigit(s.charAt(i)))
        return false;
        return true;
    }
    String decode(String s)
    {
        String temp1="", temp2=""; int x=0;
        for(int i=0; i<s.length(); i++)
        {
            temp1=temp1+s.charAt(i);
            x=Integer.parseInt(temp1);
            if((x>=65 && x<=90) || x==32 || (x>=97 && x<=122))
            {
                temp2=temp2+(char)x;
                temp1="";
            }
        }
        temp1="";
        for(int i=0; i<temp2.length()-1; i++)
        {
            if(temp2.substring(i,i+2).equals("  "))
            {
                temp1=temp1+' ';
                i++;
            }
            else
            temp1=temp1+temp2.charAt(i);
            if(i==temp2.length()-2)
            temp1=temp1+temp2.charAt(temp2.length()-1);
        }
        return temp1;
    }
    String cases(String s)
    {
        String temp="";
        temp=temp+Character.toUpperCase(s.charAt(0));
        for(int i=1; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                temp=temp+" " + Character.toUpperCase(s.charAt(i+1));
                i++;
            }
            else
            {
                temp=temp+Character.toLowerCase(s.charAt(i));
            }
        }
        return temp;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Decode obj = new Decode();
        System.out.print("CODE :");
        String s=sc.next();
        if(obj.isValid(s))
        System.out.println(obj.cases(obj.decode(s)));
        else
        System.out.println("Invalid Input");
    }
}