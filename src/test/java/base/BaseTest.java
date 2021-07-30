package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.homepage.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver91.exe");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://almundo.com.ar/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
