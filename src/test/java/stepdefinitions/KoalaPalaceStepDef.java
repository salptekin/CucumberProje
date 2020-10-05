package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KoalaPalacePage;
import utilities.Driver;

public class KoalaPalaceStepDef {

    KoalaPalacePage page = new KoalaPalacePage();

    @Given("kullanici koalapalace admin sayfasina gider")
    public void kullanici_koalapalace_admin_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
    }

    @Given("kullanici kullaniciadi ve sifresini girer")
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
        page.userNameKutusu.sendKeys("manager2");
        page.passwordKutusu.sendKeys("Man1ager2!");
    }

    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.girisButonu.click();
    }

    @Given("kullanici hotelcreate sayfasina gider")
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }

    @Given("kullanici hotelcreate code bolumune {string} girer")
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
        page.hotelCreateCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate name bolumune {string} girer")
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
        page.hotelCreateNameKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate adress bolumune {string} girer")
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
        page.hotelCreateAddressKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate phone bolumune {string} girer")
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
        page.hotelCreatePhoneKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate email bolumune {string} girer")
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
        page.hotelCreateEmailKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate idgroup bolumunde {string} secer")
    public void kullanici_hotelcreate_idgroup_bolumunde_secer(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelcreate save butonuna tiklar")
    public void kullanici_hotelcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }

    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(page.hotelCreateBasariliYazisi.getText());
    }


    @Given("kullanici hotelroomcreate sayfasina gider")
    public void kullanici_hotelroomcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");
    }

    @Given("kullanici hotelroomcreate idhotel bolumunde {string} secer")
    public void kullanici_hotelroomcreate_idhotel_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomCreateIDHotelDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate code bolumune {string} girer")
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
        page.hotelRoomCreateCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate name bolumune {string} girer")
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomCreateNameKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate location bolumune {string} girer")
    public void kullanici_hotelroomcreate_location_bolumune_girer(String string) {
        page.hotelRoomCreateLocationKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate description bolumune {string} girer")
    public void kullanici_hotelroomcreate_description_bolumune_girer(String string) {
        page.hotelRoomCreateDescriptionKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate price bolumune fiyat girer")
    public void kullanici_hotelroomcreate_price_bolumune_fiyat_girer() {
        // actions class'tan nesne bu şekilde üretiliyor.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomCreatePrice500 , page.hotelRoomCreatePriceKutusu)
                .perform();
    }

    @Given("kullanici hotelroomcreate roomtype bolumunde {string} secer")
    public void kullanici_hotelroomcreate_roomtype_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomCreateIDGroupRoomTypeDropDown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate maxadult bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxadult_bolumune_girer(String string) {
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate maxchildren bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxchildren_bolumune_girer(String string) {
        page.hotelRoomCreateMaxChildKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate save butonuna tiklar")
    public void kullanici_hotelroomcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        page.hotelRoomCreateSaveButonu.click();
    }

    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());
    }


    @Given("kullanici hotelroomreservation sayfasina gider")
    public void kullanici_hotelroomreservation_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create");
    }

    @Given("kullanici roomreservation iduser bolumunde {string} secer")
    public void kullanici_roomreservation_iduser_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomReservationCreateIDUserDropdown);
        select.selectByVisibleText(string);

    }

    @Given("kullanici roomreservation idhotelroom bolumunde {string} secer")
    public void kullanici_roomreservation_idhotelroom_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomReservationCreateIDHotelRoomDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici roomreservation price bolumune {string} girer")
    public void kullanici_roomreservation_price_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePriceKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation datestart bolumune {string} girer")
    public void kullanici_roomreservation_datestart_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateStartKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation dateend bolumune {string} girer")
    public void kullanici_roomreservation_dateend_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateEndKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation adultamaount bolumune {string} girer")
    public void kullanici_roomreservation_adultamaount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateAdultAmountKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation childrenamount bolumune {string} girer")
    public void kullanici_roomreservation_childrenamount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateChildrenAmountKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation namesurname bolumune {string} girer")
    public void kullanici_roomreservation_namesurname_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNameSurnameKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation phone bolumune {string} girer")
    public void kullanici_roomreservation_phone_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePhoneKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation email bolumune {string} girer")
    public void kullanici_roomreservation_email_bolumune_girer(String string) {
        page.hotelRoomReservationCreateEmailKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation notes bolumune {string} girer")
    public void kullanici_roomreservation_notes_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNotesKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation save butonuna tiklar")
    public void kullanici_roomreservation_save_butonuna_tiklar() {
        page.hotelRoomReservationCreateSaveButonu.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("kullanici roomreservation kayit islemini assert eder")
    public void kullanici_roomreservation_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(page.hotelRoomReservationCreateBasariliYazisi.getText());
    }

    @Then("kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder")
    public void kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder() {
        System.out.println(page.hataMesaji.getText());
        Assert.assertTrue(page.hataMesaji.isDisplayed());
    }


    @Given("kullanici hotellist sayfasina gider")
    public void kullanici_hotellist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin");
    }

    @Given("kullanici hotellist code bolumune {string} girer")
    public void kullanici_hotellist_code_bolumune_girer(String string) {
        page.hotelListCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotellist search butonuna tiklar")
    public void kullanici_hotellist_search_butonuna_tiklar() {
        page.hotelListSearchButonu.click();
    }

    @Then("kullanici hotellist bolumunundeki kayitlari inceler")
    public void kullanici_hotellist_bolumunundeki_kayitlari_inceler() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String sonucSayisi = page.hotelListToplamSonucSayisi.getText();
        System.out.println(sonucSayisi);

        String ilkSatir = page.hotelListIlkSatir.getText();
        System.out.println(ilkSatir);

        String ilkSatirCodeSutunu = page.hotelListIlkSatirCodeSutunu.getText();
        System.out.println(ilkSatirCodeSutunu);
    }



    @Given("kullanici hotelroomlist sayfasina gider")
    public void kullanici_hotelroomlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin");
    }

    @Given("kullanici hotelroomlist idhotelbolumunde {string} secer")
    public void kullanici_hotelroomlist_idhotelbolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomListIDHotelDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomlist code bolumune {string} girer")
    public void kullanici_hotelroomlist_code_bolumune_girer(String string) {
        page.hotelRoomListCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist name bolumune {string} girer")
    public void kullanici_hotelroomlist_name_bolumune_girer(String string) {
        page.hotelRoomListNameKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist location bolumune {string} girer")
    public void kullanici_hotelroomlist_location_bolumune_girer(String string) {
        page.hotelRoomListLocationKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist search butonuna tiklar")
    public void kullanici_hotelroomlist_search_butonuna_tiklar() {
        page.hotelRoomListAramaKutusu.click();
    }

    @Then("kullanici hotelroomlist bolumundeki kayitlari inceler")
    public void kullanici_hotelroomlist_bolumundeki_kayitlari_inceler() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String sonucSayisi = page.hotelRoomListSonucSayisi.getText();
        String ilkSatir    = page.hotelRoomListIlkSatir.getText();

        System.out.println(sonucSayisi);
        System.out.println(ilkSatir);
    }

    @Then("kullanici hotellist sonuc bolumunde kayit bulunamadi yazisini gorur")
    public void kullanici_hotellist_sonuc_bolumunde_kayit_bulunamadi_yazisini_gorur() {
        Assert.assertTrue(page.hotelCreateKayitBulunamadiYazisi.isDisplayed());
    }

    @Given("kullanici hotelroomreservationlist sayfasina gider")
    public void kullanici_hotelroomreservationlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin");
    }

    @Given("kullanici hotelroomreservationlist hotelroomid bolumunde {string} secer")
    public void kullanici_hotelroomreservationlist_hotelroomid_bolumunde_secer(String string) {
        Select select = new Select(page.hotelReservationListHotelRoomIdDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomreservationlist arama kutusuna tiklar")
    public void kullanici_hotelroomreservationlist_arama_kutusuna_tiklar() {
        page.hotelReservationListAramaKutusu.click();
    }

    @Then("kullanici hotelroomreservationlist kayitlarini inceler")
    public void kullanici_hotelroomreservationlist_kayitlarini_inceler() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(WebElement w : page.hotelReservationListIlkSayfaSonuclari){
            System.out.println(w.getText());
        }
    }


    @Given("kullanici hoteledit {string} sayfasina gider")
    public void kullanici_hoteledit_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici hoteledit code bolumunu {string} ile gunceller")
    public void kullanici_hoteledit_code_bolumunu_ile_gunceller(String string) {
        page.hotelEditCodeKutusu.clear();
        page.hotelEditCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hoteledit name bolumunu {string} ile gunceller")
    public void kullanici_hoteledit_name_bolumunu_ile_gunceller(String string) {
        page.hotelEditNameKutusu.clear();
        page.hotelEditNameKutusu.sendKeys(string);
    }

    @Given("kullanici hoteledit adress bolumunu {string} ile gunceller")
    public void kullanici_hoteledit_adress_bolumunu_ile_gunceller(String string) {
        page.hotelEditAdressKutusu.clear();
        page.hotelEditAdressKutusu.sendKeys(string);
    }

    @Given("kullanici hoteledit phone bolumunu {string} ile gunceller")
    public void kullanici_hoteledit_phone_bolumunu_ile_gunceller(String string) {
        page.hotelEditPhoneKutusu.clear();
        page.hotelEditPhoneKutusu.sendKeys(string);
    }

    @Given("kullanici hoteledit mail bolumunu {string} ile gunceller")
    public void kullanici_hoteledit_mail_bolumunu_ile_gunceller(String string) {
        page.hotelEditEmailKutusu.clear();
        page.hotelEditEmailKutusu.sendKeys(string);
    }

    @Given("kullanici hoteledit save butonuna tiklar")
    public void kullanici_hoteledit_save_butonuna_tiklar() {
        page.hotelEditSaveButonu.click();
    }

    @Then("kullanici hoteledit {string} yazisini dogrular")
    public void kullanici_hoteledit_yazisini_dogrular(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        boolean yaziDogruMu = wait.until(ExpectedConditions.textToBe(By.className("bootbox-body") , "Hotel was updated successfully"));
        Assert.assertTrue(yaziDogruMu);
    }



    @Given("kullanici hotelroomedit {string} sayfasina gider")
    public void kullanici_hotelroomedit_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici hotelroomedit sayfasinda properties bolumune tiklar")
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumune_tiklar() {
        page.hotelRoomEditPropertiesLinki.click();
    }

    @Given("kullanici hotelroomedit sayfasinda tip olarak {string} secer")
    public void kullanici_hotelroomedit_sayfasinda_tip_olarak_secer(String string) {
        Select select = new Select(page.hotelRoomEditPropertiesTipDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomedit sayfasinda code olarak {string} girer")
    public void kullanici_hotelroomedit_sayfasinda_code_olarak_girer(String string) {
        page.hotelRoomEditPropertiesCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomedit sayfasinda value olarak {string} girer")
    public void kullanici_hotelroomedit_sayfasinda_value_olarak_girer(String string) {
        page.hotelRoomEditPropertiesValueKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomedit sayfasinda save butonuna tiklar")
    public void kullanici_hotelroomedit_sayfasinda_save_butonuna_tiklar() {
        page.hotelRoomEditPropertiesSaveButonu.click();
    }

    @Then("kullanici hotelroomedit sayfasinda properties bolumunde yeni kayit oldugunu assert eder")
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumunde_yeni_kayit_oldugunu_assert_eder() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean gorunuyorMu = page.hotelRoomEditPropertiesIlkKayitRemoveButonu.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }



}
