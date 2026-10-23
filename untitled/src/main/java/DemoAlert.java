import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAlert {
    WebDriver driver;
    void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void sleeping(){
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void close() {
        sleeping();
        driver.close();

    }


    public void login(){
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.findElement(By.id("login1")).sendKeys("Omkar");
//        sleeping();
//
//        driver.findElement(By.id("password")).sendKeys("Password");
//        sleeping();

        driver.findElement(By.name("proceed")).click();
        sleeping();

        Alert a = driver.switchTo().alert();
        a.accept();
        System.out.println(a.getText());

    }

    public static void main(String[] args) {

        DemoAlert d = new DemoAlert();
        d.open();
        d.login();
        d.close();
    }
}
