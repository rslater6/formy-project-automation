import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        // This utilizes org.openqa.selenium.chrome.ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

        // Create new instance of ChromeDriver
        // This utilizes org.openqa.selenium.WebDriver.
        WebDriver driver =  new ChromeDriver();

        // And now use this to visit Google
        // Uses the 'get' method of the driver class to open the URL.
        driver.get("http://www.google.com");

        // Find the text input element by its name
        // This utilizes org.openqa.selenium.By to find the element with name 'q'
        // Also creates an element of for 'q' by utilizing org.openqa.selenium.WebElement
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        //
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}