package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.TbcCreditPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class TbcCreditUrlVerifyStep {

    private TbcCreditPage tbcCreditPage;

    public TbcCreditUrlVerifyStep(Page page){
        this.tbcCreditPage = new TbcCreditPage(page);
    }

    public TbcCreditUrlVerifyStep verifyTbcCreditUrl() {
        System.out.println("New tab URL: " + tbcCreditPage.url());
        assertTrue(tbcCreditPage.url().contains("tbccredit.ge"));
        return this;
    }

    public TbcCreditUrlVerifyStep verifyCalculatorVisibility() {
        assertThat(tbcCreditPage.calculator).isVisible();
        return this;
    }

    public TbcCreditUrlVerifyStep acceptCookies (){
        tbcCreditPage.cookiesAcceptButton.click();
        return this;
    }
}