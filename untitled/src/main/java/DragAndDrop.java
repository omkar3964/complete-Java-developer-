import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Utility{
    public void action(){
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement source = driver.findElement(By.id("myImage"));
        WebElement dest = driver.findElement(By.id("targetDiv"));

        Actions ac = new Actions(driver);
        sleeping(2000);
        ac.dragAndDrop(source,dest).build().perform();

    }
    public static void main(String[] args) {
        DragAndDrop d = new DragAndDrop();
        d.open();
        d.action();
        d.close();
    }
}
