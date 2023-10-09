package shape;
public class rectangle
{
    int l,b;
    String name;
    public rectangle(int l,int b,String name)
    {
        this.name = name;
        this.l = l;
        this.b = b;
    }
    public void show()
    {
        System.out.println(name);
    }
    public int area()
    {
        return this.l*this.b;
    }
}