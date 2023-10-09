import java.util.Scanner;
class Triangle{
    double a,b,c;
    Triangle(double a,double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Triangle(double b)
    {
        this.b = b;
    }
    double getArea()
    {
        double s =(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double getArea(double h)
    {
        return (b*h*0.5);
    }
}
class overloading{
    public static void main(String[] args)
    {
        System.out.println("1 for using 3 sides:");
        System.out.println("2 for using height:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter 3 sides: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                Triangle t = new Triangle(a,b,c);
                System.out.println("Area = "+ t.getArea());
                break;
            case 2:
                System.out.println("Enter height: ");
                double h = sc.nextDouble();
                System.out.println("Enter base: ");
                b = sc.nextDouble();
                Triangle t2 = new Triangle(b);
                System.out.println("Area = "+ t2.getArea(h));
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
}
