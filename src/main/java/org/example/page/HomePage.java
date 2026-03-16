package org.example.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {
    public static Locator toLoans;

    public HomePage(Page page) {
        this.toLoans = page.getByText(" გამოთვალე სესხი ");
    }
}
