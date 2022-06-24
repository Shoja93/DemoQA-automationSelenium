package demoQA.pages.BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BookStoreApp {

    public WebDriver driver;

    public BookStoreApp(WebDriver driver) {
        this.driver = driver;
    }

    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]");
    By bookStore = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]");
    By profile = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[3]");
    By bookStoreAPI = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[4]");

    public void getLogIn(){
        scroll();
        driver.findElement(login).click();
    }

    public void getBookStore(){
        scroll();
        driver.findElement(bookStore).click();
    }

    public void getProfile(){
        scroll();
        driver.findElement(profile).click();
    }

    public void getBookStoreAPI(){
        scroll();
        driver.findElement(bookStoreAPI).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
