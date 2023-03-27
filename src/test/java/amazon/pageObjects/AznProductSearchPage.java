package amazon.pageObjects;

import amazon.TestRunner;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class AznProductSearchPage extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    public WebElementFacade txtSearch;
    @FindBy(id = "nav-search-submit-button")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//span[normalize-space()='Sort by:']")
    public WebElementFacade drpDwnSortBy;

    public void applyFilter(String filtertype, String filtercondition) {

        WebElementFacade chkBoxFilterType= $("//span[contains(normalize-space(),'"+filtertype+"')]/../following-sibling::ul//span[normalize-space()='"+filtercondition+"']//div//i");
        chkBoxFilterType.waitUntilEnabled().click();

    }

    public void applySortFilter(String sortFilter) {



        drpDwnSortBy.waitUntilEnabled().click();
        $(By.xpath("//a[text()='"+sortFilter+"']")).waitUntilEnabled().click();



    }
}
