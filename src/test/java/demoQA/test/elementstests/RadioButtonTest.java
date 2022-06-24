package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtons(){
        findElement();
        elements.getradioButton().click();
        radioButton.getYes().click();
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Yes");

        radioButton.getImpressive().click();
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Impressive");

        radioButton.getNo().click();
        Assert.assertFalse(driver.findElement(By.cssSelector("label[for=\"noRadio\"]")).isSelected());
    }
}
