package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Elements {
    public WebDriver driver;

    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    By textBox = By.id("item-0");
    By checkBox = By.id("item-1");
    By radioButton = By.id("item-2");
    By webTables = By.id("item-3");
    By buttons = By.id("item-4");
    By links = By.id("item-5");
    By brokenLinksImages = By.id("item-6");
    By uploadAndDownload = By.id("item-7");
    By dynamicProperties = By.id("item-8");

    public WebElement gettextBox(){
        return driver.findElement(textBox);
    }

    public WebElement getcheckBox(){
        return driver.findElement(checkBox);
    }

    public WebElement getradioButton(){
        scroll();
        return driver.findElement(radioButton);
    }

    public WebElement getWebTables(){
        scroll();
        return driver.findElement(webTables);
    }

    public WebElement getbuttons(){
        scroll();
        return driver.findElement(buttons);
    }

    public WebElement getlinks(){
        scroll();
        return driver.findElement(links);
    }

    public WebElement getbrokenLinkImages(){
        scroll();
        return driver.findElement(brokenLinksImages);
    }

    public WebElement getuploadAndDownload(){
        scroll();
        return driver.findElement(uploadAndDownload);
    }

    public WebElement getdynamicProperties(){
        scroll();
        return driver.findElement(dynamicProperties);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
