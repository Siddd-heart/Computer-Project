import java.util.*;
class Vampire
{
    int c =0;
    boolean check(int a, int b, int n)
    {
        String t=""; String u=""; String s="";
        s=s+n; t=t+a; u=u+b;
        if(s.length()/2!=t.length() || s.length()/2!=u.length())
        return false;
        t=t+u; u="";
        for(int i=0; i<t.length(); i++)
        {
            if(s.indexOf(t.charAt(i))==-1)
            return false;
            else
            {
                if(u.indexOf(t.charAt(i))!=-1)
                return false;
                else
                u=u+t.charAt(i);
            }
        }
        return u.equals(t);
    }
    void isVampire(int N)
    {
        String s=""; s+=N;
        if(!(s.length()%2==1 || s.length()==2))
        {
            for(int i=2; i<N/i; i++)
            {
                if(N%i==0)
                {
                    if(check(i, (N/i), N))
                    {
                        System.out.print(N + " ");
                        c++;
                    }
                }    
            }       
        }           
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Vampire obj = new Vampire();
        System.out.println("Enter m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>=n || m<1000 || n<1000 || m>9999 || n>9999)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println("THE VAMPIRE NUMBERS ARE :");
        for(int i=m; i<=n; i++)
        obj.isVampire(i);
        if(obj.c==0)
        System.out.print("NIL");
        System.out.println("\nFREQUENCY OF VAMPIRE NUMBERS IS " + obj.c);        
    }
}