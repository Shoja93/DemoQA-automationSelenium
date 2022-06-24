package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

public class Links {

    public WebDriver driver;

    public Links(WebDriver driver) {
        this.driver = driver;
    }

    By home = By.id("simpleLink");
    By dinamicLink = By.id("dynamicLink");
    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.id("bad-request");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By notFound = By.id("invalid-url");

    public void newTabs(){
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> tabovi = new ArrayList<>(tabs);
        driver.switchTo().window(tabovi.get(1));
    }

    public void gethome(){
        driver.findElement(home).click();
        newTabs();
    }

    public void getDinamicLink(){
        driver.findElement(dinamicLink).click();
        newTabs();
    }

    public void getCreated(){
        driver.findElement(created).click();
    }

    public void getNoContent() {
        scroll();
       driver.findElement(noContent).click();
    }

    public void getMoved() {
       driver.findElement(moved).click();
    }

    public void getBadRequest() {
        scroll();
        driver.findElement(badRequest).click();
    }

    public void getUnauthorized() {
        scroll();
        driver.findElement(unauthorized).click();
    }

    public void getForbidden() {
        scroll();
        driver.findElement(forbidden).click();
    }

    public void getNotFound() {
        scroll();
        driver.findElement(notFound).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
