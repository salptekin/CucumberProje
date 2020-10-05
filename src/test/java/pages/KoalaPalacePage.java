package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KoalaPalacePage {

    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy ( id = "UserName")
    public WebElement userNameKutusu;

    @FindBy ( id = "Password" )
    public WebElement passwordKutusu;

    @FindBy ( xpath = "//button[.='Log in']")
    public WebElement girisButonu;

    @FindBy ( id = "Code")
    public WebElement hotelCreateCodeKutusu;

    @FindBy ( id = "Name")
    public WebElement hotelCreateNameKutusu;

    @FindBy ( id = "Address")
    public WebElement hotelCreateAddressKutusu;

    @FindBy ( id = "Phone")
    public WebElement hotelCreatePhoneKutusu;

    @FindBy (id = "Email")
    public WebElement hotelCreateEmailKutusu;

    @FindBy (id = "IDGroup")
    public WebElement hotelCreateIDGroupDropdown;

    @FindBy (id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;

    @FindBy (className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;

    @FindBy ( id = "IDHotel" )
    public WebElement hotelRoomCreateIDHotelDropdown ;

    @FindBy ( id = "Code" )
    public WebElement hotelRoomCreateCodeKutusu ;

    @FindBy ( id = "Name" )
    public WebElement hotelRoomCreateNameKutusu ;

    @FindBy ( id = "Location" )
    public WebElement hotelRoomCreateLocationKutusu ;

    @FindBy ( xpath = "//*[@id='cke_1_contents']/textarea")
    public WebElement hotelRoomCreateDescriptionKutusu ;

    @FindBy ( id = "Price" )
    public WebElement hotelRoomCreatePriceKutusu ;

    @FindBy ( xpath = "//*[@data-id='500']/a")
    public WebElement hotelRoomCreatePrice500 ;

    @FindBy ( id = "IDGroupRoomType" )
    public WebElement hotelRoomCreateIDGroupRoomTypeDropDown;

    @FindBy ( id = "MaxAdultCount" )
    public WebElement hotelRoomCreateMaxAdultKutusu;

    @FindBy ( id = "MaxChildCount" )
    public WebElement hotelRoomCreateMaxChildKutusu;

    @FindBy ( id = "btnSubmit" )
    public WebElement hotelRoomCreateSaveButonu ;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomCreateBasariliYazisi;

    @FindBy ( id = "IDUser" )
    public WebElement hotelRoomReservationCreateIDUserDropdown;

    @FindBy ( id = "IDHotelRoom")
    public WebElement hotelRoomReservationCreateIDHotelRoomDropdown ;

    @FindBy ( id = "Price")
    public WebElement hotelRoomReservationCreatePriceKutusu ;

    @FindBy ( id = "DateStart")
    public WebElement hotelRoomReservationCreateDateStartKutusu ;

    @FindBy ( id = "DateEnd")
    public WebElement hotelRoomReservationCreateDateEndKutusu ;

    @FindBy ( id = "AdultAmount")
    public WebElement hotelRoomReservationCreateAdultAmountKutusu ;

    @FindBy ( id = "ChildrenAmount")
    public WebElement hotelRoomReservationCreateChildrenAmountKutusu ;

    @FindBy ( id = "ContactNameSurname")
    public WebElement hotelRoomReservationCreateNameSurnameKutusu ;

    @FindBy ( id = "ContactPhone")
    public WebElement hotelRoomReservationCreatePhoneKutusu ;

    @FindBy ( id = "ContactEmail")
    public WebElement hotelRoomReservationCreateEmailKutusu ;

    @FindBy ( id = "Notes")
    public WebElement hotelRoomReservationCreateNotesKutusu ;

    @FindBy ( id = "btnSubmit")
    public WebElement hotelRoomReservationCreateSaveButonu ;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomReservationCreateBasariliYazisi;

    @FindBy ( xpath = "//label[@class='error']")
    public WebElement hataMesaji;

    @FindBy ( name = "Code" )
    public WebElement hotelListCodeKutusu;

    @FindBy ( xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelListSearchButonu;

    @FindBy ( xpath = "//tbody/tr[1]")
    public WebElement hotelListIlkSatir;

    @FindBy ( xpath = "//tbody/tr[1]/td[2]")
    public WebElement hotelListIlkSatirCodeSutunu;

    @FindBy ( className = "dataTables_info")
    public WebElement hotelListToplamSonucSayisi;

    @FindBy ( id = "lkpHotels")
    public WebElement hotelRoomListIDHotelDropdown;

    @FindBy ( name = "Code")
    public WebElement hotelRoomListCodeKutusu;

    @FindBy ( name = "Name" )
    public WebElement hotelRoomListNameKutusu;

    @FindBy ( name = "Location" )
    public WebElement hotelRoomListLocationKutusu;

    @FindBy ( xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelRoomListAramaKutusu;

    @FindBy ( className = "dataTables_info")
    public WebElement hotelRoomListSonucSayisi;

    @FindBy ( xpath = "//tbody/tr[1]")
    public WebElement hotelRoomListIlkSatir;

    @FindBy ( className = "dataTables_empty" )
    public WebElement hotelCreateKayitBulunamadiYazisi;

    @FindBy ( id = "lkpHotelRooms" )
    public WebElement hotelReservationListHotelRoomIdDropdown;

    @FindBy ( xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelReservationListAramaKutusu;

    @FindBy ( xpath = "//tbody/tr")
    public List<WebElement> hotelReservationListIlkSayfaSonuclari;

    @FindBy ( id = "Code")
    public WebElement hotelEditCodeKutusu;

    @FindBy ( id = "Name")
    public WebElement hotelEditNameKutusu;

    @FindBy ( id = "Address")
    public WebElement hotelEditAdressKutusu;

    @FindBy ( id = "Phone")
    public WebElement hotelEditPhoneKutusu;

    @FindBy ( id = "Email")
    public WebElement hotelEditEmailKutusu;

    @FindBy ( xpath = "//button[@class='btn green']")
    public WebElement hotelEditSaveButonu;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelEditBasariliYazisi;

    @FindBy ( linkText = "Properties")
    public WebElement hotelRoomEditPropertiesLinki;

    @FindBy ( id = "lkpBarcodeTypes" )
    public WebElement hotelRoomEditPropertiesTipDropdown;

    @FindBy ( id = "txtBarcodeCode" )
    public WebElement hotelRoomEditPropertiesCodeKutusu;

    @FindBy ( id = "txtBarcode")
    public WebElement hotelRoomEditPropertiesValueKutusu;

    @FindBy ( xpath = "//button[@onclick='javascript:AddBarcode();return false;']")
    public WebElement hotelRoomEditPropertiesSaveButonu;

    @FindBy ( xpath = "//tbody/tr[1]/td[6]/a")
    public WebElement hotelRoomEditPropertiesIlkKayitRemoveButonu;












}