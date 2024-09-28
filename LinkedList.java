import java.util.*;
class LinkedList
{
    Node start;
    void create()
    {
        Scanner as = new Scanner(System.in);
        start = new Node();
        Node ptr, temp;
        System.out.println("Enter data for first node");
        start.data=as.nextInt();
        start.link=null;
        ptr=start;
        System.out.print("Enter the number of nodes to be created : ");
        int N=as.nextInt();
        for(int i=1; i<=(N-1); i++)
        {
            temp=new Node();
            System.out.println("Enter data for node");
            temp.data=as.nextInt();
            temp.link=null;
            ptr.link=temp;
            ptr=temp;
            temp=null;
        }
        System.out.println("Linked List created.");
        ptr=null;
    }
    void insertBeg(int x)
    {
        Node temp = new Node();
        temp.data=x;
        temp.link=start;
        start=temp;
        temp=null;
    }
    void insertEnd(int x)
    {
        Node temp = new Node();
        temp.data=x;
        temp.link=null;
        Node ptr=start;
        while(ptr.link!=null)
        ptr=ptr.link;
        ptr.link=temp;
        ptr=null;
        temp=null;
    }
    void insertMiddle(int x, int N)
    {
        Node temp = new Node();
        temp.data=x;
        temp.link=null;
        Node ptr=start;
        int count=1;
        while(count<N)
        {
            ptr=ptr.link;
            count++;
        }
        temp.link=ptr.link;
        ptr.link=temp;
        ptr=null;
        temp=null;
    }
    void delete(int N)
    {
        Node ptr=start;
        Node ptr1=start;
        int count=1;
        while(count<N)
        {
            ptr=ptr1;
            ptr1=ptr1.link;
            count++;
        }
        ptr.link=ptr1.link;
        System.out.println("Node deleted");
        ptr=null;
        ptr1=null;
    }
    void display()
    {
        Node ptr=start;
        while(ptr!=null)
        {
            if(ptr.link!=null)
            System.out.print(ptr.data + " --> ");
            else
            System.out.print(ptr.data);
            ptr=ptr.link;
        }
        System.out.println();
        ptr=null;
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        char c;
        System.out.println("MENU :");
        System.out.println("1 : Create a Linked List");
        System.out.println("2 : Insert a node at the beginning of the Linked List");
        System.out.println("3 : Insert a node at the end of a Linked List");
        System.out.println("4 : Insert a node in the middle of a Linked List");
        System.out.println("5 : Delete a node from a Linked List");
        System.out.println("6 : Display a Linked List");
        do
        {
            System.out.println("Enter your choice (1-6) : ");
            int ch=as.nextInt();
            switch(ch)
            {
                case 1:
                    obj.create();
                    break;
                case 2 :
                    System.out.println("Enter the data of the node to be created");
                    int x=as.nextInt();
                    obj.insertBeg(x);
                    break;
                case 3 :
                    System.out.println("Enter the data of the node to be created");
                    int y=as.nextInt();
                    obj.insertEnd(y);
                    break;
                case 4 :
                    System.out.println("Enter the data of the node to be created");
                    int z=as.nextInt();
                    System.out.println("Enter the position at which node is to be inserted");
                    int p=as.nextInt();
                    obj.insertMiddle(z,p);
                    break;
                case 5 :
                    System.out.println("Enter the position of the node to be deleted");
                    int N=as.nextInt();
                    obj.delete(N);
                    break;
                case 6 :
                    System.out.println("Elements of the Linked List are : ");
                    obj.display();
                    break;
                default :
                    System.out.println("Invalid choice entered. Enter a choice between 1-6");
            }
            System.out.println("Would you like to continue? (Y/N)");
            c = as.next().charAt(0);
        }while(c=='Y' || c=='y');
    }
}