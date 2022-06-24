package demoQA.base;

import demoQA.pages.BookStoreApp.BookStore;
import demoQA.pages.BookStoreApp.BookStoreApp;
import demoQA.pages.BookStoreApp.LoginPage;
import demoQA.pages.Elements.*;
import demoQA.pages.Forms.Forms;
import demoQA.pages.Forms.PracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {
    public final String url = "https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdw;
    public HomePage homePage;
    public Elements elements;
    public Forms forms;
    public BookStoreApp bookStoreApp;
    public PracticeForm practiceForm;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public Buttons buttons;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadAndDownload uploadAndDownload;
    public WebTables webTables;
    public DinamicProperties dinamicProperties;
    public LoginPage loginPage;
    public BookStore bookStore;


    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(url);
    }


    @BeforeClass
    public void beforeClass(){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePage = new HomePage(driver);
        elements = new Elements(driver);
        forms = new Forms(driver);
        bookStoreApp = new BookStoreApp(driver);
        practiceForm = new PracticeForm(driver);
        textBox = new TextBox(driver);
        checkBox = new CheckBox(driver);
        radioButton = new RadioButton(driver);
        buttons = new Buttons(driver);
        links = new Links(driver);
        brokenLinksImages = new BrokenLinksImages(driver);
        uploadAndDownload = new UploadAndDownload(driver);
        webTables = new WebTables(driver);
        dinamicProperties = new DinamicProperties(driver,wdw);
        loginPage = new LoginPage(driver);
        bookStore = new BookStore(driver);
    }

    @AfterClass
    public void afterClass(){
        //driver.quit();
    }
}
