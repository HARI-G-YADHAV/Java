class newThread implements Runnable
{
    Thread t;
    newThread()
    {
        t = new Thread(this,"Demo");
        System.out.println("Thread: " + t);
    }
    public void run()
    {
        int i;
        try
        {
            for(i=5;i>=0;i--)
            {
                System.out.println(" Child Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        System.out.println("Child Thread finished");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        newThread nt = new newThread();
        nt.t.start();
        try
        {
            int i;
            for(i=5;i>=0;i--)
            {
                System.out.println(" main Thread: " + i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        System.out.println("main Thread finished");
    }

}