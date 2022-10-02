package Test;

public class Operators {

    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        int z = 10;
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y;

        /* Arithmetic Operators */
        System.out.println(sum);//Addition operator
        System.out.println(sub); //Subtraction Operator
        System.out.println(mul); //Multiplication Operator
        System.out.println(div); //Division Operator
        System.out.println(mod); //Modulus operator

        /* Arithmetic Increment Operators */
        System.out.println(++x); // Increment and then return value
        System.out.println(x++); //Return value and then increment
        System.out.println(--y); //Decrement and then return value
        System.out.println(y--); //Return value and then Decrement

        /* Logical Operators */
        System.out.println(x > y && z > x);
        System.out.println(x > y || z > x);
        System.out.println(x!=y);

        /* Comparison operators */

        System.out.println(x==y);
        System.out.println(y!=z);
        System.out.println(x>=y);
        System.out.println(x<=y);

        /* Concatenation */
        System.out.println("Value of x is: " +x+ " Value of y is: " +y);


    }}
