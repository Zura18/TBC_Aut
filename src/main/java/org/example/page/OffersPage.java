package org.example.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {
    public Locator cardType;
    public Locator productGrid;
    public Locator masterCard;
    public Locator offerTypeForPartners;
    public Locator offersNotFound;
    public Locator emptyGrid;
    public Locator clearFilterButton1;
    public Locator clearFilterButton2;
    public Locator filledProductGrid;

    public OffersPage(Page page) {
        this.cardType = page.getByText("ბარათის ტიპი");
        this.productGrid = page.locator("app-marketing-list .marketing__cards-list");
        this.masterCard = page.getByText(" მასტერქარდი ").locator("..").locator("input[type='checkbox']");
        this.offerTypeForPartners = page.getByText(" პარტნიორების შეთავაზება ").locator("..").locator("input[type='checkbox']");
        this.offersNotFound = page.locator("app-marketing-list .offers__empty-state-info");
        this.emptyGrid   = page.locator("app-marketing-list .marketing__cards-list");
        this.clearFilterButton1 =  page.getByText(" გასუფთავება ");
        this.clearFilterButton2 = page.getByText(" გასუფთავება ");
        this.filledProductGrid = page.locator("app-marketing-list .marketing__cards-list");
    }
}
