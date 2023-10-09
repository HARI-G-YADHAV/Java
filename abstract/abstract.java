abstract class shape
{
    String name;
    shape(String name)
    {
        this.name = name;
    }
    void show()
    {
        System.out.println(this.name);
    }
    abstract int area();
}
class rectangle extends shape{
    int l,b;
    String name;
    rectangle(int l,int b,String name)
    {
        super(name);
        this.l = l;
        this.b = b;
    }
    int area()
    {
        return this.l*this.b;
    }
}
class abstractDemo
{
    public static void main(String[] args)
    {
        rectangle r = new rectangle(5,5,"r");
        r.show();
    }
}