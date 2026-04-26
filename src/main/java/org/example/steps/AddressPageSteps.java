package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.AddressPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class AddressPageSteps {
    private AddressPage addressPage;

    public AddressPageSteps(Page page){
        this.addressPage = new AddressPage(page);
    }

    public AddressPageSteps verifyAddressPage(){
        addressPage.addressAtm.waitFor(); // ensures it's there
        assertTrue(addressPage.addressAtm.isVisible());
        return this;

    }
    public AddressPageSteps clickAtmsButton(){
        addressPage.addressAtm.click();
        return this;
    }
    public AddressPageSteps clickBranchesButton(){
        addressPage.branchesButton.click();
        return this;
    }


    public AddressPageSteps verifyWorkDaysVisibility(){
        addressPage.workDaysAndHours.waitFor();
        assertThat(addressPage.workDaysAndHours).isVisible();
        assertThat(addressPage.workDaysAndHours).hasText(" ორშაბათი-პარასკევი: 10:00-18:00 ");
        return this;
    }
}