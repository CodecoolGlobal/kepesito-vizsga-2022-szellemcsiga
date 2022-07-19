import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.util.List;

public class SeleniumTest extends TestBasePage {

    /*
    Tölts be a böngészőbe az alábbi oldalt: https://demo.seleniumeasy.com/basic-first-form-demo.html
    Írj tesztesetet két szám összegének ellenőrzésére a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. Az oldalon, a Two Input Fields” szekcióban két beviteli mezőjét töltsd ki tetszőleges számokkal, majd végezd el a számok összeadásának ellenőrzését kiolvasva az oldalon megjelenő összeget.
    Használj tetszőleges tesztadatot
     */






    @Test
    public void TestInput()
    {
        TwoInputFields input = new TwoInputFields(driver);

        input.navigate();

        input.clickOnX();
        input.enterFirstNum("2");
        input.enterSecondNum("12");
        input.getTotal();
        String result = input.getResultMessage();

        Assertions.assertEquals("14", result);
    }


    /*
    Töltsd be az alábbi oldalt a böngészőbe: zhttps://demo.seleniumeasy.com/basic-select-dropdown-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet a következők szerint: a Select List Demo szekció lenyíló mezőjében válaszd ki a hét utolsó napját és ellenőrizd, hogy az oldalon helyesen jelenik meg a kiválasztott érték
    Tesztadatként használd az hét utolsó napját
     */
    public void SelectDayTest()
    {  DropDownInputTest drop = new DropDownInputTest(driver);
        drop.navigate();
        WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Sunday");
        //dropdown.selectByIndex(7); ha az angol hetet nézzük, akkor szombat az utolsó nap. Ebben az esetben az Assertionsnál át kell írni Saturday-re az expected szövegben a napot.
        String message = drop.getMessage();

        Assertions.assertEquals("Day selected :- Sunday", message);}

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/bootstrap-modal-demo.html#
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
    A tesztesetben ellenőrizd a modal alert ablak szöveges tartalmát összahasonlítva egy általad definiált elvárt eredménnyel.
    Nyisd meg a Single Modal ablakot, tárolt el az ablakon megjelenő szöveget egy változóba és zárd be az ablakot a bezárás gombbal
     */
    @Test
    public void AlertTest() throws InterruptedException {
        Alert alert = new Alert(driver);
        alert.navigate();
        alert.clickOnButton();
        Thread.sleep(3000);
        String result = alert.getString();


        String expected = "This is the place where the content for the modal dialog displays";
        Assertions.assertEquals(expected, result);
        alert.closeButton();



    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/data-list-filter-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
    A teszteset ellenőrizze a névjegykártyák tartalmát.Olvasd ki a neveket a megjelenő névjegykártyákról és
    ellenőrzésként hasonlítsd össze egy elvárt eredményként megadott listával.
    Használj relatív útvonalat a névjegykártya név elemeinek kiolvasásához.
     */
    public void NamecardTest()
    {



    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/table-data-download-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
    A tesztesetet ellenőrizze a táblázatból a neveket, amelyeket a táblázat első oszlop tartalmaz.
     Gyűjtsd össze a neveket és tárold le a names.txt fájlba majd a tesztesetben a fájl tartalmát hasonlítsd össze
     egy elvárt eredménnyel.
     */
   @Test
    public void TableTest() throws FileNotFoundException {

       Table table = new Table(driver);
       table.navigate();


    }

}
