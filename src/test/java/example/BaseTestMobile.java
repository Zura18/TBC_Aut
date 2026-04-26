package example;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestMobile {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;

    @BeforeTest
    public void setup() {
        playwright = Playwright.create();

        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(1000);

        browser = playwright.chromium().launch(launchOptions);

        Browser.NewContextOptions mobileOptions = new Browser.NewContextOptions()
                .setViewportSize(390, 844) // iPhone 13 resolution
                .setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X)")
                .setDeviceScaleFactor(3)
                .setIsMobile(true)
                .setHasTouch(true);

        context = browser.newContext(mobileOptions);
        page = context.newPage();
    }

    @AfterTest
    public void tearDown() {
        context.close();
        browser.close();
        playwright.close();
    }
}