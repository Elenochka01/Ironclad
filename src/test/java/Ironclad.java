import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ironclad {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oea16\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ironcladapp.com/");
        driver.manage().window().maximize();
        System.out.println("Opened Website");

        Thread.sleep(3000);
        WebElement solutions = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).perform();
        System.out.println("Opened Company Menu");

        Thread.sleep(3000);
        WebDriverWait waitForLegal = new WebDriverWait(driver, 45);
        WebElement legal = waitForLegal.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")));
        legal.click();
        System.out.println("Opened Legal Page");

        Thread.sleep(3000);
        solutions = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        actions.moveToElement(solutions).perform();

        Thread.sleep(3000);
        WebDriverWait waitForSales = new WebDriverWait(driver, 45);
        WebElement sales = waitForSales.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/div[1]")));
        sales.click();
        System.out.println("Opened Sales Page");

        Thread.sleep(3000);
        solutions = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        actions.moveToElement(solutions).perform();

        Thread.sleep(3000);
        WebDriverWait waitForProcur = new WebDriverWait(driver, 45);
        WebElement procurement = waitForProcur.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/div[1]")));
        procurement.click();
        System.out.println("Opened Procurement Page");

        Thread.sleep(3000);
        solutions = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        actions.moveToElement(solutions).perform();

        Thread.sleep(3000);
        WebDriverWait waitForIt = new WebDriverWait(driver, 45);
        WebElement it = waitForIt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[4]")));
        it.click();
        System.out.println("Opened IT Page");

        Thread.sleep(3000);
        WebElement company = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[4]/div[1]/div[1]"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(company).perform();
        System.out.println("Opened Company Menu");

        Thread.sleep(3000);
        WebDriverWait waitForCareers = new WebDriverWait(driver, 45);
        WebElement careers = waitForCareers.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")));
        careers.click();
        System.out.println("Opened Careers Page");

        Thread.sleep(3000);
        String pageText= driver.getPageSource();
        assertTrue(pageText.contains("Careers"));
        System.out.println("We are on correct page");


        Thread.sleep(3000);
        driver.quit();
        System.out.println("Closed Browser");

    }
}
