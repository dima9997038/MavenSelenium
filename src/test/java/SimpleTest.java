import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleTest {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
        Thread.sleep(8000);
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());


        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();
}
}
