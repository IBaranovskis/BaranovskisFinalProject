package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;

public class ProductPage extends TestBase {

    public void setSelectComputer(String computer) {
        driver.findElement(By.xpath("//a[@class='ks-new-product-name'][contains(text(),'" + computer + "')]")).click();
    }
}
