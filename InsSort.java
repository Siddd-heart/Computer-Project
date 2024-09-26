import java.util.*;
class InsSort
{
    int arr[];
    int size;
    InsSort(int s)
    {
        size=s;
        arr=new int[size];
    }
    void getArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++)
        arr[i]=sc.nextInt();
    }
    void insertionSort()
    {
        int i,j,temp;
        for(i=1; i<size; i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp>arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    double find()
    {
        int c=0; int s=0;
        for(int i=0; i<size; i++)
        {
            if(arr[i]%2==1)
            {
                c++;
                s+=arr[i];
            }
        }
        return s/c;
    }
    void display()
    {
        System.out.println("Array in descending order");
        for(int i=0; i<size; i++)
        System.out.println(arr[i] + " ");
        System.out.println("Average of odd elements = " + find());
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int s=sc.nextInt();
        InsSort obj = new InsSort(s);
        obj.getArray();
        obj.insertionSort();
        obj.display();
    }
}