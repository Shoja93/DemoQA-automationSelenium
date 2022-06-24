package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DinamicPropertiesTest extends BaseTest {

    @Test
    public void enableAfterTest(){
        findElement();
        elements.getdynamicProperties().click();
        dinamicProperties.getEnableAfter();
        Assert.assertTrue(driver.findElement(By.id("enableAfter")).isEnabled());
    }

    @Test
    public void colorChanged(){
        findElement();
        elements.getdynamicProperties().click();
        dinamicProperties.getColorChange();
        Assert.assertTrue(driver.findElement(By.cssSelector(".mt-4.text-danger.btn.btn-primary")).isDisplayed());
    }

    @Test
    public void visibleAfter(){
        findElement();
        elements.getdynamicProperties().click();
        dinamicProperties.getVisibleAfter5Seconds();
        Assert.assertTrue(driver.findElement(By.id("visibleAfter")).isDisplayed());
    }
}
