package ru.yandex.scooter.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TrackPage {
    // локатор для изображения при отсутсвии заказа
    @FindBy(how = How.CSS, using = "div.Track_NotFound__6oaoY img")
    private SelenideElement imgElement;

    public void assertNotFound() {
        imgElement.shouldHave(Condition.attribute("src",
                "https://qa-scooter.praktikum-services.ru/assets/not-found.png"));
    }

}
