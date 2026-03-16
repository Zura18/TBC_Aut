package example;

import com.microsoft.playwright.Page;
import org.example.steps.RedirectToLoansPage;
import org.example.steps.TbcCreditUrlVerifyStep;
import org.testng.annotations.Test;
import org.example.steps.RedirectToCreditPage;

public class LoansTest extends BaseTest {

    @Test
    public void testLoansPage() {

        page.navigate("https://tbcbank.ge/ka");

        RedirectToLoansPage loansPage = new RedirectToLoansPage(page);
        RedirectToCreditPage creditsStep = new RedirectToCreditPage(page);

        loansPage.openLoansPage();

        Page creditPage = page.waitForPopup(() -> {
            creditsStep.requestLoan();
        });




        TbcCreditUrlVerifyStep verifyStep = new TbcCreditUrlVerifyStep(creditPage);
        verifyStep.verifyTbcCreditUrl().acceptCookies().verifyCalculatorVisibility();
    }
}