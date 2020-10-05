package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy (  id = "twotabsearchtextbox" )
    public WebElement aramaKutusu;

    @FindBy ( className = "sg-col-inner")
    public WebElement sonucSayisi;

    @FindBy ( id = "searchDropdownBox" )
    public WebElement dropDown;

}
