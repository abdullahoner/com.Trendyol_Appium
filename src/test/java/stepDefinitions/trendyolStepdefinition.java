package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Allpages;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.bekle;


public class trendyolStepdefinition {

    Allpages allpages = new Allpages();
    Actions actions = new Actions(Driver.getAppiumDriver());
    @Given("user opens the trendyol app")
    public void user_opens_the_trendyol_app() {
        Driver.getAppiumDriver();
    }
    @Then("click to my account button")
    public void click_to_my_account_button() {
        allpages.myAccountButton.click();
    }
    @Then("click to gender button")
    public void clickToGenderButton() {
        allpages.selectGenderButton.click();
    }
    @Given("click to close advert button")
    public void click_to_close_advert_button() {
       allpages.closeAdvertButton.click();
    }
    @Given("click to login in button")
    public void click_to_login_in_button() {
        allpages.loginButton.click();
    }
    @Given("user writes an mail address in the mail box")
    public void user_writes_an_mail_address_in_the_mail_box() {
        allpages.MailBox.sendKeys(ConfigReader.getProperty("validMail"));
    }
    @Given("user writes an password in the password box")
    public void user_writes_an_password_in_the_password_box() {
        allpages.passwordBox.sendKeys(ConfigReader.getProperty("validpw"));
    }
    @Given("click to login button")
    public void click_to_login_button() {
        allpages.loginButton.click();
        Driver.getAppiumDriver().navigate().back();
    }
    @Given("click to home page button")
    public void click_to_home_page_button() {
        allpages.homePageButton.click();
    }
    @Given("click to product")
    public void click_to_product() {
        allpages = new Allpages();
        allpages.product.click();
    }
    @Given("click to add to cart button")
    public void click_to_add_to_cart_button() {
        allpages.addToCartButton.click();
    }

    @Given("close the driver without buying")
    public void close_the_driver_without_buying() {
      Driver.quitAppiumDriver();
    }
    @Given("user type {string} in search box")
    public void user_type_in_search_box(String searchWord) {
        allpages.searchBox.click();
        actions.sendKeys(searchWord+Keys.ENTER).perform();
    }
    @Given("searches for the word")
    public void searches_for_the_word() {
        actions.click(allpages.searchButton).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Given("click to tip close button")
    public void click_to_tip_close_button() {
        bekle(2);
        allpages.tipCloseButton.click();
    }
    @Given("click to confirm cart button")
    public void click_to_confirm_cart_button() {
        allpages = new Allpages();
        allpages.confirmCartButton.click();
    }
    @Given("user writes the card number")
    public void user_writes_the_card_number() {
        allpages.cardTextBox.sendKeys(ConfigReader.getProperty("cartNumber"));
    }
    @Given("user writes card expiry date")
    public void user_writes_card_expiry_date() {
        actions = new Actions(Driver.getAppiumDriver());

       allpages.expirationMonthButton.click();
       allpages.expirationMonthChooseButton.click();
       actions.click(allpages.expirationYearChooseButton).perform();
    }
    @Given("user writes cart CVV number")
    public void user_writes_cart_cvv_number() {
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty("CVV")).perform();
    }
    @Given("click to checkbox")
    public void click_to_checkbox() {
        allpages.agreementCheckBox.click();
    }
    @Given("scroll down the page")
    public void scroll_down_the_page() {
       actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}
