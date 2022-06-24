package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void selectCheckBoxHome(){
        findElement();
        elements.getcheckBox().click();
        checkBox.getSelectHome().click();
        Assert.assertTrue(checkBox.getMessage().isDisplayed());
    }

    @Test
    public void selectPrivate(){
        findElement();
        elements.getcheckBox().click();
        checkBox.getPlusButton().click();
        checkBox.getSelectPrivate().click();
        Assert.assertTrue(checkBox.getMessage().isDisplayed());
    }
}
