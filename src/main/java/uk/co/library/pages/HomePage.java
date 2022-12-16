package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
    WebElement acceptAll;

    @CacheLookup
    @FindBy(xpath = "(//iframe)[4]")
    WebElement iframe;



    public void acceptAlert() {
        Reporter.log("Click on Accept All " + acceptAll.toString());
        clickOnElement(acceptAll);
        CustomListeners.test.log(Status.PASS, "Click on Accept All ");
    }

    public void enterJobTitle(String enterJobTitle) {
        Reporter.log("Enter job title " + jobTitle.toString());
        sendTextToElement(jobTitle, enterJobTitle);
        CustomListeners.test.log(Status.PASS, "Enter job title  ");
    }

    public void enterLocation(String EnterLocation) {
        Reporter.log("Enter location " + location.toString());
        sendTextToElement(location, EnterLocation);
        CustomListeners.test.log(Status.PASS, "Enter Location ");
    }

    public void selectDistance( String distance) {
        Reporter.log("Enter Distance " + distanceDropDown.toString());
        sendTextToElement(distanceDropDown,distance);
       CustomListeners.test.log(Status.PASS, "Enter Distance ");
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on search option " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on search option ");
    }

    public void enterMinSalary(String minsalary) {
        Reporter.log("Enter Minimum salary " + salaryMin.toString());
        sendTextToElement(salaryMin, minsalary);
        CustomListeners.test.log(Status.PASS, "Enter Minimum salary ");
    }

    public void enterMaxSalary(String maxsalary) {
        Reporter.log("Enter Maximun salary " + salaryMax.toString());
        sendTextToElement(salaryMax,maxsalary);
        CustomListeners.test.log(Status.PASS, "Enter Maximun salary");
    }

    public void selectSalaryType(String salarytype) {
        Reporter.log("Enter salary type " + salaryTypeDropDown.toString());
        sendTextToElement(salaryTypeDropDown,salarytype);
        CustomListeners.test.log(Status.PASS, "Enter salary type ");
    }

    public void selectJobType(String jobtype) {
        Reporter.log("Enter job type " + jobTypeDropDown.toString());
        sendTextToElement(jobTypeDropDown,jobtype);
        CustomListeners.test.log(Status.PASS, "Enter job type ");
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on the find job button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "Click on the find job button ");
    }


}
