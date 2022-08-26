package ru.yandex.scooter.tests;

import org.junit.Test;
import ru.yandex.scooter.pageobjects.OrderPage;
import ru.yandex.scooter.pageobjects.TrackPage;

public class UITest extends TestBase {


    @Test
    public void testAnswerOfQuestion1() {
        homePage.clickFirstQuestion();
        homePage.answerFirstQuestion();
    }

    @Test
    public void testAnswerOfQuestion2() {
        homePage.clickSecondQuestion();
        homePage.answerSecondQuestion();
    }

    @Test
    public void testAnswerOfQuestion3() {
        homePage.clickThirdQuestion();
        homePage.answerThirdQuestion();
    }

    @Test
    public void testAnswerOfQuestion4() {
        homePage.clickFourthQuestion();
        homePage.answerFourthQuestion();
    }

    @Test
    public void testAnswerOfQuestion5() {
        homePage.clickFifthQuestion();
        homePage.answerFifthQuestion();
    }

    @Test
    public void testAnswerOfQuestion6() {
        homePage.clickSixthQuestion();
        homePage.answerSixthQuestion();
    }

    @Test
    public void testAnswerOfQuestion7() {
        homePage.clickSeventhQuestion();
        homePage.answerSeventhQuestion();
    }

    @Test
    public void testAnswerOfQuestion8() {
        homePage.clickEighthQuestion();
        homePage.answerEighthQuestion();
    }

    @Test
    public void testOrderNotFound() {
        homePage.clickStateOrderBtn();
        TrackPage trackPage = homePage.clickGoBtn();
        trackPage.assertNotFound();
    }

    @Test
    public void testErrorNotification() {
        OrderPage orderPage = homePage.clickOrderBtnHeader();
        orderPage.setAddress("м");
        orderPage.clickNextBtn();
        orderPage.assertErrorNotification();
    }

}