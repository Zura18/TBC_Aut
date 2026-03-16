package org.example.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class TbcBankLoansPage {
    public static Locator productsGroup;
    public static Locator requestLoan;

    public TbcBankLoansPage(Page page) {
        //this.requestLoan = page.locator("button:has(tbcx-icon[style*='arrow-right-outlined'])");
        this.productsGroup = page.locator("app-components-group .components-group");
        this.requestLoan = page.locator("a[href='https://tbcbank.onelink.me/YiId/ularj23r'] >> button:has(tbcx-icon[style*='arrow-right-outlined']) >> text='სესხის მოთხოვნა'");
    }
}
