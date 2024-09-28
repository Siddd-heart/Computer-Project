import java.util.*;
class Circle extends Plane
{
    int x2, y2;
    double radius, area;
    Circle(int x1, int y1,int x2,int y2)
    {
        super(x1,y1);
        this.x2=x2;
        this.y2=y2;
        radius=0.0D;
        area=0.0D;
    }
    void findRadius()
    {
        radius = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    void findArea()
    {
        area = 3.14*radius*radius;
    }
    void Show()
    {
        super.Show();
        System.out.println("Second x-coordinate : " + x2);
        System.out.println("Second y-coordinate : " + y2);
        System.out.println("Radius of the circle = " + radius);
        System.out.println("Area of the circle = " + area);
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates of the first end point");
        int a=as.nextInt();
        int b = as.nextInt();
        System.out.println("Enter the x and y coordinates of the second end point");
        int x=as.nextInt();
        int y=as.nextInt();
        Circle obj = new Circle(a,b,x,y);
        obj.findRadius();
        obj.findArea();
        obj.Show();
    }
}