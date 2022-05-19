package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage(){
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement NewAndUsedCarSearchTitleText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement searchTitleText;



    public String  getNewAndUsedCarSearchTitleText(){
        log.info(" get title text of New and used car search page" + NewAndUsedCarSearchTitleText.getText());
        return getTextFromElement(NewAndUsedCarSearchTitleText);
    }

    public void setSelectMake(String make){
        log.info("select make ' "+ make + " ' "+ "<br>");
        selectByVisibleTextFromDropDown(selectMake,make);
    }

    public void setSelectModel(String model){
        log.info(" select model ' " + model + " ' " + "<br>");
        selectByVisibleTextFromDropDown(selectModel, model);
    }

    public void setSelectLocation(String location){
        log.info("select location ' " + location + " ' "+ "<br>" );
        selectByVisibleTextFromDropDown(selectLocation,location);
    }

    public void setSelectPrice(String price){
        log.info("select price ' " + price + " ' " + "<br>");
        selectByVisibleTextFromDropDown(selectPrice, price);
    }

    public void clickOnFindMyNextCarTab(){
        log.info(" clicking on find my next car tab "+ findMyNextCarTab.getText());
        clickOnElement(findMyNextCarTab);
    }

    public String getSearchTextFromProduct(){
        waitUntilVisibilityOfElementLocated(By.xpath("//h1[@class='listing-search-title']"),20);
        log.info(" get search text from product " + searchTitleText.getText());
        return searchTitleText.getText();
    }
}
