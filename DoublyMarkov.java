import java.util.*;
class DoublyMarkov
{
    void input(double a[][], int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
            a[i][j]=sc.nextDouble();
    }
    void display(double a[][], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    boolean rowSum(double a[][], int n)
    {
        double sum=0;
        for(int i=0; i<n; i++)
        {
            sum=0;
            for(int j=0; j<n; j++)
            sum+=a[i][j];
            if(sum!=1)
            return false;
        }
        return true;
    }
    boolean columnSum(double a[][], int n)
    {
        double sum=0;
        for(int i=0; i<n; i++)
        {
            sum=0;
            for(int j=0; j<n; j++)
            sum+=a[j][i];
            if(sum!=1)
            return false;
        }
        return true;
    }
    boolean check(double a[][], int n)
    {
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
            if(a[i][j]<0)
            return false;
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        DoublyMarkov obj = new DoublyMarkov();
        System.out.println("Enter the order of the matrix");
        int n = sc.nextInt();
        if(n<3 || n>9)
        {
            System.out.println("SIZE IS OUT OF RANGE. INVALID ENTRY.");
            System.exit(0);
        }
        double M[][]= new double[n][n];
        obj.input(M,n);
        if(obj.check(M,n)==false)
        {
            System.out.println("NEGATIVE NUMBERS ENTERED. INVALID ENTRY");
            System.exit(0);
        }
        System.out.println("FORMED MATRIX:");
        obj.display(M,n);
        if(obj.rowSum(M,n) && obj.columnSum(M,n))
        System.out.println("IT IS A DOUBLY MARKOV MATRIX");
        else
        System.out.println("IT IS NOT A DOUBLE MARKOV MATRIX");
    }   
}