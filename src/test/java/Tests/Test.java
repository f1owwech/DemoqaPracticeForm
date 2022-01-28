package Tests;

import Pages.BasePage;
import Pages.MainPage;

public class Test extends BaseTest {

  @org.junit.Test
  public void practiceFormTest() {
    MainPage mainPage = new MainPage(driver);
    BasePage basePage = new BasePage(driver);
    basePage.getUrl();
    mainPage.openPracticeForm();
    mainPage.inputFirstName();
    mainPage.inputLastName();
    mainPage.inputEmail();
    mainPage.selectGender();
    mainPage.inputMobileNumber();
    mainPage.openDatePicker();
    mainPage.selectMonth();
    mainPage.selectYear();
    mainPage.selectDate();
    mainPage.inputSubject();
    mainPage.selectAllCheckBoxes();
    mainPage.uploadPicture();
    mainPage.inputAddress();
    mainPage.selectDropDownStateValue();
    mainPage.selectDropDownCityValue();
    mainPage.submitForm();
    mainPage.checkForm();

  }
}
