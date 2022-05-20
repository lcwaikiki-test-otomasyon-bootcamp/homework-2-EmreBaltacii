package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ElementHelper;

public class ProductPage {
    By addToCartButton = By.cssSelector("a#pd_add_to_cart");
    By productCode = By.cssSelector("span.hidden-xs");
    By productSizeOption = By.cssSelector("#option-size [size=\"38\"]");
    By goToCartButton = By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/sepetim\"].header-dropdown-toggle");
    By cartCountInfo = By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/sepetim\"].header-dropdown-toggle .badge-circle");
    WebDriver driver;
    ElementHelper helper;
    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkProduct() {
        helper.checkElementVisible(productCode);
    }

    public void clickAddToCart(){
        helper.click(addToCartButton);
    }

    public void clickSize(){
        helper.click(productSizeOption);
    }

    public void checkCartCount(int exCount) {
        String acCount = helper.getText(cartCountInfo);
        Assert.assertEquals(Integer.parseInt(acCount), exCount);
    }

    public void clickCartButton(){
        helper.click(goToCartButton);
    }
}
