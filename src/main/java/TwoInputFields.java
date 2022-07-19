import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoInputFields extends BasePage{


    public TwoInputFields(WebDriver drv) {
        super(drv);
    }
    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By firstNumber = By.id("sum1");
    private final By secondNumber = By.id("sum2");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By totalamount = By.id("displayvalue");
    By xButton = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");


    public void navigate()
    {
        driver.navigate().to(url);
    }

    public void enterFirstNum(String num1)
    {
        driver.findElement(firstNumber).sendKeys(num1);
    }
    public void enterSecondNum(String num2)
    {
        driver.findElement(secondNumber).sendKeys(num2);
    }
    public void getTotal()
    {
        driver.findElement(getTotalButton).click();
    }
    public String getResultMessage()
    {
        String result = driver.findElement(totalamount).getText();

        return result;
    }
    public void clickOnX()
    {
        driver.findElement(xButton).click();
    }
}
