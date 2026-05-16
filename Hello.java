import java.util.*;

class Human
{
    //static variable or class variable 
    static String species;//only single copy exists  , access with className

    //data members or instance variables  //direct access(through object when public) //(indirect access(through methods when encapsulation used : private instance var))
    private String name;
    private int age;
    private String gender;

    //static block--> only runs one time when class loads [class.for]
    static
    {
        System.out.println("static block (class loaded successfully)");
        species="Homeosepians";
    }

    //constructor-->call only  when class object is created 
    public Human(String name,int age,String gender)//parameterized constructor
    {
        System.out.println("parameterized constructor called");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Human()//default constructor
    {
        System.out.println("default constructor called");
        name="unknown";
        age=18;
        gender="male";
    }
    

    //static method-->can only access static variables , static method call with className

    public static void Intro()//to access instance variable pass the ref var pointing obj in the method while calling
    {
        System.out.println("In static method");
        System.out.print(species);
    }


    //methods --> getters and setters 

    public int getage()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public void setage(int age)
    {
        this.age=age;
    }

}

public class Hello 
{
    public static void main(String args[])
    {

        Human h1=new Human("Mahesh",20,"male");

        Human h2=new Human();

        h2.setname("Ritesh");

        // System.out.println(h1.n);//direct access through obj no encapsulate ()

        System.out.println(h1.getname());

        //System.out.println(h2.name);
        System.out.println(h2.getname());
        
        System.out.println(Human.species);//static variable access through class name only (standard practice)

        Human.Intro();//static method can call with className (standard practice)
    }
}