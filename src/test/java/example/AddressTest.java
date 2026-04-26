package example;


import org.example.steps.AddressPageSteps;
import org.example.steps.HomePageSteps;
import org.testng.annotations.Test;

public class AddressTest extends BaseTestMobile {

    @Test
    public void testAddress() {
        page.navigate("https://tbcbank.ge/ka");

        HomePageSteps homePageSteps = new HomePageSteps(page);
        AddressPageSteps addressPageSteps = new AddressPageSteps(page);
        homePageSteps.
                openBurgerMenu().
                openAddress();

        addressPageSteps.
                verifyAddressPage().
                clickAtmsButton().
                clickBranchesButton().
                verifyWorkDaysVisibility();
    }
}