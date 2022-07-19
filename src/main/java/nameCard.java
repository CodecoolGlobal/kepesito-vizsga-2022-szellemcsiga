import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nameCard extends BasePage{

    public nameCard(WebDriver drv) {
        super(drv);
    }
    private final String url = "https://demo.seleniumeasy.com/table-data-download-demo.html";
    public void navigate()
    {
        driver.navigate().to(url);
    }
   // public final By findText= By.xpath("//*[/html/body/div[2]/div/div[2]/section/div/div[2]/div[1]/div/h4\"]//*[text()=\\\"Name: \\\"]"]);



}

