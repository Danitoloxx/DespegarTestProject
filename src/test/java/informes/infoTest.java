package informes;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.infopage.InfoPage;

import static org.testng.Assert.assertEquals;

public class infoTest extends BaseTest {

    @Test
    public void infoTest(){
        InfoPage infoPage = homepage.clickInfo();
        assertEquals(infoPage.getTitle(), "Categorías más consultadas", "No se encontró el titulo");

    }

}
