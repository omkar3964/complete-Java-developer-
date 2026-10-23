import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo extends Utility {
    public void demo(){
        driver.get("https://www.facebook.com/");
        Actions ac = new Actions(driver);
//        ac.contextClick().build().perform();// bydefault click right click on top-left
        WebElement email = driver.findElement(By.name("email"));


//        sleeping(3000);
//        ac.contextClick(email).build().perform();// right click on email
        WebElement button = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div"));
//        ac.click(button).build().perform();// for simple click on button

        ac.sendKeys(button, Keys.ENTER).build().perform();



    }

    public static void main(String[] args) {
        ActionDemo d = new ActionDemo();
        d.open();
        d.demo();
        d.close();
    }
}
