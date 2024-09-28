import java.util.*;
class Bouncy
{
    boolean isIncreasing(int n)
    {
        String s=""; s=s+n;
        for(int i=1; i<s.length(); i++)
        if(s.charAt(i)<s.charAt(i-1))
        return false;
        return true;
    }
    boolean isDecreasing(int n)
    {
        String s=""; s=s+n;
        for(int i=1; i<s.length(); i++)
        if(s.charAt(i)>s.charAt(i-1))
        return false;
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Bouncy obj = new Bouncy();
        int n=0;
        System.out.println("Enter a number");
        try
        {
            n=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("INVALID INPUT. ENTER A NUMBER");
        }
        if(obj.isIncreasing(n))
        System.out.println(n+" is an Increasing number");
        else if(obj.isDecreasing(n))
        System.out.println(n+" is a Decreasing number"); 
        else
        System.out.println(n+" is a Bouncy number");
    }
}