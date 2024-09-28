import java.util.*;
class Sort
{
    int ar[]; int item;
    void inpdata()
    {
        Scanner sc=new Scanner(System.in);
        ar=new int[8];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<8; i++)
        ar[i]=sc.nextInt();
    }
    void bubSort()
    {
        int i,j,t;
        for(i=0; i<7; i++)
        {
            for(j=0; j<8-i-1; j++)
            {
                if(ar[j]>=ar[j+1])
                {
                    t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        System.out.println("Sorted array in ascending order: ");
        for(i=0; i<8; i++)
        System.out.println(ar[i]);
    }
    void binSearch()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        item = sc.nextInt();
        int lb=0, ub=8-1, mid=0, f=0;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(ar[mid]<item)
            lb=mid+1;
            else if(ar[mid]>item)
            ub=mid-1;
            else if(ar[mid]==item)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println(item + " found \nPosition : " + mid);
        else
        System.out.println(item + " is not present in the given array");
    }
    public static void main()
    {
        Sort obj = new Sort();
        obj.inpdata();
        obj.bubSort();
        obj.binSearch();
    }
}