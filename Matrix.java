import java.util.*;
class Matrix
{
    void sortArr(int a[])
    {
        int i,j,min,t;
        for(i=0; i<a.length-1; i++)
        {
            min=i;
            for(j=i+1; j<a.length; j++)
                if(a[j]<=a[min])
                min=j;
            t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }
    void fillArr(int a[], int b[][])
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j<(n-i))
                b[i][j]=a[j];
                else
                b[i][j]=a[j-(n-i)];
            }
        }
    }
    void display(int a[][], int n)
    {
        System.out.println("FILLED MATRIX :");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N=sc.nextInt();
        if(N<=2 || N>=10)
        {
            System.out.println("MATRIX SIZE OUT OF RANGE");
            System.exit(0);
        }
        int a[]=new int[N];
        Matrix obj = new Matrix();
        System.out.println("Enter elements of the singe-dimensional array");
        for(int i=0; i<N; i++)
        a[i]=sc.nextInt();
        int b[][]=new int[N][N];
        System.out.print("SORTED ARRAY : ");
        obj.sortArr(a);
        for(int i=0; i<N; i++)
        System.out.print(a[i]+ " ");
        System.out.println();
        obj.fillArr(a,b);
        obj.display(b,N);
    }
}