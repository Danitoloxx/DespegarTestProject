package pages.navigationbar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.searchpage.SearchAreaPage;

import java.util.ArrayList;
import java.util.List;


public class FlightsPage {
    private final WebDriver driver;
    private final By titleVuelos = By.xpath("//div[@class='flights-searchbox__title']");
    private final By originField = By.xpath("(//input[@placeholder='Ingresa una ciudad'])[1]");
    private final By destinyField = By.xpath("(//input[@placeholder='Ingresa una ciudad'])[2]");
    private final By checkBox = By.xpath("//span[@class='mb-checkbox__mark']");
    private final By searchButton = By.xpath("(//button[@type='submit'])[1]");


    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(titleVuelos).getText();
    }

    public void clickCheckBox(){
        driver.findElement(checkBox).click();
    }

    public void setOrigin(String origin) throws InterruptedException {
        driver.findElement(originField).sendKeys(origin);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='cdk-overlay-1']/am-autocomplete/div/div[2]/div[2]/div[1]/mark[1]")).click();
    }

    public void setDestiny(String destiny) throws InterruptedException {
        driver.findElement(destinyField).sendKeys(destiny);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='cdk-overlay-2']/am-autocomplete/div/div[2]/div[2]/div[1]")).click();
    }

    public SearchAreaPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new SearchAreaPage(driver);
    }
}
