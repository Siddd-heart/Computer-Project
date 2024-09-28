import java.util.*;
class Trans
{
    int arr[][]; int m;
    Trans(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array");
        for(int i=0; i<m; i++)
            for(int j=0; j<m; j++)
            arr[i][j]=sc.nextInt();
    }
    void transpose()
    {
        int t;
        for(int i=1; i<m; i++)
        {
            for(int j=0; j<i; j++)
            {
                t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
    }
    void display()
    {
        System.out.println("Original Array : ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
        transpose();
        System.out.println("Transposed matrix : ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the matrix : ");
        int n = sc.nextInt();
        Trans obj = new Trans(n);
        obj.fillArray();
        obj.display();
    }
}