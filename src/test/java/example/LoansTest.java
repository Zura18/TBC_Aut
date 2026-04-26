package example;

import com.microsoft.playwright.Page;
import org.example.steps.HomePageSteps;
import org.example.steps.CreditPageSteps;
import org.testng.annotations.Test;
import org.example.steps.LoansPageSteps;

public class LoansTest extends BaseTest {

    @Test
    public void testLoansPage() {

        page.navigate("https://tbcbank.ge/ka");

        HomePageSteps loansStep = new HomePageSteps(page);
        LoansPageSteps creditsStep = new LoansPageSteps(page);

        loansStep.openLoansPage();

        Page creditPage = page.waitForPopup(() -> {
            creditsStep.requestLoan();
        });

        CreditPageSteps creditPageSteps = new CreditPageSteps(creditPage);

        creditPageSteps.
                verifyTbcCreditUrl().
                acceptCookies().
                verifyCalculatorVisibility();
    }
}