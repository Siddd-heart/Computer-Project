import java.util.*;
class Lucky
{
    void display(int a[])
    {
        for(int i=0; i<a.length; i++)
        System.out.print(a[i] + " ");      
        System.out.println();
    }
    int[] buildArr(int a[], int n)
    {
        int arr[] = new int[a.length-(a.length/n)];
        int x=0;
        for(int i=0; i<a.length; i++)
        {
            if((i+1)%n==0)
            continue;
            arr[x++]=a[i];
        }
        return arr;
    }
    void lucky(int n)
    {
        int a[]=new int[n];
        for(int i=1; i<=n; i++)
        a[i-1]=i;
        int t=2;
        while(n>=t)
        {
            a=buildArr(a,t);
            n=n-(n/t);
            t++;
        }
        display(a);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Lucky obj = new Lucky();
        System.out.print("N = ");
        int N=sc.nextInt();
        if(N<1 || N>50)
        {
            System.out.println("NUMBER OUT OF RANGE. INVALID ENTRY");
            System.exit(0);
        }
        System.out.println("LUCKY NUMBERS LESS THAN " + N + " ARE :");
        obj.lucky(N);
    }
}