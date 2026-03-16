package example;

import com.microsoft.playwright.Page;
import org.example.steps.RedirectToLoansPageStep;
import org.example.steps.TbcCreditUrlVerifyStep;
import org.testng.annotations.Test;
import org.example.steps.RedirectToCreditPageStep;

public class LoansTest extends BaseTest {

    @Test
    public void testLoansPage() {

        page.navigate("https://tbcbank.ge/ka");

        RedirectToLoansPageStep loansPage = new RedirectToLoansPageStep(page);
        RedirectToCreditPageStep creditsStep = new RedirectToCreditPageStep(page);

        loansPage.openLoansPage();

        Page creditPage = page.waitForPopup(() -> {
            creditsStep.requestLoan();
        });

        TbcCreditUrlVerifyStep verifyStep = new TbcCreditUrlVerifyStep(creditPage);
        verifyStep.verifyTbcCreditUrl().acceptCookies().verifyCalculatorVisibility();
    }
}