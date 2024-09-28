import java.util.*;
class Adder
{
    int a[] = new int[2];
    Adder()
    {
        a[0]=a[1]=0;
    }
    void readtime()
    {
        Scanner at = new Scanner(System.in);
        System.out.println("Enter the time :");
        System.out.print("HOURS : ");
        a[0]=at.nextInt();
        System.out.print("MINUTES : ");
        a[1]=at.nextInt();
        if(a[1]>60)
        {
            System.out.println("INVALID TIME ENTERED. MINUTES MUST BE LESS THAN 60");
            System.exit(0);
        }
    }
    void addtime(Adder X, Adder Y)
    {
        a[1]=X.a[1] + Y.a[1];
        a[0]=X.a[0]+Y.a[0];
        if(a[1]>60)
        {
            a[0]=a[0]+a[1]/60;
            a[1]=a[1]%60;
        }
    }
    void disptime()
    {
        System.out.println("Hours = " + a[0] + "\nMinutes = " + a[1]);
    }
    public static void main()
    {
        Adder obj = new Adder();
        Adder P = new Adder();
        Adder Q = new Adder();
        P.readtime();
        Q.readtime();
        obj.addtime(P,Q);
        System.out.println("Added time :");
        obj.disptime();
    }
}