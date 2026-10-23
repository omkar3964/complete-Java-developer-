import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Utility {
    WebDriver driver;
    void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void sleeping(int time){
        try {
            Thread.sleep(time);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void close() {
        sleeping(2000);
        driver.close();

    }
    public void takeScreenShot(String name) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File from = ts.getScreenshotAs(OutputType.FILE);
        File to = new File("C://Users//omalb/Desktop/"+name+".png");
        FileHandler.copy(from, to);

    }
}
