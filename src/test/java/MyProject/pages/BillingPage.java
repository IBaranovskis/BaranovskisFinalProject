package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;

public class BillingPage extends TestBase {
    private final By checkBoxPrivacyPolicy = By.xpath("//input[@id='billing_tos']");
    private final By continueButton = By.xpath("//button[normalize-space()='Pirkt']");

    public void setCheckBoxPrivacyPolicy() {
        driver.findElement(checkBoxPrivacyPolicy).click();
    }

    public void setContinueButton() {
        driver.findElement(continueButton).click();
    }
}

