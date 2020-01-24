import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //
        // Find element for the 'first name' field and enter 'John'.
        driver.findElement(By.id("first-name")).sendKeys("John");
        // Find element for the 'last name' field and enter 'Smith'.
        driver.findElement(By.id("last-name")).sendKeys("Smith");
        // Find element for the 'job title' field and enter 'QA Engineer'.
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        // Find element for the 'Highest level of education' radio button list and
        // select the second radio button.
        driver.findElement(By.id("radio-button-2")).click();
        // Find element for the 'Sex' checkbox list and
        // select the second choice.
        driver.findElement(By.id("checkbox-2")).click();
        // Find element for the 'Years of experience' pull-down menu and
        // select the first choice.
        driver.findElement(By.cssSelector("option[value='1']")).click();
        // Find element for the 'Date' date selector, enter a date and click the RETURN key.
        driver.findElement(By.id("datepicker")).sendKeys("08/05/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        // Find element for the 'Submit' button and click the Submit button.
        driver.findElement((By.cssSelector(".btn.btn-lg.btn-primary"))).click();
        //

        driver.quit();
    }
}
