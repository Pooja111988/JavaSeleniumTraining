package TestNGTest;
import org.testng.annotations.*;

public class Hotel {

    @BeforeMethod
    public void ageCheck()
    {
        System.out.println("Age Check Before HotelBooking");

    }

    @Test
    public void Hotels()
    {
        System.out.println("Hotels");
    }

    @Test
    public void Resorts()
    {
        System.out.println("Resorts");
    }
    @Test
    public void villas()
    {
        System.out.println("Villas");
    }

    @AfterMethod
    public void details()

    {
        System.out.println("After method-Hotel Details Page");
    }

}
