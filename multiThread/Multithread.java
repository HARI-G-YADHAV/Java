class message extends Thread
{
    String message,name;
    int timer;
    message(String name,String message,int timer)
    {
        this.name = name;
        this.message = message;
        this.timer = timer;
    }
    public void run()
    {
        try
        {
            for(int i=5;i>=0;i--)
            {
                System.out.println(this.message);
                Thread.sleep(this.timer);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        System.out.println(this.name + "Ended");
    }   
}
class multithread
{
   public static void main(String[] args)
   {
        message a = new message("t1","hellow",1000);
        message b = new message("t2","Good Morning",2000);
        message c = new message("t3","bie",3000);
        a.start();
        b.start();
        c.start();
        try{
            a.join();
            b.join();
            c.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        System.out.println("main Ended");
   }
}