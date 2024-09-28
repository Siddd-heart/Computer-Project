import java.util.*;
class Hamming
{
    boolean f;
    void primeFactors(int n, int i)
    {
        if(n!=1)
        {
            f=(i<=5)?true:false;
            if(n%i==0)
            {
                if(n==i)
                System.out.print(i);
                else
                System.out.print(i + "*");
                primeFactors(n/i,i);
            }
            else
            primeFactors(n,i+1);
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Hamming obj = new Hamming();
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("NEGATIVE NUMBER ENTERED. INVALID INPUT");
            System.exit(0);
        }
        System.out.print(n + "=");
        obj.primeFactors(n,2);
        System.out.println();
        System.out.println(obj.f?(n+" IS A HAMMING NUMBER."):(n+ " IS NOT A HAMMING NUMBER."));
    }
}