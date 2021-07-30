package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.infopage.InfoPage;
import pages.navigationbar.AccommodationPage;
import pages.navigationbar.FlightsPage;
import pages.navigationbar.PackagePage;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public AccommodationPage clickAlojamientos() throws InterruptedException {
        clickLink("//li[@data-au='tab-hotels']");
        Thread.sleep(3000);
        return new AccommodationPage(driver);
    }

    public FlightsPage clickFlies(){
        clickLink("(//li[@class='item-tab selected'])");
        return new FlightsPage(driver);
    }

    public PackagePage clickPackage() throws InterruptedException {
        clickLink("//li[@data-au='tab-packages']");
        Thread.sleep(3000);
        return new PackagePage(driver);
    }

    public InfoPage clickInfo(){
        clickLink("//div[@class='eva-3-card home-ui-seo-card -eva-3-shadow-line-hover']");
        return new InfoPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.xpath(linkText)).click();
    }
}
