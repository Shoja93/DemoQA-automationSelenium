package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DinamicProperties {

    public WebDriver driver;
    public WebDriverWait wdwait;


    public DinamicProperties(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    By enableAfter = By.id("enableAfter");
    By colorChange = By.cssSelector(".mt-4.text-danger.btn.btn-primary");
    By visibleAfter5Seconds = By.id("visibleAfter");

    public void getEnableAfter() {
        wdwait.until(ExpectedConditions.elementToBeClickable(enableAfter));
        driver.findElement(enableAfter).click();
    }

    public void getColorChange()  {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(colorChange));
        driver.findElement(colorChange);
    }

    public void getVisibleAfter5Seconds() {
        scroll();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfter5Seconds));
        driver.findElement(visibleAfter5Seconds).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
