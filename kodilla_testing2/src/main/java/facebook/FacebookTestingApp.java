package facebook;

import config.WebDriverConfig;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES_BUTTON = "//div[contains(@class, \"_9fiw\")]/button[contains(@class, \"_4jy1\")]";
    public static final String XPATH_NEW_ACCOUNT_BUTTON = "//div[contains(@class, \"_6ltg\")]/a";
    //    public static final String XPATH_FIRSTNAME = "//div[contains(@class, \"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input[contains(@class, \"inputtext _58mg _5dba _2ph-\")]";
//    public static final String XPATH_FIRSTNAME = "//div[contains(@class, \"5dbb\"/div[@class=\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\" and @name=\"firstname\"]";
    //  public static final String XPATH_FIRSTNAME = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\" and @id)]";
//   public static final String XPATH_FIRSTNAME = "//*[@id=\"u_2_a\"]/*[@id=\"u_2_b\"]";
    // public static final String XPATH_FIRSTNAME = "//*[@id=\"u_0_2\"]";
    public static final String XPATH_FIRSTNAME = "//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input";

    public static final String XPATH_LASTNAME = "//*[@id=\"u_2_d\"]";
    public static final String XPATH_NUMBER = "//*[@id=\"u_2_g\"]";
    public static final String XPATH_PASSWORD = "//*[@id=\"password_step_input\"]";
    public static final String XPATH_DAY = "//span[contains(@class, \"_5k_4\")]/span/select";

    //*[@id="u_2_d"]//*[@id="u_2_g"]//*[@id="password_step_input"]
    //
    //*[@id="u_0_2"]//*
    //*[@id="u_2_a"]//*[@id="u_2_b"]

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookiesField = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES_BUTTON));
        acceptCookiesField.click();

        WebElement newAccountField = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT_BUTTON));
        newAccountField.click();


        System.out.println(driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed()) ;


        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY));
        dayField.sendKeys("1");


//
//        WebElement lastNameField = driver.findElement(By.xpath(XPATH_LASTNAME));
//        lastNameField.sendKeys("O'Johnny");
//
//        WebElement numberField = driver.findElement(By.xpath(XPATH_NUMBER));
//        numberField.sendKeys("3341350473");


    }
}
