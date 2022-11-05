package TestNGTest;
import org.testng.annotations.*;

public class Flight {

    @BeforeTest
    public void login()
    {
        System.out.println("logged in successfully");
    }

    @Test
    public void oneWay()
    {
        System.out.println("One Way Flight");
    }

    @Test
    public void roundTrip()
    {
        System.out.println("Round Trip Flight");
    }

    @Test
    public void multiCity()
    {
        System.out.println("Multi City Flight");
    }

    @AfterTest
    public void logOut()

    {
        System.out.println("Logged out successfully");
    }


}
