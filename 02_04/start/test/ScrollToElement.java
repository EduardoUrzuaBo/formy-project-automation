import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosa De Udaeta\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Navigate to page
        driver.get("https://formy-project.herokuapp.com/scroll");
        //
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Eduardo Urzua");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");
        driver.quit();
    }
}
