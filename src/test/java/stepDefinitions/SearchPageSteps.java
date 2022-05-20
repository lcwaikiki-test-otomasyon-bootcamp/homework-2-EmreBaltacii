package stepDefinitions;

import pages.SearchPage;
import util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Then("Urunlerin listelendigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkList();
    }

    @When("{int} siradaki urune tiklanir")
    public void IlkSiradakiUruneTiklanir(int product) {
        searchPage.clickProduct(product);
    }
}
