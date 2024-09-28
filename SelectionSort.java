import java.util.*;
class SelectionSort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int min;
        System.out.println("Original array ");
        for(int i=0; i<n; i++)
        System.out.println(a[i]);
        for(int i=0; i<(n-1); i++)
        {
            min=i;
            for(int j=i+1; j<n; j++)
            if(a[j]<a[min])
            min=j;
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("Array in ascending order : ");
        for(int i=0; i<n; i++)
        System.out.println(a[i]);
    }
}