import java.util.*;
class SortSentence
{
    void sortArr(String a[])
    {
        String t;
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j].length()>a[j+1].length())
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                else if(a[j].length()==a[j+1].length())
                {
                    if(a[j].compareTo(a[j+1])>=0) 
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
        }
    }
    String formSent(String a[])
    {
        String t="";
        for(int i=0; i<a.length; i++)
        t+=a[i]+" ";
        return t;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        SortSentence obj = new SortSentence();
        System.out.println("Enter a sentence");
        String s=sc.nextLine().toUpperCase();
        if(".?!".indexOf(s.charAt(s.length()-1))==-1)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println(s);
        s=s.substring(0,s.length()-1);
        String a[]=s.split(" ");
        obj.sortArr(a);
        System.out.println(obj.formSent(a));
    }
}