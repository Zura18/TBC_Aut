package org.example.page;

import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class TbcCreditPage {

    private Page page;
    public Locator calculator;
    public Locator cookiesAcceptButton;

    public TbcCreditPage(Page page) {
        this.page = page;
        this.cookiesAcceptButton = page.locator("a#acceptAllCookies:has-text('თანხმობა')");
        this.calculator = page.locator("#standard-calculator");
    }

    public String url() {
        return page.url();
    }
}