package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.OffersPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OffersSteps {
    OffersPage offersPage;

    public OffersSteps(Page page) {
        this.offersPage = new OffersPage(page);
    }

    public OffersSteps cardTypeVisibility() {
        assertThat(offersPage.cardType).isVisible();
        return this;
    }
    public OffersSteps productGridVisibility() {
        assertThat(offersPage.productGrid).isVisible();
        return this;
    }

    public OffersSteps masterCardChoose(){
        offersPage.masterCard.click();
        return this;
    }

    public OffersSteps offerTypeForPartnersCheck(){
        offersPage.offerTypeForPartners.check();
        return this;
    }

    public OffersSteps offersNotFound(){
        assertThat(offersPage.offersNotFound).isVisible();
        return this;
    }

    public OffersSteps productGridEmptyValidate(){
        assertThat(offersPage.emptyGrid.locator("> *")).hasCount(0);
        return this;
    }

    public OffersSteps clearFilterButton1(){
        offersPage.clearFilterButton1.nth(0).click();
        return this;
    }

    public OffersSteps filledProductGridVisibility(){
        assertThat(offersPage.filledProductGrid.locator("> *").first()).isVisible();
        return this;
    }

}
