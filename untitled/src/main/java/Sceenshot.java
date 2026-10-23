import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Sceenshot {
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
    public void takeScreenShot() throws IOException {
        driver.get("https://www.google.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File from = ts.getScreenshotAs(OutputType.FILE);
        File to = new File("C://Users//omalb/Desktop/google.png");

        FileHandler.copy(from, to);
    }

    public static void main(String[] args) throws IOException {
        Sceenshot s = new Sceenshot();
        s.open();
        s.takeScreenShot();
        s.close();
    }
}
