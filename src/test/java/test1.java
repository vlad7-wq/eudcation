import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        WebElement findElement = driver.findElement(By.id("btn-consultation-hero"));
        try {
            driver.wait(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
