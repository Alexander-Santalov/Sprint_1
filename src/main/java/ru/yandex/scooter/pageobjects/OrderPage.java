package ru.yandex.scooter.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OrderPage {

    // локатор поля Имя
    @FindBy(how = How.CSS, using = "input[placeholder='* Имя']")
    private SelenideElement nameField;

    // локатор поля Фамилия
    @FindBy(how = How.CSS, using = "input[placeholder='* Фамилия']")
    private SelenideElement surnameField;

    // локатор поля Адресс
    @FindBy(how = How.CSS, using = "input[placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressField;

    // локатор поля Станция метро
    @FindBy(how = How.CSS, using = "input[placeholder='* Станция метро']")
    private SelenideElement stationField;

    // локатор поля Телефон
    @FindBy(how = How.CSS, using = "input[placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneField;

    // локатор кнопки Далее
    @FindBy(how = How.CSS, using = "button.Button_Middle__1CSJM")
    private SelenideElement nextBtn;

    // локатор поля Дата доставки
    @FindBy(how = How.CSS, using = "input[placeholder='* Когда привезти самокат']")
    private SelenideElement deliverDateField;

    // локатор поля Срок аренды
    @FindBy(how = How.CSS, using = "div.Dropdown-placeholder")
    private SelenideElement rentalPeriodField;

    // локатор для выбора цвета самоката
    @FindBy(how = How.CSS, using = "div.Order_Checkboxes__3lWSI")
    private SelenideElement colorScooter;

    // локатор поля Дата доставки
    @FindBy(how = How.CSS, using = "input[placeholder='Комментарий для курьера']")
    private SelenideElement commentField;

    // локатор кнопки Заказать
    @FindBy(how = How.CSS, using = "button.Button_Middle__1CSJM:not(.Button_Inverted__3IF-i)")
    private SelenideElement orderBtnFinish;

    //локатор модальных окон
    @FindBy(how = How.CSS, using = "div.Order_Modal__YZ-d3")
    private SelenideElement modalOrder;

    //локатор кнопки Посмотреть статус
    @FindBy(how = How.CSS, using = "div.Order_NextButton__1_rCA button")
    private SelenideElement showStateBtn;

    //локаторы ошибок полей
    @FindBy(how = How.CSS, using = "input[placeholder='* Имя'] + div")
    private SelenideElement errorFieldName;

    @FindBy(how = How.CSS, using = "input[placeholder='* Фамилия'] + div")
    private SelenideElement errorFieldSurname;

    @FindBy(how = How.CSS, using = "input[placeholder='* Адрес: куда привезти заказ'] + div")
    private SelenideElement errorFieldAddress;

    @FindBy(how = How.CSS, using = "div.Order_MetroError__1BtZb")
    private SelenideElement errorFieldStation;

    @FindBy(how = How.CSS, using = "input[placeholder='* Телефон: на него позвонит курьер'] + div")
    private SelenideElement errorFieldPhone;

    // метод заполнения поля Имя
    public void setName(String name) {
        nameField.setValue(name);
    }

    // метод заполнения поля Фамилия
    public void setSurname(String surname) {
        surnameField.setValue(surname);
    }

    // метод заполнения поля Адресс
    public void setAddress(String address) {
        addressField.setValue(address);
    }

    // метод заполнения поля Станция метро
    public void setStation(String station) {
        stationField.click();
        Selenide.$(Selectors.byText(station)).click();
    }

    // метод заполнения поля Телефон
    public void setPhone(String phone) {
        phoneField.setValue(phone);
    }

    // метод для клика по кнопке далее
    public void clickNextBtn() {
        nextBtn.click();
    }

    // метод для заоплнения формы о клиенте
    public void fillFormOfDataClient(String name, String surname, String address, String station, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setStation(station);
        setPhone(phone);
        clickNextBtn();

    }

    // метод заполнения поля Дата доставки
    public void setDeliverDateField(String date) {
        deliverDateField.setValue(date).pressEnter();
    }

    // метод заполнения поля Срок аренды
    public void setRentalPeriodField(String period) {
        rentalPeriodField.click();
        Selenide.$(Selectors.byText(period)).click();
    }

    // метод выбора цвета самоката
    public void setColorScooter(String color) {
        colorScooter.$(Selectors.byText(color)).click();
    }

    // метод заполнения поля комментарий
    public void setCommentField(String comment) {
        commentField.setValue(comment);
    }

    // метод для клика по кнопке Заказать
    public void clickOrderBtnFinish() {
        orderBtnFinish.click();
    }

    // метод для подтверждения заказа
    public void clickYesConfirmOrder(String choose) {
        modalOrder.$(Selectors.byText(choose)).click();
    }

    public void fillFormAboutRent(String date, String period, String color, String comment, String choose) {
        setDeliverDateField(date);
        setRentalPeriodField(period);
        setColorScooter(color);
        setCommentField(comment);
        clickOrderBtnFinish();
        clickYesConfirmOrder(choose);
        showStateBtn.shouldHave(Condition.exactText("Посмотреть статус"));
    }

    public void assertErrorNotification() {
        errorFieldName.shouldHave(Condition.exactText("Введите корректное имя"));
        errorFieldSurname.shouldHave(Condition.exactText("Введите корректную фамилию"));
        errorFieldAddress.shouldHave(Condition.exactText("Введите корректный адрес"));
        errorFieldStation.shouldHave(Condition.exactText("Выберите станцию"));
        errorFieldPhone.shouldHave(Condition.exactText("Введите корректный номер"));
    }


}
