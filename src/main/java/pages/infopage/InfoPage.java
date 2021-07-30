package pages.infopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoPage {
    private WebDriver driver;
    private By title = By.cssSelector("h5[class='eva-3-h4 -eva-3-tc -eva-3-mb-lg']");

    public InfoPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }
}
