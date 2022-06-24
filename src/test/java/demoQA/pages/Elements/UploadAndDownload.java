package demoQA.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {

    public WebDriver driver;

    public UploadAndDownload(WebDriver driver) {
        this.driver = driver;
    }

    By download = By.id("downloadButton");
    By chooseFile = By.id("uploadFile");
    By fileAddress = By.id("uploadedFilePath");


    public WebElement getdownload(){
        return driver.findElement(download);
    }

    public WebElement getchooseFile(){
       return driver.findElement(chooseFile);
    }

    public WebElement getAddress(){
      return driver.findElement(fileAddress);
    }

}
