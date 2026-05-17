class Calc extends Advcalc //single level inheritance
{
    //methods
    public int add(int m,int n)
    {
        return m+n;
    }

    public int subtract(int m,int n)
    {
        return m-n;
    }
    
}


public class Inheritance
{
    public static void main(String args[])
    {
        Calc cal=new Calc();

        System.out.println(cal.add(2,3));

        System.out.println(cal.subtract(4,2));

        //single level inheritance 

        System.out.println(cal.multiply(4,2));

        System.out.println(cal.division(4,2));

        //multi-level inheritance 

         System.out.println(cal.power(4,2));

         System.out.println(cal.multiply(4,2));

    }
}