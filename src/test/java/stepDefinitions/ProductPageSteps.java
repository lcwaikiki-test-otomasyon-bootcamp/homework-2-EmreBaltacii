package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import pages.SearchPage;
import util.DriverFactory;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage(DriverFactory.getDriver());
    @Then("Product Pagein acildigi kontrol edilir")
    public void productPageinAcildigiKontrolEdilir() {
        productPage.checkProduct();
    }

    @When("Urun bedeni secilir")
    public void urunBedeniSecilir() {
        productPage.clickSize();
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        productPage.clickAddToCart();
    }

    @When("Sepete eklenen urun sayisinin {int} oldugu kontrol edilir")
    public void sepeteEklenenUrunSayisininOlduguKontrolEdilir(int count) {
        productPage.checkCartCount(count);
    }

    @Then("Sepet detaylarina tıklanir")
    public void sepetDetaylarinaTıklanir() {
        productPage.clickCartButton();
    }
}
