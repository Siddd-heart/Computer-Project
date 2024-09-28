import java.util.*;
class Disarium
{
    int num, size;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        String s="";
        s+=num;
        size=s.length();
    }
    int sumofDigits(int n, int p)
    {
        if(n>0)
        return (int)Math.pow((n%10),p) + sumofDigits(n/10,p-1);
        return 0;
    }
    void check()
    {
        countDigit();
        if(sumofDigits(num,size)==num)
        System.out.println(num + " is a Disarium number");
        else
        System.out.println(num + " is not a Disarium number");
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N=sc.nextInt();
        Disarium obj = new Disarium(N);
        obj.check();
    }
}