import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosa De Udaeta\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("4600 Silver Hill Road, Suitland, MD, USA");
        Thread.sleep(3000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

        autocompleteResult.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
