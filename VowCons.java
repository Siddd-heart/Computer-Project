import java.util.*;
class VowCons
{
    int countVow(String s)
    {
        String v="AEIOU";
        int c=0;
        for(int i=0; i<s.length(); i++)
        c=(v.indexOf(s.charAt(i))!=-1)?c+1:c;
        return c;
    }
    int countCons(String s)
    {
        String v="AEIOU";
        int c=0;
        for(int i=0; i<s.length(); i++)
        c=(v.indexOf(s.charAt(i))!=-1)?c:c+1;
        return c;
    }
    void display(String s)
    {
        String a[] =s.split(" ");
        a[a.length-1]=a[a.length-1].substring(0,a[a.length-1].length()-1);
        System.out.println("WORD\t\tCOUNT");
        for(int i=0; i<a.length; i++)
        {
            int v=countVow(a[i]);
            int c=countCons(a[i]);
            System.out.print(a[i] + "\t\t");
            for(int j=1; j<=v; j++)
            System.out.print("V");
            System.out.println();
            for(int j=0; j<a[i].length(); j++)
            System.out.print(" ");
            System.out.print("\t\t");
            for(int j=1; j<=c; j++)
            System.out.print("C");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        VowCons obj = new VowCons();
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        if(".?!".indexOf(s.charAt(s.length()-1))==-1)
        {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
            System.exit(0);
        }
        s=s.toUpperCase();
        obj.display(s);
    }
}