import java.util.Scanner;
class underageException extends Exception
{
    int age;
    underageException(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        return "Your age is" + age + "Years";
    }
}
class Exceptiondemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter your age: ");
        int age,a,b;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try
        {
            age(age);
            System.out.println("Enter Two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            double d = a/b;
        }
        catch(underageException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
             System.out.println(e);
        }
        finally
        {
             System.out.println("bie");
        }
    }
    static void age(int age) throws underageException 
    {
        if(age >= 18)
        {
            System.out.println("Welcome");
        }
        else
        {
            throw new underageException(age);
        }
    }
}
