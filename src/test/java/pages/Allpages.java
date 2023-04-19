package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.time.Duration;

public class Allpages {
    public Allpages(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(20)),this);
    }
    @FindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    public WebElement selectGenderButton;

    @FindBy(id = "trendyol.com:id/imageViewTooltipClose")
    public WebElement closeAdvertButton;

    @FindBy(xpath= "//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]/android.widget.ImageView")
    public WebElement homePageButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.widget.ImageView")
    public WebElement myAccountButton;

    @FindBy(id = "trendyol.com:id/editTextEmail")
    public WebElement MailBox;

    @FindBy(id = "trendyol.com:id/editTextPassword")
    public WebElement passwordBox;

    @FindBy(id = "trendyol.com:id/buttonLogin")
    public WebElement loginButton;

    @FindBy(id = "trendyol.com:id/search_view_inner_container")
    public WebElement searchBox;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    public WebElement searchButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/w1.a/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement product;

    @FindBy(id = "trendyol.com:id/imagePickupShowcaseTooltipClose")
    public WebElement tipCloseButton;

    @FindBy(id = "trendyol.com:id/primaryButton")
    public WebElement addToCartButton;

    @FindBy(id = "trendyol.com:id/buttonApproveBasket")
    public WebElement confirmCartButton;

    @FindBy(id = "trendyol.com:id/editTextPaymentCardInformationCardNumber")
    public WebElement cardTextBox;

    @FindBy(id = "trendyol.com:id/textViewPaymentCardInformationMonth")
    public WebElement expirationMonthButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
    public WebElement expirationMonthChooseButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
    public WebElement expirationYearChooseButton;

    @FindBy(id = "trendyol.com:id/checkbox")
    public WebElement agreementCheckBox;
}
