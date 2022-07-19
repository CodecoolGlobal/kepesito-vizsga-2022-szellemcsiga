import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Table extends BasePage{
    public Table(WebDriver drv) throws FileNotFoundException {
        super(drv);
    }

    private final String url = "https://demo.seleniumeasy.com/table-data-download-demo.html";
    public void navigate()
    {
        driver.navigate().to(url);
    }

    public final By findText= By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[1]");

    public static String Read(String fileName) {
        String writtenText = "";
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                writtenText += line + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return writtenText.toString();
}
    public void saveTextFromPage()
    {
        String text = driver.findElement(findText).getText();
        File f = new File("savetxt.txt");
        try{
            FileUtils.writeStringToFile(f, text, Charset.defaultCharset());
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }

}


