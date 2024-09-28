import java.util.*;
class Mix
{
    String wrd; 
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd=as.next().toUpperCase();
        len=wrd.length();
    }
    void mix_word(Mix P, Mix Q)
    {
        int min=(P.len<Q.len)?P.len:Q.len;
        for(int i=0; i<min; i++)
        wrd=wrd+ P.wrd.charAt(i)+Q.wrd.charAt(i);
        if(P.len>Q.len)
        wrd=wrd+P.wrd.substring(min);
        else
        wrd=wrd+Q.wrd.substring(min);
    }
    void display()
    {
        System.out.println(wrd);
    }
    public static void main()
    {
        Mix word1 = new Mix();
        Mix word2 = new Mix();
        Mix mixedwrd = new Mix();
        word1.feedword();
        word2.feedword();
        mixedwrd.mix_word(word1, word2);
        System.out.println("Mixed Word :");
        mixedwrd.display();
    }
}