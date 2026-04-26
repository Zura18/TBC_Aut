package example;

import org.example.steps.OffersSteps;
import org.testng.annotations.Test;

public class OffersTest extends BaseTest {
    @Test
    public void testOffersPage() {
        page.navigate("https://tbcbank.ge/ka/offers/all-offers");
                OffersSteps offersStep = new OffersSteps(page);
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
