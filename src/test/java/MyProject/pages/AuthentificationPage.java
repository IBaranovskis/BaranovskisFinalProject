package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;

public class AuthentificationPage extends TestBase {

    private final By selectEmail = By.xpath("//form[@id='new_user_guest']//input[@id='user_email']");
    private final By continueButton = By.xpath("//input[@value='Turpināt']");

    public void setEmailField(String email) {
        driver.findElement(selectEmail).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

}
