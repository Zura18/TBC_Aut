package org.example.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {
    public static Locator toLoans;
    public static Locator burgerMenu;
    public static Locator addressButton;

    public HomePage(Page page) {
        this.toLoans = page.getByText(" გამოთვალე სესხი ");
        this.burgerMenu = page.getByText("burger-menu-alt-outlined");
        //this.addressButton = page.locator("tbcx-pw-mega-menu:has-text(' მისამართები')");
        //this.addressButton   = page.locator("a:has(span.tbcx-pw-mega-menu-quick-acitons-item__title)")
                //.filter(new Locator.FilterOptions().setHasText("მისამართები"));

        //this.addressButton = page.locator(".parent-class")
                //.locator("tbcx-icon.tbcx-pw-mega-menu-quick-acitons-item__icon");
        //this.addressButton=page.locator("a[href*='atms&branches']");
        this.addressButton = page.getByRole(AriaRole.LINK,
                new Page.GetByRoleOptions().setName("მისამართები")
        ).first();
    }
}
