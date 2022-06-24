package demoQA.test;

import demoQA.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest extends BasePage {


    @Test
    public void findElement() {
        homePage.getElements().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/elements");
    }

    @Test
    public void findForms(){
        homePage.getForms().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/forms");
    }

    @Test
    public void findBookStoreApp(){
        homePage.getBookStoreApp().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/books");
    }
}