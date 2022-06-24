package demoQA.test.bookstoreapptest;

import demoQA.test.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
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
       // bookStore.getBackToBookStore();
    }

    @Test
    public void addBook2() throws InterruptedException {
        addBook();
        bookStore.getBackToBookStore();
        bookStore.addBook("Learning JavaScript Design Patterns");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void addBook3() throws InterruptedException {
        addBook2();
        bookStore.getBackToBookStore();
        bookStore.scroll();
        bookStore.addBook("Programming JavaScript Applications");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void addBook4() throws InterruptedException {
        addBook3();
        bookStore.getBackToBookStore();
        bookStore.addBook( "Designing Evolvable Web APIs with ASP.NET");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void addBook5() throws InterruptedException {
        addBook4();
        bookStore.getBackToBookStore();
        bookStore.addBook( "Eloquent JavaScript, Second Edition");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void addBook6() throws InterruptedException {
        addBook5();
        bookStore.getBackToBookStore();
        bookStore.addBook( "Understanding ECMAScript 6");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
