import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Scanner;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Scanner sc = new Scanner(System.in);


        String username =  "omkar";


        String password =  "1234543";

        WebElement usernameField = driver.findElement(By.name("login"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.name("passwd"));
        passwordField.sendKeys(password);

        WebElement remaimberCheckbox = driver.findElement(By.name("remember"));
        remaimberCheckbox.click();

        WebElement loginButton = driver.findElement(By.name("proceed"));
        loginButton.click();

        System.out.println("press enter to exit");
        sc.nextInt();

        driver.quit();
    }
}