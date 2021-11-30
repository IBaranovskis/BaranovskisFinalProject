package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;

public class CartPage extends TestBase {

    private final By paymentMethod = By.xpath("//input[@value='Veikt apmaksu']");

    public void setPaymentMethod() {
        driver.findElement(paymentMethod).click();
    }
}
