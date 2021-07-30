package navigationbar;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.navigationbar.AccommodationPage;
import pages.navigationbar.FlightsPage;
import pages.navigationbar.PackagePage;

import static org.testng.Assert.*;

public class navigationBarTest extends BaseTest {

    @Test
    public void testAccommodationPage() throws InterruptedException {
        AccommodationPage accommodationPage = homepage.clickAlojamientos();
        assertEquals(accommodationPage.getTitle(), "Encontrá alojamientos con cancelación gratuita.", "Error en el mensaje");
    }

    @Test
    public void testFlightsPage() {
        FlightsPage flightsPage = homepage.clickFlies();
        assertEquals(flightsPage.getTitle(), "Encontrá los mejores vuelos con reserva flexible.", "Error en el mensaje");
    }

    @Test
    public void testPackagePage() throws InterruptedException {
        PackagePage packagePage = homepage.clickPackage();
        assertEquals(packagePage.getTitle(), "Encontrá paquetes con alojamientos flexibles.", "Error de mensaje");
    }
}
