package ru.yandex.scooter.tests;

import org.junit.Test;
import ru.yandex.scooter.pageobjects.OrderPage;


public class CreateOrderTest extends TestBase {

    @Test
    public void testCreateOrderWithOrderBtnHeader() {
        OrderPage orderPage = homePage.clickOrderBtnHeader();
        orderPage.fillFormOfDataClient("Александр", "Санталов", "Зеленоград", "Черкизовская",
                "89167115934");
        orderPage.fillFormAboutRent("15.05.2022", "сутки", "чёрный жемчуг",
                "Доставить до обеда", "Да");
    }

    @Test
    public void testCreateOrderWithOrderBtnMiddle() {
        OrderPage orderPage = homePage.clickOrderBtnMiddle();
        orderPage.fillFormOfDataClient("Иван", "Таранов", "Москва", "Сокольники",
                "89267665934");
        orderPage.fillFormAboutRent("25.06.2022", "трое суток", "серая безысходность",
                "", "Да");

    }
}
