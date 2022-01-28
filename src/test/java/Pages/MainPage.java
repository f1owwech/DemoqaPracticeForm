package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

  private JavascriptExecutor js;

  public MainPage(WebDriver driver) {
    super(driver);
    js = (JavascriptExecutor) driver;

  }

  @FindBy (xpath = "//span[text()='Practice Form']")
  WebElement practiceFormTab;

  @FindBy (xpath = "//input[@id='firstName']")
  WebElement firstName;

  @FindBy (xpath = "//input[@id='lastName']")
  WebElement lastName;

  @FindBy (xpath = "//input[@placeholder='name@example.com']")
  WebElement email;

  @FindBy (xpath = "//input[@id='gender-radio-1']")
  List<WebElement> genderRadioButton;

  @FindBy (xpath = "//input[@placeholder='Mobile Number']")
  WebElement mobileNumber;

  @FindBy (xpath = "//input[@id='dateOfBirthInput']")
  WebElement dateOfBirthPicker;

  @FindBy (xpath = "//select[@class='react-datepicker__month-select']")
  WebElement monthSelect;

  @FindBy (xpath = "//option[@value='11']")
  WebElement monthValue;

  @FindBy (xpath = "//select[@class='react-datepicker__year-select']")
  WebElement yearSelect;

  @FindBy (xpath = "//option[@value='1999']")
  WebElement yearValue;

  @FindBy (xpath = "//div[text()='14']")
  WebElement dateValue;

  @FindBy (xpath = "//input[@id='subjectsInput']")
  WebElement subjectFieldInput;

  @FindBy (xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']")
  List<WebElement> checkBoxes;

  @FindBy (xpath = "//input[@id='uploadPicture']")
  WebElement uploadPicture;

  @FindBy (xpath = "//textarea[@placeholder='Current Address']")
  WebElement addressFieldInput;

  @FindBy (xpath = "//input[@id='react-select-3-input']")
  WebElement dropDownStateValue;

  @FindBy (xpath = "//input[@id='react-select-4-input']")
  WebElement dropDownCityValue;

  @FindBy (xpath = "//button[@id='submit']")
  WebElement submitButton;

  @FindBy (xpath = "//div[@class='table-responsive']")
  WebElement submitForm;


  public void openPracticeForm() {

    practiceFormTab.click();
  }

  public void inputFirstName() {

    firstName.sendKeys("Vasya");
  }

  public void inputLastName() {

    lastName.sendKeys("Pypkin");
  }

  public void inputEmail() {

    email.sendKeys("Vasya.pypkin@mail.com");
  }

  public void selectGender() {

    for (WebElement el : genderRadioButton) {
      js.executeScript("arguments[0].click()", el);
    }
  }

  public void inputMobileNumber() {

    mobileNumber.sendKeys("1234567890");
  }

  public void openDatePicker() {

    dateOfBirthPicker.click();
  }

  public void selectMonth() {

    monthSelect.click();
    monthValue.click();
  }

  public void selectYear() {

    yearSelect.click();
    yearValue.click();
  }

  public void selectDate() {

    dateValue.click();
  }

  public void inputSubject() {

    js.executeScript("arguments[0].scrollIntoView();", subjectFieldInput);
    subjectFieldInput.sendKeys("Arts", "Math");
    subjectFieldInput.sendKeys(Keys.TAB);
  }

  public void selectAllCheckBoxes() {

    for (WebElement el : checkBoxes) {
      boolean isSelected = el.isSelected();
      if (!isSelected) {
        el.click();
      }
    }
  }

  public void uploadPicture() {

    uploadPicture.sendKeys("C:\\Users\\alemp\\Pictures\\Screenshots\\DynamicProperties");
  }

  public void inputAddress() {

    addressFieldInput.sendKeys("Belarus");
  }

  public void selectDropDownStateValue() {

    dropDownStateValue.sendKeys("NCR");
    dropDownStateValue.sendKeys(Keys.TAB);
  }

  public void selectDropDownCityValue() {
    dropDownCityValue.sendKeys("Delhi");
    dropDownCityValue.sendKeys(Keys.TAB);

  }

  public void submitForm(){

    submitButton.click();
  }

  public void checkForm() {
    Assert.assertTrue(submitForm.isDisplayed());
  }

}






