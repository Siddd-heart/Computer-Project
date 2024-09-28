import java.util.*;
class Goldbach
{
    boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        if(n%i==0)
        return false;
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Goldbach obj = new Goldbach();
        System.out.println("Enter an even integer");
        int N=sc.nextInt();
        if(N%2==1)
        {
            System.out.println("INVALID INPUT. NUMBER IS ODD");
            System.exit(0);
        }
        if(N<=9 || N>=50)
        {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE");
            System.exit(0);
        }
        System.out.print("PRIME-PAIRS ARE:");
        for(int i=3; i<=(N/2); i++)
        {
            if((i%2==1) && ((N-i)%2==1) && obj.isPrime(i) && obj.isPrime(N-i))
            {
                System.out.print(i+ ", " + (N-i));
                System.out.print("\n\t \t");
            }
        }
    }
}