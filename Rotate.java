import java.util.*;
class Rotate
{
    int [][]rotate(int a[][], int M, int N)
    {
        int arr[][]=new int[N][M];
        for(int i=0; i<M; i++)
            for(int j=0; j<N; j++)
            arr[j][M-i-1]=a[i][j];
        return arr;
    }
    void display(int a[][], int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    int sumOdd(int a[][], int M, int N)
    {
        int sum=0;
        for(int i=0; i<M; i++)
            for(int j=0; j<N; j++)
                if(a[i][j]%2==1)
                sum+=a[i][j];
        return sum;
    }
    void input(int a[][], int M, int N)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0; i<M; i++)
             for(int j=0; j<N; j++)
             a[i][j]=sc.nextInt();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rotate obj = new Rotate();
        System.out.print("M = ");
        int M=sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        if(!(2<=M && 2<=N && 10>M && 10>N))
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int a[][] = new int[M][N];
        obj.input(a,M,N);
        System.out.println("ORIGINAL MATRIX : ");
        obj.display(a,M,N);
        System.out.println("ROTATED MATRIX (270 DEGREE ANTI-CLOCKWISE)");
        obj.display(obj.rotate(a,M,N), N,M);
        System.out.println("SUM OF ODD ELEMENTS IS : " + obj.sumOdd(a,M,N));
    }
}