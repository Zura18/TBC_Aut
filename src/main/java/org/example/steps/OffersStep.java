package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.OffersPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OffersStep {
    OffersPage offersPage;

    public OffersStep(Page page) {
        this.offersPage = new OffersPage(page);
    }

    public OffersStep cardTypeVisibility() {
        assertThat(offersPage.cardType).isVisible();
        return this;
    }
    public OffersStep productGridVisibility() {
        assertThat(offersPage.productGrid).isVisible();
        return this;
    }

    public OffersStep masterCardChoose(){
        offersPage.masterCard.click();
        return this;
    }

    public OffersStep offerTypeForPartnersCheck(){
        offersPage.offerTypeForPartners.check();
        return this;
    }

    public OffersStep offersNotFound(){
        assertThat(offersPage.offersNotFound).isVisible();
        return this;
    }

    public OffersStep productGridEmptyValidate(){
        assertThat(offersPage.emptyGrid.locator("> *")).hasCount(0);
        return this;
    }

    public OffersStep clearFilterButton1(){
        offersPage.clearFilterButton1.nth(0).click();
        return this;
    }

//    public OffersStep clearFilterButton2(){
//        offersPage.clearFilterButton1.nth(1).click();
//        return this;
//    }
    public OffersStep filledProductGridVisibility(){
        assertThat(offersPage.filledProductGrid.locator("> *").first()).isVisible();
        return this;
    }

}
