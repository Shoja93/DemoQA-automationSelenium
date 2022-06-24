package demoQA.test.bookstoreapptest;

import demoQA.pages.BookStoreApp.LoginPage;
import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logIn(){
        findBookStoreApp();
        bookStoreApp.getLogIn();
        loginPage.getUserName();
        loginPage.getPassword();
        loginPage.getlogIn();
        wdw.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/profile");
    }

    @Test
    public void newUser(){
        findBookStoreApp();
        bookStoreApp.getLogIn();
        loginPage.getNewUser();
        loginPage.getNewUserFirstName();
        loginPage.getNewUserLastName();
        loginPage.getNewUserUserName();
        loginPage.getNewUserPassword();
        loginPage.getRegister();
        Assert.assertEquals(driver.findElement(By.id("name")).getText(),"Please verify reCaptcha to register!");
    }

    @Test
    public void backToLogin(){
        findBookStoreApp();
        bookStoreApp.getLogIn();
        loginPage.getNewUser();
        loginPage.getBackToLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login");
    }

    @Test
    public void logOut(){
        logIn();
        loginPage.getLogOut();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login");
    }
}
