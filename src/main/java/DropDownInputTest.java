import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownInputTest extends BasePage{
    public DropDownInputTest(WebDriver drv) {
        super(drv);
    }
    private final String url = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
   // private final By testDropDown = By.xpath("//*[@id=\"select-demo\"]");
    //Select dropdown = new Select((WebElement) testDropDown);
   private final By message = By.xpath("//*[@class=\"selected-value\"]");

    public String getMessage()
    {
        String result = driver.findElement(message).getText();

        return result;
    }

   // By xButton = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");


    public void navigate()
    {
        driver.navigate().to(url);
    }







}
