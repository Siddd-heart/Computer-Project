import java.util.*;
class ArmNum
{
    int n,l;    //Data members declaration
    ArmNum(int nn)
    {
        //constructor
        n=nn;
        String s="";
        s+=n;
        l=s.length();
    }
    int sum_pow(int i)
    {
        //recursive function to calculate sum of digits raised to power of length
        if(i>0)
        return (int)Math.pow((i%10),l) + sum_pow(i/10);
        return 0;
    }
    void isArmstrong()
    {
        if(sum_pow(n)==n)
        System.out.println(n + " is an Armstrong number");
        else
        System.out.println(n + " is not an Armstrong number");
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        ArmNum obj = new ArmNum(N);     //Object creation
        obj.isArmstrong();
    }   //end of main
}   //end of class