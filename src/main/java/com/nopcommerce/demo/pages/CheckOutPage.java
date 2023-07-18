package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilites.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentTypeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "enter Firstname  " + firstName);
        sendTextToElement(firstName, value);
    }

    //enter Lastname
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "enter Lastname  " + lastName);
        sendTextToElement(lastName, value);
    }

    //enter Email
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS, "enter Email  " + email);
        sendTextToElement(email, value);
    }

    //select Country
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Country " + email.toString());
        CustomListeners.test.log(Status.PASS, "select Country  " + email);
        selectByVisibleTextFromDropDown(country, value);
    }


    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter City " + city.toString());
        CustomListeners.test.log(Status.PASS, "enter City  " + city);
        sendTextToElement(city, value);
    }

    //enter Address1
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Address1 " + address1.toString());
        CustomListeners.test.log(Status.PASS, "enter Address1  " + address1);
        sendTextToElement(address1, value);
    }

    //enter ZipCode
    public void enterZipCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Address1 " + zipCode.toString());
        CustomListeners.test.log(Status.PASS, "enter Address1  " + zipCode);
        sendTextToElement(zipCode, value);
    }

    //enter Phone Number
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Phone Number " + phoneNumber.toString());
        CustomListeners.test.log(Status.PASS, "enter Phone Number  " + phoneNumber);
        sendTextToElement(phoneNumber, value);
    }

    //click On Continue
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Continue " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Continue  " + continueButton);
        clickOnElement(continueButton);
    }

    //select Next DayAir
    public void selectNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Next DayAir " + nextDayAir.toString());
        CustomListeners.test.log(Status.PASS, "select Next DayAir  " + nextDayAir);
        clickOnElement(nextDayAir);
    }

    //click On Shipping Continue
    public void clickOnShippingContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Shipping Continue " + shippingContinueButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Shipping Continue  " + shippingContinueButton);
        clickOnElement(shippingContinueButton);
    }

    //click On CreditCard
    public void clickOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On CreditCard " + creditCard.toString());
        CustomListeners.test.log(Status.PASS, "click On CreditCard  " + creditCard);
        clickOnElement(creditCard);
    }

    //click On Payment Continue
    public void clickOnPaymentContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Payment Continue " + paymentContinueButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Payment Continue  " + paymentContinueButton);
        clickOnElement(paymentContinueButton);
    }

    //select CreditCard Type
    public void selectCreditCardType(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select CreditCard Type " + creditCardType.toString());
        CustomListeners.test.log(Status.PASS, "select CreditCard Type  " + creditCardType);
        selectByVisibleTextFromDropDown(creditCardType, value);
    }

    //enter Card Holder Name
    public void enterCardHolderName(String value) throws InterruptedException {
        Thread.sleep(1000);
        // Reporter.log("enter Card Holder Name " + cardHolderName.toString());
        CustomListeners.test.log(Status.PASS, "enter Card Holder Name  " + cardHolderName);
        sendTextToElement(cardHolderName, value);
    }

    //enter CardNumber
    public void enterCardNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log(" enter CardNumber " + cardNumber.toString());
        CustomListeners.test.log(Status.PASS, " enter CardNumber  " + cardNumber);
        sendTextToElement(cardNumber, value);
    }

    //select Expiration Date
    public void selectExpirationDate(String month, String year) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log(" select Expiration Date ");
        CustomListeners.test.log(Status.PASS, " select Expiration Date ");
        selectByVisibleTextFromDropDown(selectMonth, month);
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    //enter CardCode
    public void enterCardCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter CardCode ");
        CustomListeners.test.log(Status.PASS, "enter CardCode ");
        sendTextToElement(cardCode, value);
    }

    //get Payment Type Text
    public String getPaymentTypeText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Payment Type Text " + paymentTypeMessage.toString());
        CustomListeners.test.log(Status.PASS, "get Payment Type Text " + paymentTypeMessage);
        return getTextFromElement(paymentTypeMessage);
    }

    //get Shipping Method Text
    public String getShippingMethodText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Shipping Method Text " + shippingMethodText.toString());
        CustomListeners.test.log(Status.PASS, "get Shipping Method Text " + shippingMethodText);
        return getTextFromElement(shippingMethodText);
    }

    //get Total PriceText
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Total PriceText " + totalPriceText.toString());
        CustomListeners.test.log(Status.PASS, "get Total PriceText " + totalPriceText);
        return getTextFromElement(totalPriceText);
    }

    //click On Confirm
    public void clickOnConfirm() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Confirm " + confirmButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Confirm " + confirmButton);
        clickOnElement(confirmButton);
    }

    //click On Payment Info Continue
    public void clickOnPaymentInfoContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Payment Info Continue " + paymentInfoContinueButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Payment Info Continue " + paymentInfoContinueButton);
        clickOnElement(paymentInfoContinueButton);
    }
}
