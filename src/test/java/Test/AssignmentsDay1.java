package Test;

public class AssignmentsDay1 {

    public static void main(String[] args) {

        AssignmentsDay1 obj = new AssignmentsDay1();
        obj.printHello();
        obj.sum(36,4);
        obj.swap(25,20);
        obj.swapWithoutThirdVariable(15,10);


    }
    /* 1.Print hello and then your name in separate line */

    public void printHello() {
        String name = "Pooja Yadav";
        System.out.println("Hello");
        System.out.println(name);
    }

    /* 2.Print sum of two numbers */

    public void sum(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("Sum of two numbers is: "+sum);
    }

    /* 3. Swap two numbers */
     public void swap(int x,int y) {
         int z;
         z = x;
         x = y;
         y = z;

         System.out.println("First number is: " + x + "  Second number is: " + y);

     }

       /* 4.Swap two numbers without third variable */

     public void swapWithoutThirdVariable(int x,int y)
         {

          x=x+y;
          y=x-y;
          x=x-y;
          System.out.println("First number is: "+x+"  Second number is: "+y);
         }

}




