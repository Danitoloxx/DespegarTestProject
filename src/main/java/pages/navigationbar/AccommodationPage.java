package pages.navigationbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccommodationPage {
    private WebDriver driver;
    private By titleAlojamientos = By.className("hotels-searchbox__title");

    public AccommodationPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(titleAlojamientos).getText();
    }

}
