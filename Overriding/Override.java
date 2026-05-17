class A
{
    //overriden method 

    public void show()
    {
        System.out.println("Show() in A");
    }

}

class B extends A
{
    //methods or instance variable public void show()
    @Override

    public void show()    //overriding method
    {
        System.out.println("Show() in B");
    }

}

public class Override
{
    public static void main(String args[])
    {
        B obj=new B();

        obj.show();
    }
}