package org.example.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddressPage {
    public Locator addressAtm;
    public Locator atms;
    public Locator branchesButton;
    public Locator workDaysAndHours;
    public Locator workHours;

    public AddressPage(Page page) {
        this.addressAtm = page.getByText("ფილიალი, ბანკომატი და თანხის მიმღები");
        this.atms = page.locator("span.tbcx-pw-tab-menu__item")
                .filter(new Locator.FilterOptions().setHasText("ბანკომატები"));
        this.branchesButton = page.locator("tbcx-pw-tab-menu__item ng-star-inserted active");
        this.workDaysAndHours = page.locator("br.ng-star-inserted:has-text(' შაბათი: 10:00-14:00 ')").first();
    }
}