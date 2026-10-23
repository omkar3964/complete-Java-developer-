import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DDL extends Utility{
    public void ddl() throws IOException {

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).sendKeys("Omkar malbhare");
        sleeping(500);
        driver.findElement(By.xpath("(//input[contains(@id,'login')])[1]")).sendKeys("omkarmalbhare29");
        sleeping(500);
        driver.findElement(By.xpath("//input[@value='Check availability']")).click();
        sleeping(500);
        driver.findElement(By.xpath("(//input[contains(@name,'pass')])[1]")).sendKeys("123456789");
        sleeping(500);
        driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("123456789");


        WebElement ddlDay  = driver.findElement(By.xpath("//select[contains(@name,'Day')]"));
        Select s = new Select(ddlDay);
        s.selectByIndex(2);
        sleeping(1000);
        s.selectByValue("05");
        sleeping(1000);
        s.selectByVisibleText("29");
        takeScreenShot("day");


        WebElement ddlMonth  = driver.findElement(By.xpath("//select[contains(@name,'Month')]"));
        s = new Select(ddlMonth);
        s.selectByIndex(1);
        sleeping(1000);
        s.selectByValue("05");
        sleeping(1000);
        s.selectByVisibleText("JAN");
        takeScreenShot("month");

        WebElement ddlYear  = driver.findElement(By.xpath("//select[contains(@name,'Year')]"));
        s = new Select(ddlYear);
        s.selectByVisibleText("2004");
        takeScreenShot("Year");
    }
    public static void main(String[] args) throws IOException {
        DDL d = new DDL();
        d.open();
        d.ddl();
        d.close();

    }
}
