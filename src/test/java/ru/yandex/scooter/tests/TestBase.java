package ru.yandex.scooter.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.yandex.scooter.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestBase {
    static HomePage homePage = page(HomePage.class);

    @BeforeClass
    public static void precondition() {
        open("https://qa-scooter.praktikum-services.ru/");
        homePage.clickCookieAccept();
    }

    @Before
    public void precondition_test() {
        WebDriverRunner.getWebDriver().manage().window().maximize();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        if (!currentUrl.equals("https://qa-scooter.praktikum-services.ru/")) {
            open("https://qa-scooter.praktikum-services.ru/");
        }
    }
}
