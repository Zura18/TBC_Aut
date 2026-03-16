package example;

import com.microsoft.playwright.Page;
import org.example.steps.OffersStep;
import org.testng.annotations.Test;

public class OffersTest extends BaseTest {
    @Test
    public void testOffersPage() {
        page.navigate(" https://tbcbank.ge/ka/offers/all-offers");
                OffersStep offersStep = new OffersStep(page);
                offersStep.cardTypeVisibility().
                productGridVisibility().
                masterCardChoose().
                offerTypeForPartnersCheck().
                offersNotFound().
                productGridEmptyValidate().
                clearFilterButton1().
                filledProductGridVisibility();
    }
}
