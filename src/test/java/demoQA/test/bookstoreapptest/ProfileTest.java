package demoQA.test.bookstoreapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ProfileTest extends LogInTest{

    @Test
    public void findProfile(){
        findBookStoreApp();
        bookStoreApp.getProfile();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void LoginViaProfilePage(){
        findProfile();
        bookStoreApp.getLogIn();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }
    @Test
    public void RegisterViaProfilePage(){
        findProfile();
        profilePage.getIfYouAreLogoutToRegister();
        wdw.until(ExpectedConditions.urlToBe("https://demoqa.com/register"));
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");
    }


    @Test
    public void goToBookStore(){
        logIn();
        bookStoreApp.getBookStore();
        wdw.until(ExpectedConditions.urlToBe("https://demoqa.com/books"));
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }

    @Test
    public void fieldSearch() throws InterruptedException {
        logIn();
        profilePage.inputInSearchBox("Git");
        Thread.sleep(1000);
        assertTrue(driver.findElement(By.xpath("//div[@class='rt-tr -odd']")).isDisplayed());
    }

    @Test
    public void rowsDropDown(){
        logIn();
        profilePage.getSelect("10");
        List<WebElement> list =driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < list.size(); i++) {
            if (list.size() != 10)
                fail();
        }
    }

    @Test
    public void deleteAllBooksCancel() {
        logIn();
        profilePage.getDeleteAllBooks();
        profilePage.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @Test
    public void deleteAllBooksOk(){
        logIn();
        profilePage.getDeleteAllBooks();
        profilePage.getModalOkButton();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void deleteOneBookCancel(){
        logIn();
        profilePage.getDeleteOneBook();
        profilePage.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }


   /* Ne moze da obrise jednu knjigu jer smo u prethodno obrisali sve
    @Test
    public void deleteOneBookOk(){
        logIn();
        profilePage.getDeleteOneBook();
        profilePage.getModalOkButton();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }*/

    @Test
    public void deleteAccountCancel(){
        logIn();
        profilePage.getDeleteAccountButton();
        profilePage.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    //Ne pustati brise se Account
    /*@Test
    public void deleteAccountOk(){
        logIn();
        profilePage.getDeleteAccountButton();
        profilePage.getModalOkButton();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");

    }*/
}
