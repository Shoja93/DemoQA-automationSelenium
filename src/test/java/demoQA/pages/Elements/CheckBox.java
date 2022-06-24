package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    public WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    By home = By.className("rct-checkbox");
    By underHome = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]");
    By underDesktop = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]");
    By underDocuments = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[1]");
    By underDownloads = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[1]");
    By selectHome = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectDesktop = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectDocuments = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]");
    By selectDownloads = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]");
    By selectNotes = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectCommands = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]");
    By selectReact = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectAngular = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]");
    By selectVeu = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]");
    By selectPublic = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectPrivate = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]");
    By selectClassified = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]");
    By selectGeneral = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[1]");
    By selectWordFile = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");
    By selectExcelFile = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]");
    By plusButton = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]/*[1]");
    By minusButton = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]/*[1]");
    By message = By.id("result");

    public WebElement getHome() {
        return driver.findElement(home);
    }

    public WebElement getUnderHome() {
        return driver.findElement(underHome);
    }

    public WebElement getUnderDesktop() {
        return driver.findElement(underDesktop);
    }

    public WebElement getUnderDocuments() {
        return driver.findElement(underDocuments);
    }

    public WebElement getUnderDownloads() {
        return driver.findElement(underDownloads);
    }

    public WebElement getSelectHome() {
        return driver.findElement(selectHome);
    }

    public WebElement getSelectDesktop() {
        return driver.findElement(selectDesktop);
    }

    public WebElement getSelectDocuments() {
        return driver.findElement(selectDocuments);
    }

    public WebElement getSelectDownloads() {
        scroll();
        return driver.findElement(selectDownloads);
    }

    public WebElement getSelectNotes() {
        scroll();
        return driver.findElement(selectNotes);
    }

    public WebElement getSelectCommands() {
        scroll();
        return driver.findElement(selectCommands);
    }

    public WebElement getSelectReact() {
        scroll();
        return driver.findElement(selectReact);
    }

    public WebElement getSelectAngular() {
        scroll();
        return driver.findElement(selectAngular);
    }

    public WebElement getSelectVeu() {
        scroll();
        return driver.findElement(selectVeu);
    }

    public WebElement getSelectPublic() {
        return driver.findElement(selectPublic);
    }

    public WebElement getSelectPrivate() {
        scroll();
        return driver.findElement(selectPrivate);
    }

    public WebElement getSelectClassified() {
        scroll();
        return driver.findElement(selectClassified);
    }

    public WebElement getSelectGeneral() {
        scroll();
        return driver.findElement(selectGeneral);
    }

    public WebElement getSelectWordFile() {
        scroll();
        return driver.findElement(selectWordFile);
    }

    public WebElement getSelectExcelFile() {
        scroll();
        return driver.findElement(selectExcelFile);
    }

    public WebElement getPlusButton() {
        return driver.findElement(plusButton);
    }

    public WebElement getMinusButton() {
        return driver.findElement(minusButton);
    }

    public WebElement getMessage() {
        scroll();
        return driver.findElement(message);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
