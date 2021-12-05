package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;


public class ComputerPage extends TestBase {

    private final By productTitle = By.xpath("//div[@class='product-righter google-rich-snippet']/h1");
    private final By productPrice = By.xpath("//span[@class='price']/span[1]");
    private final By addToCart = By.xpath("//button[@id='add_to_cart_btn']");
    private final By browseShoppingCart = By.xpath("//a[contains(text(),'Pārlūkot pirkumu grozu')]");

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public void selectAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void setBrowseShoppingCart() {
        driver.findElement(browseShoppingCart).click();
    }
}
