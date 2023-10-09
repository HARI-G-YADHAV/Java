class shape
{
    String name;
    shape(String name)
    {
        this.name = name;
    }
    void show()
    {
         System.out.println(name);
    }
    void area()
    {
        System.out.println("No Area");
    }
}
class rectangle extends shape
{
    int l,b;
    rectangle(int l,int b,String name)
    {
        super(name);
        this.l = l;
        this.b = b;
       
    }
    void area()
    {
        System.out.println(this.l*this.b);
    }
}
class overriding
{
    public static void main(String[] args)
    {
        shape[] shapes = new shape[2];
        shapes[0] = new shape("s");
        shapes[1] = new rectangle(5,5,"r");
        for(shape s: shapes)
        {
            s.show();
            s.area();
        }
    }
}