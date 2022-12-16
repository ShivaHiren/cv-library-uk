package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

//2.ResultPage
//    Locators - resultText
//    Method - verifyTheResults(String expected)


    @CacheLookup
    @FindBy(xpath = "//div[@class='search-header']//h1")
    WebElement resultText;


    public void verifyTheResults(String excepted ) {
        Assert.assertEquals(getTextFromElement(resultText),excepted);

    }

}
