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

        // Calculator element
        this.calculator = page.locator("div.title-calculator");

        // Cookies iframe
        FrameLocator cookiesFrame = page.frameLocator("iframe[title='No content']");

        // Accept cookies button inside iframe
        this.cookiesAcceptButton = cookiesFrame.locator("#acceptAllCookies");
    }

    public void acceptCookies() {
        cookiesAcceptButton.click();
    }

    public String url() {
        return page.url();
    }
}