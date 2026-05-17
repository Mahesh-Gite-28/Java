class A
{
    //methods 
    public A()
    {
        //super()
        this(8);
        System.out.println("in cons of A");
    }
    
    public A(int n)
    {
        //super()
        // this();
        System.out.println("In parameterized con of A");
    }
  
}

class B extends A
{
    //metods
    public B()
    {
       //super()-->hidden method in constructors that calls the constructor of super class which may be extends super class or object class(default every class extends object class if not extend anyone)
       super(8);
        System.out.println("In cons of B");
    }


    public B(int n)
    {
        
        //super()-->hidden method super() must be the very first statement in the subclass constructor. give error
        System.out.println("in parameterized constructor of B");
    }

}



public class Demo
{
    public static void main(String args[])
    {
        B obj= new B(5);
    }
}