package demoQA.pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forms {

    public WebDriver driver;

    public Forms(WebDriver driver) {
        this.driver = driver;
    }

    By firstForm = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");
    public WebElement getpracticeForm(){
        return driver.findElement(firstForm);
    }
}
