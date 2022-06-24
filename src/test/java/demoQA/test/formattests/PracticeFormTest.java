package demoQA.test.formattests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void praticeForm(){
        findForms();
        forms.getpracticeForm().click();
        practiceForm.getFirstName();
        practiceForm.getLastName();
        practiceForm.getEmail();
        practiceForm.getGender1();
        practiceForm.getPhoneNumber();
        practiceForm.getDateOfBirthd();
        practiceForm.getMonth();
        practiceForm.getYear();
        practiceForm.getDay();
        practiceForm.getSubject("eng");
        practiceForm.getHoobies();
        practiceForm.getPictures();
        practiceForm.getCurrentAddrress();
        practiceForm.getState("Haryana");
        practiceForm.getCity("Karnal");
        practiceForm.getSubmitButton();
        Assert.assertEquals(driver.findElement(By.id("example-modal-sizes-title-lg")).getText(),"Thanks for submitting the form");
        Assert.assertTrue(driver.findElement(By.className("modal-body")).isDisplayed());
        practiceForm.getCloseModal();
    }
}
