package SecondMaven;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


    public  class AppTest {
    protected static WebDriver driver;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","" );

    }


    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\abc\\BowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //implicit wait applied to driver instance - which will be applied to driver until driver instance
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //asking driver to get url
        driver.get("https://demo.nopcommerce.com/");
        //register for new user
        driver.findElement(By.xpath("//a[@class= \'ico-register\']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("james");
        driver.findElement(By.id("LastName")).sendKeys("bond");
        driver.findElement(By.id("Email")).sendKeys("qwe" + "@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("rudra2001");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("rudra2001");
        driver.findElement(By.id("register-button")).click();
        String actualRegistrationSuccessMessage = driver.findElement(By.xpath("//div[@class'result']")).getText();
        Assert.assertEquals("Your registration  completed ", actualRegistrationSuccessMessage);
    }
     //Computer category
            @Test
            public void Computers(){
            driver.findElement(By.id("Computers")).sendKeys("<a href=\"/notebooks\">Notebooks\n" + "    </a>");
    }
     //Electronics category
            @Test
            public void Electronics(){
            driver.findElement(By.id("Electronics")).sendKeys("<a href=\"/cell-phones\">Cell phones\n" + "    </a>");
        }
     //Logout
            @Test
            public void Logout(){
            driver.findElement(By.id("Logout")).sendKeys( "//a[@class=\"ico-logout\"]");
        }
     //user Log In Successfully
            @Test
            public void userShouldBeLoginInSuccessfully(){
            driver.findElement(By.id("//a[@class=\"ico-login\"]")).click();
            driver.findElement(By.id("Email")).sendKeys("qwe" + "@yahoo.com");
            driver.findElement(By.id("Password")).sendKeys("rudra2001");
            driver.findElement(By.id("class=\"button-1 login-button")).click();

        }
        //ShopingCart
            @Test
            public void Shoppingcart(){
            driver.findElement(By.id("//a[@class= \"cart-label\"]Shopping cart")).click();
        }

            @After
            public void closeBrowser()

            {
                driver.quit();
            }
        }


