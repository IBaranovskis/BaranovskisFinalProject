package MyProject.pages;

import MyProject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage1aLv extends TestBase {
    private final By searchField = By.xpath("//input[@id='q']");

    public void setSearchField(String computer) {
        driver.findElement(searchField).sendKeys(computer);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

}
