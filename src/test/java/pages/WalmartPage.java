package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WalmartPage {
    public WalmartPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy( id = "global-search-input" )
    public WebElement aramaKutusu;

    @FindBy( className = "result-summary-container" )
    public WebElement sonucSayisi;

}
