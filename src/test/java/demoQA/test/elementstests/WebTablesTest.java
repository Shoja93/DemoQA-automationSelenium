package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends BaseTest {


    @Test
    public void clickWebTables() {
        findElement();
        elements.getWebTables().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }

    @Test
    public void addNew() {
        clickWebTables();
        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Nikola", "Sojic", "testprojekat@gmial.com", "28", "9000", "Insurance");
    }

    @Test
    public void addNewClose() {
        clickWebTables();
        webTables.getAddNewRecordButton().click();
        webTables.getClose().click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".web-tables-wrapper")).isDisplayed());
    }

    @Test
    public void sort() {
        addNew();
        webTables.getSortFirstName().click();
        webTables.getSortLastName().click();
        webTables.getSortEmail().click();
        webTables.getSortAge().click();
        webTables.getSortSalary().click();
        webTables.getSortDepartment().click();
        webTables.getSortActions().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//div[@role='columnheader'])[1]")).isDisplayed());
    }

    @Test
    public void typeOfSearch() {
        clickWebTables();
        webTables.inputSearchBox("Alden");
        Assert.assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Alden']")).isDisplayed());
    }

    @Test
    public void searchButtonIsDisplayed() {
        clickWebTables();
        webTables.getSearchButton().isDisplayed();
        Assert.assertTrue(driver.findElement(By.id("basic-addon2")).isDisplayed());
    }

    @Test
    public void editFirstName() {
        clickWebTables();
        webTables.getEdit().click();
        webTables.getFirstName().clear();
        webTables.getFirstName().sendKeys("Marko");
        webTables.getSubmit().click();
        Assert.assertEquals(driver.findElement(By.xpath("(//div[normalize-space()='Marko'])[1]")).getText(), "Marko");
    }

    @Test
    public void delete() {
        clickWebTables();
        webTables.delete(0);
        List<WebElement> name = driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getText().compareTo(name.get(i).getText()) > 0) {
                Assert.fail();
            }
        }
    }

    @Test
    public void rows() {
        clickWebTables();
        webTables.select("5");
        List<WebElement> filter = driver.findElements(By.className("rt-tr-group"));
        int count = 0;
        for (int i = 0; i < filter.size(); i++) {
            if (filter.size() != 5)
                Assert.fail();
        }
    }

    @Test(priority = 11)
    public void addUsers() {
        clickWebTables();
        webTables.select("5");
        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Dragan", "Dragovic", "testprojekat@gmial.com", "19", "8000", "QA");
        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Marko", "Markovic", "testprojekat@gmial.com", "24", "13000", "QA");
        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Nikola", "Nikolic", "testprojekat@gmial.com", "36", "9700", "QA");
    }

    @Test
    public void nextPage() {
        addUsers();
        webTables.getPage().clear();
        webTables.getPage().sendKeys("2");
        webTables.getPage().sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.findElement(By.cssSelector(".-totalPages")).getText(), "2");
    }

    @Test
    public void nextButton() {
        addUsers();
        webTables.getNextPage().click();
        Assert.assertTrue(driver.findElement(By.className("-next")).isDisplayed());
    }

    @Test
    public void previousButton() {
        nextButton();
        webTables.getPreviousPage().click();
        Assert.assertTrue(driver.findElement(By.className("-previous")).isDisplayed());
    }

}
