package org.example.StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class Login_steps {

    HomePage  HomePage = new HomePage(Hooks.driver);
    LoginPage login = new LoginPage(Hooks.driver);

    @When("user navigate to login page")
    public void user_navigate_to_login_page() {

        HomePage.Navigate_to_LoginPage().click();
    }

    @And("user enter \"(.*)\" and \"(.*)\"$")
    public void vaild_data(String email, String password) throws InterruptedException {
        login.LoginSteps(email, password);
        Thread.sleep(1000);
    }

    @Then("user click on login button")
    public void click_button() {
        login.passwordE().sendKeys(Keys.ENTER);
    }

    @And("user could login successfully and go to home page")
    public void login_successfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL login");
        // Second Assertion
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
        soft.assertTrue(login.myAccount().isDisplayed(), "My Account");
        // Assert All
        soft.assertAll();
    }

    @And("user could not login successfully and go to home page")
    public void unable_to_login() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        login.wrongMsg().isDisplayed();
        String actual = login.wrongMsg().getText();
        soft.assertEquals(actual,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect","Wrong Message");
        // Second Assertion
        actual = login.wrongMsg().getCssValue("color");
        String expected = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actual, expected, "color");
        // Assert All
        soft.assertAll();
    }
}

//package org.example.StepDefs;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.LoginPage;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.testng.asserts.SoftAssert;
//
//import java.util.concurrent.TimeUnit;
//
//public class Login_steps {
//
//        LoginPage login = new LoginPage();
//
//        @Given("user go to login page pressing on login button")
//        public void login_page ()  {
//
//
//            Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//            login.loginButton().click();
//
//        }
//
//
//        @When("user login with valid {string} and {string}")
//        public void userLoginWithValidAnd(String arg0, String arg1) {
//
//            Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//            login.Loginsteps("hadeermoaaz6@gmail.com", "Vois@20202020");
//        }
//
//        @When("user login with invalid {string} and {string}")
//        public void userLoginWithInvalidAnd(String arg0, String arg1) {
//
//            login.Loginsteps("hadeer@gmail.com", "Vo090");
//        }
//
//        @And("user press on login button")
//        public void signIN ()   {
//
//            Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//            login.SignIn().click();
//
//        }
//
//
//        @Then("user login to the system successfully")
//
//        public void loginSuccessfully() throws InterruptedException {
//
//
//            SoftAssert soft = new SoftAssert();
//            Thread.sleep(3000);
//            String ExpectedResult = "My account";
//            String ActualResult = Hooks.driver.findElement(By.className("ico-account")).getText();
//            soft.assertTrue(ActualResult.contains(ExpectedResult));
//            soft.assertEquals(ActualResult.contains(ExpectedResult), true);
//
//            soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed(), "Second assertion");
//            soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
//
//            soft.assertAll();
//        }
//
//        @Then("user could not login to the system")
//        public void wrongLogin()
//        {
//
//            String ExpectedResult = "Login was unsuccessful. Please correct the errors and try again.";
//            String ActualResult = Hooks.driver.findElement(By.className("message-error validation-summary-errors")).getText();
//            Assert.assertTrue(ActualResult.contains(ExpectedResult));
//            Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
//
////            String [] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
////
////            int hexValue1 = Integer.parseInt(hexValue[0]);
////            hexValue[1] = hexValue[1].trim();
////
////
////            String actualColor = String.format("#%02x%02x%02x", hexValue1);
////            Assert.assertEquals("#64728c", actualColor);
//        }
//
//        @After
//        public void close()
//        {
//            Hooks.driver.quit();
//
//        }
//
//
//    }
