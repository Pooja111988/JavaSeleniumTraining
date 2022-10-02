package Test;

public class Calculator
{

    public static void main(String[] args) {

        Calculator obj=new Calculator();
        System.out.println(obj.addition(15,3));
        System.out.println(obj.subtraction(20,10));
        System.out.println(obj.multiplication(15,3));
        System.out.println(obj.division(25,5));
        System.out.println(obj.modulus(25,5));


    }
  // addition of two numbers
    public int addition(int x,int y)
    {
        int sum;
        sum=x+y;
        return sum;
    }
    // Subtraction of two numbers
   public int subtraction(int x,int y)
   {
    int sub;
    sub=x-y;
    return sub;
   }
   //multiplication of two numbers
    public int multiplication(int x,int y)
    {
        int mul;
        mul=x*y;
        return mul;
    }
    //division of two numbers
    public int division(int x,int y)

    {
        int div;
        div=x/y;
        return div;

    }
    //modulus of two numbers
    public int modulus(int x,int y)
    {
        int mod;
        mod=x%y;
        return mod;
    }
}
