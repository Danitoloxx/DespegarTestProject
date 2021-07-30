package flights;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.navigationbar.FlightsPage;

public class flightSetTest extends BaseTest {
    @Test
    public void testflightSet() throws InterruptedException {
        FlightsPage flightsPage = homepage.clickFlies();
        flightsPage.clickCheckBox();
        flightsPage.setOrigin("Córdoba, Córdoba, Argentina");
        flightsPage.setDestiny("Buenos Aires, Buenos Aires, Argentina");
        flightsPage.clickSearchButton();
    }


}
