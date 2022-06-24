package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Buttons {

    public WebDriver driver;
    public Actions action;

    public Buttons(WebDriver driver) {
        this.driver = driver;
    }

    By doubleClickMe = By.id("doubleClickBtn");
    By rightClickMe = By.id("rightClickBtn");
    By clickMe = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    By doubleClickMeMessage = By.id("doubleClickMessage");
    By rightClickMeMessage = By.id("rightClickMessage");
    By clickMeMessage = By.id("dynamicClickMessage");


    public void doubleClikc(){
        Actions act = new Actions(driver);
        WebElement doubleClick = driver.findElement(doubleClickMe);
        act.doubleClick(doubleClick).perform();
    }

    public WebElement getDoubleClickMe(){
        doubleClikc();
        return driver.findElement(doubleClickMe);
    }

    public void rightClick(){
        Actions act = new Actions(driver);
        WebElement rightClick = driver.findElement(rightClickMe);
        act.contextClick(rightClick).perform();
    }

    public WebElement getRightClikcMe(){
        rightClick();
        return driver.findElement(rightClickMe);
    }

    public void clickMe(){
        Actions act = new Actions(driver);
        WebElement click = driver.findElement(clickMe);
        act.click(click).perform();
    }

    public WebElement getClickMe(){
        return driver.findElement(clickMe);
    }

    public WebElement getdoubleClickMeMessage(){
        return driver.findElement(doubleClickMeMessage);
    }

    public WebElement getrightClickMeMessage(){
        return driver.findElement(rightClickMeMessage);
    }

    public WebElement getclickMeMessage(){
        return driver.findElement(clickMeMessage);
    }
}
