import java.util.*;
class MatRev
{
    int arr[][];
    int m,n;
    MatRev(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + (m*n) + " integers");
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
            arr[i][j]=sc.nextInt();
    }
    int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int r=x%10;
            rev=rev*10+r;
            x/=10;
        }
        return rev;
    }
    void revMat(MatRev P)
    {
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
            this.arr[i][j]=reverse(P.arr[i][j]);
    }
    void show()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        MatRev obj = new MatRev(r,c);
        MatRev ob = new MatRev(r,c);
        obj.fillArray();
        ob.revMat(obj);
        System.out.println("ORIGINAL MATRIX :");
        obj.show();
        System.out.println("MODIFIED MATRIX :");
        ob.show();
    }
}