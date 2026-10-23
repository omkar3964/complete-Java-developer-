import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover extends Utility{
    public void action(){
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=825671333423&hvpos=&hvnetw=g&hvrand=5087537918334394004&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198863&hvtargid=kwd-300061672064&hydadcr=5621_2518759&mcid=4609d98fca1f369c9cef004936e8f119&hvocijid=5087537918334394004--&hvexpln=nav&gad_source=1");
        WebElement mainlist = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        WebElement suublist = driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"));

        Actions ac = new Actions(driver);
        sleeping(2000);
        ac.moveToElement(mainlist).click(suublist).build().perform();
    }
    public static void main(String[] args) {
        Hover d = new Hover();
        d.open();
        d.action();
        d.close();
    }
}
