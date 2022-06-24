package demoQA.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebDriver driver;

    By categoryCards = By.className("card-up");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllTools() {
        return driver.findElements(categoryCards);
    }

     public WebElement getElements(){
        scroll();
        return getAllTools().get(0);
    }

    public WebElement getForms(){
        scroll();
        return getAllTools().get(1);
    }

    public WebElement getAlertFrameWindows(){
        scroll();
        return getAllTools().get(2);
    }

    public WebElement getWidgets(){
        scroll();
        return getAllTools().get(3);
    }

    public WebElement getInteractions(){
        scroll();
        return getAllTools().get(4);
    }

    public WebElement getBookStoreApp(){
        scroll();
        return getAllTools().get(5);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }

}
