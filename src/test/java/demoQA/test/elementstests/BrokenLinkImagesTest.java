package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkImagesTest extends BaseTest {

    @Test
    public void validBrokenImages(){
        findElement();
        elements.getbrokenLinkImages().click();
        Assert.assertTrue(brokenLinksImages.getvalidImage().isDisplayed());
        Assert.assertTrue(brokenLinksImages.getbrokenImage().isDisplayed());
    }

    @Test
    public void validLink(){
        findElement();
        elements.getbrokenLinkImages().click();
        brokenLinksImages.getvalidLink().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/");
    }

    @Test
    public void brokenLink(){
        findElement();
        elements.getbrokenLinkImages().click();
        brokenLinksImages.getbrokenLink().click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://the-internet.herokuapp.com/status_codes/500");
    }
}
