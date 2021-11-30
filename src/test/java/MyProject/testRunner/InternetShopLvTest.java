package MyProject.testRunner;

import MyProject.base.TestBase;
import MyProject.pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternetShopLvTest extends TestBase {

    HomePage1aLv homePage1aLv = new HomePage1aLv();
    ProductPage productPage = new ProductPage();
    ComputerPage computerPage = new ComputerPage();
    CartPage cartPage = new CartPage();
    AuthentificationPage authentificationPage = new AuthentificationPage();
    UserDataPage userDataPage = new UserDataPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    BillingPage billingPage = new BillingPage();

    @Before
    public void setUp() {
        startDriver();
        open("https://www.1a.lv/");
    }

    @After
    public void tearDown() {
//        stopDriver();
    }

    @Test
    public void productSelectionTest() throws InterruptedException {
        homePage1aLv.setSearchField("Computer");
        Thread.sleep(3000);
        productPage.setSelectComputer();
        Assert.assertEquals("Stacionārs dators Komputronik Ultimate X711 [D1], Nvidia GeForce RTX 3070", computerPage.getProductTitle());
        Assert.assertEquals("2.094,76", computerPage.getProductPrice());
        computerPage.selectAddToCart();
        Thread.sleep(3000);
        computerPage.setBrowseShoppingCart();
        cartPage.setPaymentMethod();
        authentificationPage.setEmailField("qwdqwqdq@gmail.com");
        authentificationPage.clickContinueButton();
        userDataPage.setFirstNameField("QWdaqd");
        userDataPage.setLastNameField("Sfsldjf");
        userDataPage.setPhoneNumberField("25478215");
        userDataPage.setCityField("Riga");
        userDataPage.setAddressField("Khhfgfd");
        userDataPage.setPostcodeField("LV-1057");
        userDataPage.setContinueButton();
        Thread.sleep(2000);
        checkoutPage.clickRadioButtonClientsCenter();
        Thread.sleep(2000);
        checkoutPage.clickRadioButtonShopCenter();
        Thread.sleep(2000);
        checkoutPage.continueButton();
        billingPage.setCheckBoxPrivacyPolicy();
        billingPage.setContinueButton();

    }

}
