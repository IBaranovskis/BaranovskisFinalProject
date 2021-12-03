package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;


public class ComputerPage extends TestBase {

    private final By productTitle = By.xpath("//h1[contains(text(),'Stacionārs dators Komputronik Ultimate X711')]");
    private final By addToCart = By.xpath("//button[@id='add_to_cart_btn']");
    private final By browseShoppingCart = By.xpath("//a[contains(text(),'Pārlūkot pirkumu grozu')]");

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }

    public String getProductPrice(String price) {
        return driver.findElement(By.xpath("//span[normalize-space()='" + price + "']")).getText();
    }

    public void selectAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void setBrowseShoppingCart() {
        driver.findElement(browseShoppingCart).click();
    }
}
