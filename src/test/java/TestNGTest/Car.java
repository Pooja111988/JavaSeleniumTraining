package TestNGTest;

import org.testng.annotations.*;

public class Car {

    @BeforeSuite
    public void envSetup()
    {
        System.out.println("Environment setup before execution");
    }

    @AfterSuite
    public void closeConnection()
    {
        System.out.println("Close the connection after execution");
    }

    @Test
    public void miniCar()

    {
        System.out.println("Mini Car Charges");
    }

    @Test
    public void sedanCar()

    {
        System.out.println("Sedan Car Charges");
    }

    @BeforeClass
    public void carAvailability()

    {
        System.out.println("Before class-Car availability");
    }

    @AfterClass
    public void carBooked()

    {
        System.out.println("After class-Car booked");
    }

}
