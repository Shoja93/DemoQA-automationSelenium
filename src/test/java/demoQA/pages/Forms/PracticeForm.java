package demoQA.pages.Forms;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeForm {

    public WebDriver driver;

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By gender1 = By.xpath("//label[contains(text(),'Male')]");
    By gender2 = By.id("gender-radio-2");
    By gender3 = By.id("gender-radio-3");
    By phoneNumber = By.id("userNumber");
    By dateOfBirthd = By.id("dateOfBirthInput");
    By month = By.className("react-datepicker__month-select");
    By year = By.className("react-datepicker__year-select");
    By day = By.cssSelector("div[aria-label=\"Choose Sunday, October 3rd, 1993\"]");
    By subject = By.id("subjectsInput");
    By hobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]");
    By pictures = By.id("uploadPicture");
    By currentAddrress = By.id("currentAddress");
    By selectState = By.id("react-select-3-input");
    By selectCity = By.id("react-select-4-input");
    By submitButton = By.id("submit");
    By close = By.id("closeLargeModal");

    public void getFirstName() {
        driver.findElement(firstName).sendKeys("Nikola");
    }

    public void getLastName() {
        driver.findElement(lastName).sendKeys("Sojic");
    }

    public void getEmail() {
        driver.findElement(email).sendKeys("shoja93ue@gmial.com");
    }

    public void getGender1() {
        driver.findElement(gender1).click();
    }

    public void getGender2() {
        driver.findElement(gender2).click();
    }

    public void getGender3() {
        driver.findElement(gender3).click();
    }

    public void getPhoneNumber() {
        driver.findElement(phoneNumber).sendKeys("0641111111");
    }

    public void getDateOfBirthd() {
        driver.findElement(dateOfBirthd).click();
    }

    public void getMonth() {
        driver.findElement(month).click();
        Select sort1 = new Select(driver.findElement(month));
        List<WebElement> listMonth = sort1.getOptions();
        sort1.selectByVisibleText("October");

    }

    public void getYear() {
        driver.findElement(year).click();
        Select sort1 = new Select(driver.findElement(year));
        List<WebElement> listYear = sort1.getOptions();
        sort1.selectByValue("1993");

    }

    public void getDay() {
        driver.findElement(day).click();
    }

    public void getSubject() {
        scroll();
        WebElement subjects = driver.findElement(subject);
        subjects.sendKeys("e");
        subjects.sendKeys(Keys.ENTER);
    }

    public void getHoobies() {
        driver.findElement(hobbies).click();
    }

    public void getPictures() {
        driver.findElement(pictures).sendKeys("C:/Users/Nikola/Desktop/IT Bootcamp/Baze podataka.docx");
    }

    public void getCurrentAddrress() {
        driver.findElement(currentAddrress).sendKeys("Bulevar Oslobodjenja");
    }

    public void getState(){
        scroll();
        WebElement state = driver.findElement(selectState);
        state.sendKeys("Haryana");
        state.sendKeys(Keys.ENTER);
    }

    public void getCity(){
        WebElement city = driver.findElement(selectCity);
        city.sendKeys("Karnal");
        city.sendKeys(Keys.ENTER);
    }

    public void getSubmitButton(){
        driver.findElement(submitButton).submit();
    }

    public void getCloseModal(){
        scroll();
        driver.findElement(close).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
