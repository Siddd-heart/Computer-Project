import java.util.*;
class CircularMatrix
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 'N'");
        int N=sc.nextInt();
        int arr[][]=new int[N][N];
        int rowst=0, colst=0, rowend=N, colend=N, i, x=1;
        while(rowst<rowend && colst<colend)
        {
            for(i=colst; i<colend; i++)
            arr[rowst][i]=x++;
            rowst++;
            for(i=rowst; i<rowend; i++)
            arr[i][colend-1]=x++;
            colend--;
            for(i=colend-1; i>=colst; i--)
            arr[rowend-1][i]=x++;
            rowend--;
            for(i=rowend-1; i>=rowst; i--)
            arr[i][colst]=x++;
            colst++;
        }
        System.out.println("Circular matrix :");
        for(i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}