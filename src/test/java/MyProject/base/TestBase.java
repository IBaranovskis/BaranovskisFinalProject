package MyProject.base;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static ChromeDriver driver;

    public void startDriver() {
        String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
    }

    public void open(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void stopDriver() {
        driver.quit();
    }
}