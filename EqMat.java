import java.util.*;
class EqMat
{
    int a[][];
    int m, n;
    EqMat(int mm, int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readarray()
    {
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<m; i++)
            for(int j=0; j<n; j++)
            a[i][j]=sc.nextInt();
    }
    int check(EqMat P, EqMat Q)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            if(P.a[i][j] != Q.a[i][j])
            return 0;
        }
        return 1;
    }
    void print()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the order of the matrices :");
        System.out.print("No. of rows = ");
        int a=as.nextInt();
        System.out.print("No. of columns = ");
        int b=as.nextInt();
        EqMat Matrix1 = new EqMat(a,b);
        EqMat Matrix2 = new EqMat(a,b);
        System.out.println("Enter the elements of first matrix");
        Matrix1.readarray();
        System.out.println("Enter the elements of second matrix");
        Matrix2.readarray();
        System.out.println("Matrix 1 :");
        Matrix1.print();
        System.out.println("Matrix 2 :");
        Matrix2.print();
        if(Matrix1.check(Matrix1, Matrix2)==1)
        System.out.println("THE ENTERED MATRICES ARE EQUAL");
        else
        System.out.println("THE ENTERED MATRICES ARE UNEQUAL");
    }
}