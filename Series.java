import java.util.*;
class Series extends Number
{
    int sum;
    Series(int nn)
    {
        super(nn);
        sum=0;
    }
    void calSum()
    {
        for(int i=1; i<=n; i++)
            sum+=factorial(i);
    }
    void display()
    {
        super.display();
        System.out.println("Sum of series = " + sum);
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the number of terms of series");
        int N=as.nextInt();
        Series obj = new Series(N);
        obj.calSum();
        obj.display();
    }
}