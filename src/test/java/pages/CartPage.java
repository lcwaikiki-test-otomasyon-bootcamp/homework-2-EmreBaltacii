package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ElementHelper;

public class CartPage {

    By cartInfo = By.cssSelector(".col-md-12.cart-header.mb-20");
    By productSize = By.cssSelector("span.rd-cart-item-size strong");
    By paymentButton = By.cssSelector("[href=\"https://www.lcwaikiki.com/tr-TR/TR/checkout#adres\"]");
    WebDriver driver;
    ElementHelper helper;
    public CartPage(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkCartInfo(){
        helper.checkElementVisible(cartInfo);
    }

    public void checkProductSize(int exCount){
        String acCount = helper.getText(productSize);
        Assert.assertEquals(Integer.parseInt(acCount), exCount);
    }

    public void checkPaymentButton(){
        helper.checkElementVisible(paymentButton);
    }
}
