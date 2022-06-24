package demoQA.test.elementstests;

import demoQA.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadAndDownloadTest extends BaseTest {

    @Test
    public void upload(){
        findElement();
        elements.getuploadAndDownload().click();
        uploadAndDownload.getchooseFile().sendKeys("C:/Users/Nikola/Desktop/IT Bootcamp/Baze podataka.docx");
        Assert.assertEquals(uploadAndDownload.getAddress().getText(),"C:\\fakepath\\Baze podataka.docx");
    }

    @Test
    public void download() {
        findElement();
        elements.getuploadAndDownload().click();
        uploadAndDownload.getdownload().click();
    }
}
