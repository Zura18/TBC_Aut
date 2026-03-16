package example;

import com.microsoft.playwright.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class BaseTest {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;

    @BeforeTest
    public void setup() {
        playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(1000)
                .setArgs(Arrays.asList("--disable-gpu", "--disable-extensions", "--window-size=1920,1080"));


        browser = playwright.chromium().launch(launchOptions);

        context = browser.newContext(new Browser.NewContextOptions()
                .setViewportSize(null));
        page = context.newPage();

    }
    @AfterTest
    public void teardown() {
        page.close();
        browser.close();
        playwright.close();
    }

}