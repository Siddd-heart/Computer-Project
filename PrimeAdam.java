import java.util.*;
class PrimeAdam
{
    boolean isPrime(int n)
    {
        for(int i=2; i<n/2; i++)
        if(n%i==0)
        return false;
        return true;
    }
    int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
    boolean isAdam(int n)
    {
        int r=reverse(n);
        if((r*r)==reverse(n*n))
        return true;
        return false;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        PrimeAdam obj = new PrimeAdam();
        System.out.println("Enter two numbers m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m>=n)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int f=0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int i=m; i<=n;i++)
        {
            if(obj.isPrime(i) && obj.isAdam(i))
            {
                f++;
                System.out.print(i+" ");
            }
        }
        if(f==0)
        System.out.println("NIL");
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS : " + f);
    }
}