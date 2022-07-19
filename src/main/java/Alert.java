import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert extends BasePage{


    public Alert(WebDriver drv) {
        super(drv);
    }
    private final String url = "https://demo.seleniumeasy.com/bootstrap-modal-demo.html#";
    private final By clickon = By.xpath("//html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    private final By modalMessage = By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");
    private  final By Close = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[2]");

    public void navigate()
    {
        driver.navigate().to(url);
    }
    public void clickOnButton()
    {
        driver.findElement(clickon).click();
    }
    public void closeButton()
    {
        driver.findElement(Close).click();
    }
    public String getString()
    {
        String result = driver.findElement(modalMessage).getText();

        return result;
    }
}
