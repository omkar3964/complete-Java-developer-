import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class demo2 {
    WebDriver driver;

    public void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void close() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
        driver.close();
    }

    public void login(){
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        driver.findElement(By.xpath("//input[@id='_R_ojadeslcldcpbn6b5ipamH1_']")).sendKeys("Omkar");
        driver.findElement(By.xpath("(//input[starts-with(@class,'x1i10hfl')])[2]")).sendKeys("2213432");
        driver.findElement(By.xpath("(//div[contains(@class,'x1bumbmr ')])[1]")).click();
    }


    public static void main(String[] args) {
        demo2 d = new demo2();
        d.open();
        d.login();
        d.close();
    }
}
