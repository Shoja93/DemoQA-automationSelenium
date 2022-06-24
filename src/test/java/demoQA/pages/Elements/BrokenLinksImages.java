package demoQA.pages.Elements;

import demoQA.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksImages{

    public WebDriver driver;

    public BrokenLinksImages(WebDriver driver) {
        this.driver = driver;
    }

    By validImage = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > img:nth-child(2)");
    By brokenImage = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > img:nth-child(6)");
    By validLink = By.linkText("Click Here for Valid Link");
    By brokenLink = By.linkText("Click Here for Broken Link");

    public WebElement getvalidImage(){
        return driver.findElement(validImage);
    }

    public WebElement getbrokenImage(){
        return driver.findElement(brokenImage);
    }

    public WebElement getvalidLink(){
        scroll();
        return driver.findElement(validLink);
    }

    public WebElement getbrokenLink(){
        scroll();
       return driver.findElement(brokenLink);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }

}
