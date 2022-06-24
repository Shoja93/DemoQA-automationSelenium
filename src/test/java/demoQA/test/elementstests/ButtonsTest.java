package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test
    public void buttonsTest(){
        findElement();
        elements.getbuttons().click();
        buttons.getDoubleClickMe();
        buttons.getRightClikcMe();
        buttons.getClickMe().click();

        Assert.assertEquals(buttons.getdoubleClickMeMessage().getText(),"You have done a double click");
        Assert.assertEquals(buttons.getrightClickMeMessage().getText(),"You have done a right click");
        Assert.assertEquals(buttons.getclickMeMessage().getText(),"You have done a dynamic click");
    }

}
