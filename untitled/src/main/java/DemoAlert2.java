import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAlert2 {
    WebDriver driver;
    void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void sleeping(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void close() {
        sleeping();
        driver.close();

    }


    public void login(){
        driver.get("https://kitchen.applitools.com/ingredients/alert");

        driver.findElement(By.id("alert-button")).click();
        sleeping();
        Alert a = driver.switchTo().alert();
        a.accept();
        sleeping();

        driver.findElement(By.id("confirm-button")).click();
        sleeping();
        a = driver.switchTo().alert();
        a.dismiss();
        sleeping();


        driver.findElement(By.id("prompt-button")).click();
        sleeping();
        String s = a.getText();
        a.sendKeys(s);
        a.accept();

//
//

    }

    public static void main(String[] args) {

        DemoAlert2 d = new DemoAlert2();
        d.open();
        d.login();
        d.close();
    }
}
