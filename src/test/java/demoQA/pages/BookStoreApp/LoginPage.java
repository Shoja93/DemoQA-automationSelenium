package demoQA.pages.BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.id("userName");
    By password = By.id("password");
    By logIn = By.id("login");
    By newUser = By.id("newUser");
    By logOut = By.id("submit");
    By newUserFirstName = By.id("firstname");
    By newUserLastName = By.id("lastname");
    By newUserUserName = By.id("userName");
    By newUserPassword = By.id("password");
    By registerButton = By.id("register");
    By backToLoginButton = By.id("gotologin");


    public void getUserName(){
        driver.findElement(userName).sendKeys("shoja93");
    }

    public void getPassword(){
        driver.findElement(password).sendKeys("Beograd011^");
    }

    public void getlogIn(){
        scroll();
        driver.findElement(logIn).click();
    }

    public void getNewUser(){
        driver.findElement(newUser).click();
    }

    public void getLogOut(){
        driver.findElement(logOut).click();
    }

    public void getNewUserFirstName(){
        driver.findElement(newUserFirstName).sendKeys("Marko");
    }

    public void getNewUserLastName(){
        driver.findElement(newUserLastName).sendKeys("Markovic");
    }

    public void getNewUserUserName(){
        driver.findElement(newUserUserName).sendKeys("marecare");
    }

    public void getNewUserPassword(){
        driver.findElement(newUserPassword).sendKeys("BEOGRAd123%");
    }

    public void getRegister(){
        scroll();
        driver.findElement(registerButton).click();
    }

    public void getBackToLogin(){
        scroll();
        driver.findElement(backToLoginButton).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
