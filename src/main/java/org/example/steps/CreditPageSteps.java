package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.TbcCreditPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class CreditPageSteps {

    private TbcCreditPage tbcCreditPage;

    public CreditPageSteps(Page page){
        this.tbcCreditPage = new TbcCreditPage(page);
    }

    public CreditPageSteps verifyTbcCreditUrl() {
        System.out.println("New tab URL: " + tbcCreditPage.url());
        assertTrue(tbcCreditPage.url().contains("tbccredit.ge"));
        return this;
    }

    public CreditPageSteps acceptCookies (){
        tbcCreditPage.cookiesAcceptButton.click();
        return this;
    }

    public CreditPageSteps verifyCalculatorVisibility() {
        assertThat(tbcCreditPage.calculator).isVisible();
        return this;
    }
}