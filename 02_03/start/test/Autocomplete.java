import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        //
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("11745 Burnley Drive Orland Park");
        sleep(1000);
        WebElement autoCompleteResults = driver.findElement(By.className("pac-item"));
        autoCompleteResults.click();

        //

        driver.quit();
    }
}
