package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBox(){
        findElement();
        elements.gettextBox().click();
        textBox.enterFullName();
        textBox.enterEmail();
        textBox.enterCurrentAddress();
        textBox.enterPermanentAddress();
        textBox.clickSubmit();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.text-field-container:nth-child(2) form:nth-child(1) div.mt-4.row:nth-child(6) > div.border.col-md-12.col-sm-12")).isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/text-box");
    }
}
