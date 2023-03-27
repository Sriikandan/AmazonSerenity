package amazon.stepdefinition;

import amazon.pageObjects.AznProductSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.model.DataTable;

public class AznProductSearchSteps {


    AznProductSearchPage amazonProductSearchPage;
    @Given("I open the Amazon to buy a product")
    public void iOpenTheAmazonToBuyAProduct() {

        amazonProductSearchPage.open();
    }

    @And("I enter the product to be searched as {string}")
    public void iEnterTheProductToBeSearchedAs(String searchProduct) {

        amazonProductSearchPage.txtSearch.typeAndEnter(searchProduct);
    }

    @And("I click on the search")
    public void iClickOnTheSearch() {
        amazonProductSearchPage.btnSearch.click();
    }

    @And("I apply search filter by {string} with criteria as {string}")
    public void iApplySearchFilterAsPerTheBelowCriteria(String filterType,String condition) {


        amazonProductSearchPage.applyFilter(filterType,condition);
    }

    @And("I will apply sort by {string}")
    public void iWillApplySortBy(String sortFilter) {

        amazonProductSearchPage.applySortFilter(sortFilter);

    }
}
