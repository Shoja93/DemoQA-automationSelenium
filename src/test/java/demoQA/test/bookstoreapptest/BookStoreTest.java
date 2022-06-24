package demoQA.test.bookstoreapptest;

import demoQA.test.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BookStoreTest extends LogInTest {

    @Test
    public void addBook() throws InterruptedException {
        logIn();
        bookStoreApp.getBookStore();
        bookStore.addBook("Git Pocket Guide");
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
