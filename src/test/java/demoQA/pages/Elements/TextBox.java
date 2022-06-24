package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TextBox {
    public WebDriver driver;

    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFullName(){
        driver.findElement(fullName).sendKeys("Nikola");
    }

    public void enterEmail(){
        driver.findElement(email).sendKeys("testprojekat@gmail.com");
    }

    public void enterCurrentAddress(){
        driver.findElement(currentAddress).sendKeys("Bulevar Oslobodjenja");
    }

    public void enterPermanentAddress(){
        driver.findElement(permanentAddress).sendKeys("Bulevar Oslobodjenja");
    }

    public void clickSubmit(){
        scroll();
        driver.findElement(submit).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
