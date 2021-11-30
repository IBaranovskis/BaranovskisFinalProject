package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UserDataPage extends TestBase {
    private final By firstNameField = By.xpath("//input[@id='address_first_name']");
    private final By lastNameField = By.xpath("//input[@id='address_last_name']");
    private final By phoneNumberField = By.xpath("//input[@id='address_phone_number']");
    private final By cityField = By.xpath("//span[@role='combobox']");
    private final By searchCity = By.xpath("//input[@role='searchbox']");
    private final By addressField = By.xpath("//input[@id='address_street']");
    private final By postcodeField = By.xpath("//input[@id='address_postal_code']");
    private final By continueButton = By.xpath("//button[contains(text(),'Turpināt')]");

    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setPhoneNumberField(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void setCityField(String cityName) {
        driver.findElement(cityField).click();
        driver.findElement(searchCity).sendKeys(cityName);
        driver.findElement(searchCity).sendKeys(Keys.ENTER);
    }

    public void setAddressField(String addressName) {
        driver.findElement(addressField).sendKeys(addressName);
    }

    public void setPostcodeField(String number) {
        driver.findElement(postcodeField).sendKeys(number);
    }

    public void setContinueButton() {
        driver.findElement(continueButton).click();
    }

}
