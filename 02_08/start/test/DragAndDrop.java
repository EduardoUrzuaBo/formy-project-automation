import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosa De Udaeta\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("");

        WebElement image = driver.findElement(By.id("image"));

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=‘Go Button’]")));
        element.click();


        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//p[text()=‘Go Button’]")).click;

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(image, box).build().perform();

        driver.quit();
    }
}

