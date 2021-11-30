package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CheckoutPage extends TestBase {

    private final By radioButtonClientsCenter = By.xpath("//input[@value='2']");
    private final By radioButtonShopCenter = By.xpath("//input[@value='3210']");
    private final By goToCheckOutButton = By.cssSelector(".main-button.upcase.fr.small-radius.button-min-width.checkout-shipping-continue-button");

    public void clickRadioButtonClientsCenter() {
        driver.findElement(radioButtonClientsCenter).click();
    }

    public void clickRadioButtonShopCenter() {
        driver.findElement(radioButtonShopCenter).click();
    }

    public void continueButton() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(goToCheckOutButton));
        Thread.sleep(2000);
        driver.findElement(goToCheckOutButton).click();
    }
}
