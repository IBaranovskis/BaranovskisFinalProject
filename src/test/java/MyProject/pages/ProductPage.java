package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;

public class ProductPage extends TestBase {

    private final By selectComputer = By.xpath("//a[@class='ks-new-product-name'][contains(text(),'Stacionārs dators Komputronik Ultimate X711 [D1], ')]");

    public void setSelectComputer() {
        driver.findElement(selectComputer).click();
    }
}
