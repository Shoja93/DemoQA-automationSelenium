package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

    public WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    By yes = By.cssSelector("label[for=\"yesRadio\"]");
    By impressive = By.cssSelector("label[for=\"impressiveRadio\"]");
    By no = By.cssSelector("label[for=\"noRadio\"]");
    By message = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > p.mt-3:nth-child(5)");

    public WebElement getYes(){
        return driver.findElement(yes);
    }

    public WebElement getImpressive(){
        return driver.findElement(impressive);
    }

    public WebElement getNo(){
        return driver.findElement(no);
    }

    public WebElement getMessage(){
        return driver.findElement(message);
    }


}
