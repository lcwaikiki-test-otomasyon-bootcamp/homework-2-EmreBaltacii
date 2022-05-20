package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import util.DriverFactory;

public class CartPageSteps {
    CartPage cartPage = new CartPage(DriverFactory.getDriver());

    @Then("Sepetteki urun bedeninin {int} oldugu kontrol edilir")
    public void sepettekiUrunBedenininOlduguKontrolEdilir(int size) {
        cartPage.checkProductSize(size);
    }

    @Then("Odeme adimi butonunu gorunur")
    public void odemeAdimiButonunuGorunur() {
        cartPage.checkPaymentButton();
    }

    @When("Sepetim sayfasina gidilir")
    public void sepetimSayfasinaGidilir() {
        cartPage.checkCartInfo();
    }
}
