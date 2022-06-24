package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Test
    public void simpleLink(){
        findElement();
        elements.getlinks().click();
        links.gethome();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/");
    }

    @Test
    public void dinamicLink(){
        findElement();
        elements.getlinks().click();
        links.getDinamicLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/");
    }

    @Test
    public void apiCall() {
        findElement();
        elements.getlinks().click();
        links.getCreated();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 201 and status text Created");
    }

    @Test
    public void noContent(){
        findElement();
        elements.getlinks().click();
        links.getNoContent();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 204 and status text No Content");
    }

    @Test
    public void moved(){
        findElement();
        elements.getlinks().click();
        links.getMoved();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test
    public void badRequest(){
        findElement();
        elements.getlinks().click();
        links.getBadRequest();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 400 and status text Bad Request");

    }

    @Test
    public void unauthorized(){
        findElement();
        elements.getlinks().click();
        links.getUnauthorized();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 401 and status text Unauthorized");
    }

    @Test
    public void forbidden(){
        findElement();
        elements.getlinks().click();
        links.getForbidden();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 403 and status text Forbidden");
    }

    @Test
    public void notFound(){
        findElement();
        elements.getlinks().click();
        links.getNotFound();
        scroll();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),"Link has responded with staus 404 and status text Not Found");
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
