package MyProject.testRunner;

import MyProject.base.TestBase;
import MyProject.models.CustomerConstants;
import MyProject.models.ProductConstants;
import MyProject.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineShopTests extends TestBase {

    private final int DEFAULT_SLEEP_VALUE = 3000;
    private final String ITEM = "Computer";

    private final CustomerConstants customerConstants = new CustomerConstants();
    private final ProductConstants productConstants = new ProductConstants();
    private final HomePage homePage = new HomePage();
    private final ProductPage productPage = new ProductPage();
    private final ComputerPage computerPage = new ComputerPage();
    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    private final AuthenticationPage authenticationPage = new AuthenticationPage();
    private final UserDataPage userDataPage = new UserDataPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final BillingPage billingPage = new BillingPage();

    @Before
    public void setUp() {
        startDriver();
        open("https://www.1a.lv/");
    }

    @After
    public void tearDown() {
        stopDriver();
    }

    @Test
    public void productSelectionTest() throws InterruptedException {
        productConstants.setSearchable("Computer");
        productConstants.setItemPrice("2.126,69");
        productConstants.setProductName("Stacionārs dators Komputronik Ultimate X711 [D1], Nvidia GeForce RTX 3070");

        homePage.setSearchField(productConstants.getSearchable());
        Thread.sleep(DEFAULT_SLEEP_VALUE);
        productPage.setSelectComputer(productConstants.getProductName());
        assertEquals("Product titles don't match", productConstants.getProductName(), computerPage.getProductTitle());
        assertEquals("Product price doesn't match", productConstants.getItemPrice(), computerPage.getProductPrice());
        computerPage.selectAddToCart();
        Thread.sleep(DEFAULT_SLEEP_VALUE);
        computerPage.setBrowseShoppingCart();
        shoppingCartPage.setPaymentMethod();
        authenticationPage.setEmailField(customerConstants.getEmail());
        authenticationPage.clickContinueButton();
        userDataPage.setFirstNameField(customerConstants.getFirstName());
        userDataPage.setLastNameField(customerConstants.getLastName());
        userDataPage.setPhoneNumberField(customerConstants.getPhoneNumber());
        userDataPage.setCityField(customerConstants.getCity());
        userDataPage.setAddressField(customerConstants.getAddress());
        userDataPage.setPostcodeField(customerConstants.getPostCode());
        userDataPage.setContinueButton();
        checkoutPage.clickRadioButtonClientsCenter();
        Thread.sleep(DEFAULT_SLEEP_VALUE);
        checkoutPage.clickRadioButtonShopCenter();
        Thread.sleep(DEFAULT_SLEEP_VALUE);
        checkoutPage.continueButton();
        billingPage.setCheckBoxPrivacyPolicy();
        billingPage.setContinueButton();
    }
}
