import java.util.*;
class Number
{
    int n;
    Number(int nn)
    {
        n=nn;
    }
    int factorial(int a)
    {
        int f=1;
        for(int i=1; i<=a; i++)
        f*=i;
        return f;
    }
    void display()
    {
        System.out.println("Number of terms = " + n);
    }
}