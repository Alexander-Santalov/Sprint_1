package ru.yandex.scooter.tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.Assert.assertEquals;

public class NavigationTest extends TestBase {

    @Test
    public void testGoToHomePage() {
        open("https://qa-scooter.praktikum-services.ru/order");
        homePage.clickLogoScooter();
        homePage.assertGoToHomePage();
    }

    @Test
    public void testGoToYandexPage() {
        homePage.clickLogoYandex();
        String currentUrl = switchTo().window(1).getCurrentUrl();
        currentUrl = currentUrl.substring(0, 17);
        // из-за капчи решил проверять по url
        assertEquals("https://yandex.ru", currentUrl);
        closeWindow();
        switchTo().window(0);
    }
}
