package pages.navigationbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackagePage {
    private WebDriver driver;
    private By titlePackage = By.xpath("//div[@class='packages-searchbox__title']");

    public PackagePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(titlePackage).getText();
    }
}
