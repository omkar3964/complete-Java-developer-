import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo3 {

    WebDriver driver =  new ChromeDriver();

    void open(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    void sleeping(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    void login(){
        driver.get("https://www.rediff.com/");
        sleeping();
        driver.findElement(By.linkText("News")).click();
        sleeping();
        driver.findElement(By.linkText("Cricket")).click();
        sleeping();
        driver.navigate().back();
        sleeping();
        driver.navigate().back();
    }
    void close(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
        driver.close();
    }
    public static void main(String[] args) {
        demo3 d = new demo3();
        d.open();
        d.login();
        d.close();
    }
}
