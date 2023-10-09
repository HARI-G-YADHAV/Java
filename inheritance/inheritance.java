class shape{
    String name;
    shape(String name)
    {
        this.name = name;
    }
    void show()
    {
        System.out.println(this.name);
    }
}
class circle extends shape
{
    double r;
    circle(double r,String name)
    {
        super(name);
        this.r = r;
    }
    double Area(double r,String name)
    {
        return (3.14 * r * r);
    }
}
class inheritance
{
    public static void main(String[] args)
    {
        shape a = new shape("r1");
        circle b = new circle(5,"r1");
        b.show();
    }
}