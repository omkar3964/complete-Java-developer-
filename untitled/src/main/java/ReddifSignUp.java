import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ReddifSignUp {
    WebDriver driver;
    void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void sleeping(int n){
        try {
            Thread.sleep(n);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void close() {
        sleeping(1000);
        driver.close();

    }
    public void login(){
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        sleeping(1000);

        driver.findElement(By.linkText("Get a new Rediffmail ID")).click();
        sleeping(2000);

        driver.findElement(By.cssSelector("input[placeholder='Enter your full name' ]")).sendKeys("Omkar malbhare");
        sleeping(2000);
    }
    public static void main(String[] args) {

        ReddifSignUp r = new ReddifSignUp();
        r.open();
        r.login();
        r.close();
    }
}
