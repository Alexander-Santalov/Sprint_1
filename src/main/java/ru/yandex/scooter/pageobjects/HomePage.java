package ru.yandex.scooter.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage {

    // локатор кнопки Куки
    @FindBy(how = How.CSS, using = "button.App_CookieButton__3cvqF")
    private SelenideElement cookieBtn;

    // локатор кнопки Заказать в хедере
    @FindBy(how = How.CSS, using = "div.Header_Nav__AGCXC button.Button_Button__ra12g")
    private SelenideElement orderBtnHeader;

    // локатор кнопки Статус заказа
    @FindBy(how = How.CSS, using = "div.Header_Nav__AGCXC button.Header_Link__1TAG7")
    private SelenideElement stateOrderBtn;

    // локатор второй кнопки Заказать в середине страницы
    @FindBy(how = How.CSS, using = "button.Button_Middle__1CSJM")
    private SelenideElement orderBtnMiddle;

    // локатор кнопки Go
    @FindBy(how = How.CSS, using = "button.Header_Button__28dPO")
    private SelenideElement goBtn;

    // локатор логотипа яндекс
    @FindBy(how = How.CSS, using = "[alt='Yandex']")
    private SelenideElement logoYandex;

    // локатор логотипа Самокат
    @FindBy(how = How.CSS, using = "[alt='Scooter']")
    private SelenideElement logoScooter;

    //Блок описания самоката
    // локатор для блока заголовка и описания
    @FindBy(how = How.CSS, using = "div.Home_Header__iJKdX")
    private SelenideElement titleDescription;

    // локатор элемента блока заголовка и описания, который виден при открытии страницы
    @FindBy(how = How.XPATH, using = ".//div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement startDescription;

    // локатор изображения самоката, который виден при откртыии старницы
    @FindBy(how = How.CSS, using = "img[src='/assets/blueprint.png']")
    private SelenideElement startImgScooter;

    // локатор элемента блока заголовка и описания, который виден при скроле страницы
    @FindBy(how = How.XPATH, using = ".//div[contains(text(),'Он лёгкий и с мощными колёсами')]")
    private SelenideElement scrollDescription;

    // локатор изображения самоката, который виден при скролле старницы
    @FindBy(how = How.CSS, using = "img[src='/assets/scooter.png']")
    private SelenideElement scrollImgScooter;

    //Блок описания модели самоката
    // общий локатор блока
    @FindBy(how = How.CSS, using = "div.Home_Table__2kPxP")
    private SelenideElement descriptionScooter;

    // локатор названия модели
    @FindBy(how = How.XPATH, using = ".//div[contains(text(),'Модель Toxic PRO')]")
    private SelenideElement nameModel;

    // локатор для сепаратора
    @FindAll({@FindBy(css = "div.Home_Separator__3cWAk")})
    private SelenideElement separatorElements;

    // локатор для описания строки скорости
    @FindBy(how = How.XPATH, using = ".//div[text()='Максимальная скорость']")
    private SelenideElement maxSpeed;

    // локатор для описания значения скорости
    @FindBy(how = How.XPATH, using = ".//div[text()='40 км/ч']")
    private SelenideElement maxSpeedValue;

    // локатор для описания строки о подзарядке
    @FindBy(how = How.XPATH, using = ".//div[text()='Проедет без поздарядки']")
    private SelenideElement qoWithoutCharge;

    // локатор для описания значения расстояния
    @FindBy(how = How.XPATH, using = ".//div[text()='80 км']")
    private SelenideElement qoWithoutChargeDistance;

    // локатор для описания строки о весе
    @FindBy(how = How.XPATH, using = ".//div[text()='Выдерживает вес']")
    private SelenideElement maxWeight;

    // локатор для описания значения веса
    @FindBy(how = How.XPATH, using = ".//div[text()='120 кг']")
    private SelenideElement maxWeightValue;

    // Блок - Как это работает
    //локатор заголовка блока статусов
    @FindBy(how = How.CSS, using = "div.Home_ThirdPart__LSTEE  div.Home_SubHeader__zwi_E")
    private SelenideElement titleStatus;

    // Описание локаторов кружков
    @FindBy(how = How.XPATH, using = ".//div[contains(@class, 'Home_StatusCircle__3_aTp')][text()='1']")
    private SelenideElement firstStepCircle;

    @FindBy(how = How.XPATH, using = ".//div[contains(@class, 'Home_StatusCircle__3_aTp')][text()='2']")
    private SelenideElement secondStepCircle;

    @FindBy(how = How.XPATH, using = ".//div[contains(@class, 'Home_StatusCircle__3_aTp')][text()='3']")
    private SelenideElement thirdStepCircle;

    @FindBy(how = How.XPATH, using = ".//div[contains(@class, 'Home_StatusCircle__3_aTp')][text()='4']")
    private SelenideElement fourthStepCircle;

    // Описание локаторов заголовков статусов
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']")
    private SelenideElement firstStepTitle;

    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement secondStepTitle;

    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']")
    private SelenideElement thirdStepTitle;

    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement fourthStepTitle;

    // Описание локаторов для описания статусов
    @FindBy(how = How.XPATH, using = ".//div[contains(text(),'Выбираете, когда')]")
    private SelenideElement firstStepDescription;

    @FindBy(how = How.XPATH, using = ".//div[text()='А вы — оплачиваете аренду']")
    private SelenideElement secondStepDescription;

    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement thirdStepDescription;

    @FindBy(how = How.XPATH, using = ".//div[text()='Когда аренда заканчивается']")
    private SelenideElement fourthStepDescription;

    //Вопросы о важном
    //локатор заголовка
    @FindBy(how = How.CSS, using = "div.Home_FourPart__1uthg div.Home_SubHeader__zwi_E")
    private SelenideElement titleQuestion;

    // локатор блока для первого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement firstQuestion;

    // локатор блока для второго вопроса
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement secondQuestion;

    // локатор блока для третьего вопроса
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement thirdQuestion;

    // локатор блока для четвертого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement fourthQuestion;

    // локатор блока для пятого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement fifthQuestion;

    // локатор блока для шестого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement sixthQuestion;

    // локатор блока для седьмого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement seventhQuestion;

    // локатор блока для восьмого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement eighthQuestion;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement firstAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement secondAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement thirdAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement fourthAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement fifthAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement sixthAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement seventhAnswer;

    // локатор для ответа на первый вопрос
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement eighthAnswer;

    // метод принятия куки
    public void clickCookieAccept() {
        cookieBtn.click();
    }

    public OrderPage clickOrderBtnHeader() {
        orderBtnHeader.click();
        OrderPage orderPage = Selenide.page(OrderPage.class);
        return orderPage;
    }

    public OrderPage clickOrderBtnMiddle() {
        orderBtnMiddle.click();
        OrderPage orderPage = Selenide.page(OrderPage.class);
        return orderPage;
    }

    // методы  клика по нужному вопросу
    public void clickFirstQuestion() {
        firstQuestion.click();
    }

    public void clickSecondQuestion() {
        secondQuestion.click();
    }

    public void clickThirdQuestion() {
        thirdQuestion.click();
    }

    public void clickFourthQuestion() {
        fourthQuestion.click();
    }

    public void clickFifthQuestion() {
        fifthQuestion.click();
    }

    public void clickSixthQuestion() {
        sixthQuestion.click();
    }

    public void clickSeventhQuestion() {
        seventhQuestion.click();
    }

    public void clickEighthQuestion() {
        eighthQuestion.click();
    }

    // методы для проверки текста ответа
    public void answerFirstQuestion() {
        firstAnswer.shouldHave(Condition.exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    public void answerSecondQuestion() {
        secondAnswer.shouldHave(Condition.exactText("Пока что у нас так: один заказ — один самокат. " +
                "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    public void answerThirdQuestion() {
        thirdAnswer.shouldHave(Condition.exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая " +
                "в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    public void answerFourthQuestion() {
        fourthAnswer.shouldHave(Condition.exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    public void answerFifthQuestion() {
        fifthAnswer.shouldHave(Condition.exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в" +
                " поддержку по красивому номеру 1010."));
    }

    public void answerSixthQuestion() {
        sixthAnswer.shouldHave(Condition.exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — " +
                "даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    public void answerSeventhQuestion() {
        seventhAnswer.shouldHave(Condition.exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки " +
                "тоже не попросим. Все же свои."));
    }

    public void answerEighthQuestion() {
        eighthAnswer.shouldHave(Condition.exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    // метод для клика по логотипу Яндекс
    public void clickLogoYandex() {
        logoYandex.click();
    }

    // метод для клика по логотипу Самокат
    public void clickLogoScooter() {
        logoScooter.click();
    }

    // метод для клика по кнопке Статус закуза
    public void clickStateOrderBtn() {
        stateOrderBtn.click();
    }

    // метод для клика по кнопке Go
    public TrackPage clickGoBtn() {
        goBtn.click();
        TrackPage trackPage = Selenide.page(TrackPage.class);
        return trackPage;
    }

    //метод для проверки перехода на главную страницу
    public void assertGoToHomePage() {
        titleDescription.shouldHave(Condition.exactText("Самокат\n" +
                "на пару дней\n" +
                "Привезём его прямо к вашей двери,\n" +
                "а когда накатаетесь — заберём"));
    }


}

