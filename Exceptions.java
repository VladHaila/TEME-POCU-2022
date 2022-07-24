public class Exceptions {

    public static void Method1()
    {
        try{
            int number=100/0;
            System.out.println(number);
        } catch(Exception e){
            e.printStackTrace();
            System.err.println("Caused by: " +e.getCause());
        }
        Method2(); //Method1 calls Method2
    }
    public static void Method2()
    {
        try{
            Method3(); //Method2 calls Method3
        } catch(Exception e)
        {
            System.out.println("You can't divide a number by zero in method3.");
        }
    }
    public static void Method3()
    {
        Method4(); //Method3 calls Method4
        int number=100/0;
        System.out.println(number);

    }
    public static void Method4()
    {
        try {
            int number=100/0;
            System.out.println(number);
        } catch(Throwable t){
            System.out.println("You can't divide a number by zero in Method4.");
        }
    }

    public static void main(String[] args)
    {
        Method1();
    }
}
