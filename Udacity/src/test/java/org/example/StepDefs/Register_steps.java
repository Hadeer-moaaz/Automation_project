package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.example.pages.Register_page;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Register_steps {

    HomePage homepage = new HomePage(Hooks.driver);
    Register_page  register = new Register_page(Hooks.driver);

    @Given("user navigate to register page")
    public void register_page() {

        homepage.Navigate_to_RegisterPage().click();
    }

    @And("user select gender type")
    public void Gender(){
        register.maleGender().click();
    }

    @And("user enter valid data")
    public void user_enter_first_name(){
        register.firstName().sendKeys("Hadeer");

        register.lastName().sendKeys("Moaaz");

        Select select = new Select(register.birthDay());
        select.selectByIndex(30);

        select = new Select(register.birthMonth());
        select.selectByVisibleText("August");

        select = new Select(register.birthYear());
        select.selectByValue("1992");


        register.email().sendKeys("Hadeermohamed7@gmail.com");

        register.companyName().sendKeys("Vois");

        register.password().sendKeys("Vois@3030");
        register.confirmPassword().sendKeys("Vois@3030");
    }

    @Then("user click on register button")
    public void register_button()
    {
        register.registerB().click();
    }

    @Then("success message is displayed")
    public void register_successfully() {

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.successfulMsg().isDisplayed(), "Success Message");

        String actual = register.successfulMsg().getCssValue("color");
        String expected = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actual, expected, "color is correct");

        soft.assertAll();
    }
}


//package org.example.StepDefs;
//
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.Register_page;
//import org.openqa.selenium.By;
//import org.testng.asserts.SoftAssert;
//
//    public class Register_steps {
//
//        Register_page register =new Register_page();
//
//
//
//
//        @Given("user go to register page")
//        public void go_to_register()
//        {
//
//            register.register_link().click();
//
//        }
//
//
//
//        @When("user select gender type")
//        public void select_gender()
//        {
//
//            register.gender().click();
//
//        }
//
//        @And("user enter first name {string} and lastname {string}")
//        public void userEnterFirstNameAndLastname(String arg0, String arg1) {
//
//            register.Register_steps("HadeerMohamed5@gmial.com", "Vois@5050");
//        }
//
//
//        @And("user enter date of birth")
//        public void day_OF_date ()
//        {
//            register.BirthDay().click();
//
//        }
//
//        @And("user enter month of birth")
//        public void month_date ()
//        {
//
//            register.DateOfBirthMonth().click();
//
//        }
//
//        @And("user enter year of birth")
//        public void BirthYear ()
//        {
//
//            register.BirthYear().click();
//
//
//        }
//        @And("user enter email field")
//        public void email()
//        {
//
//            register.email().sendKeys("Hadeermoaaz@gmail.com");
//        }
//        @And("user fills Password field")
//        public void Password()
//        {
//            register.password().sendKeys("Voda@2020");
//
//        }
//
//        @And("user fills confirmPassword field")
//        public void confirmPassword()
//        {
//            register.confirm_password().sendKeys("pass@word4");
//
//        }
//        @And("user clicks on register button")
//        public void register_button()throws InterruptedException
//        {
//
//            Thread.sleep(3000);
//
//            register.registerButton().click();
//        }
//
//        @Then("success message is displayed")
//        public void success_message() throws InterruptedException
//        {
//            SoftAssert soft = new SoftAssert();
//            Thread.sleep(3000);
//            String ExpectedResult = "Your registration completed";
//            String ActualResult = Hooks.driver.findElement(By.className("result")).getText();
//            soft.assertTrue(ActualResult.contains(ExpectedResult), "First assertion");
////
////		String color = Hooks.driver.findElement(By.xpath("xpath_value")).getCssValue("color");
////		System.out.println(color);
////
////		soft.assertEquals(Hooks.driver.findElement(By.xpath("xpath_value")).getCssValue("color"), "");
////
////		soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure", "Third assertion");
////
////		soft.assertAll();
//
//        }
//
//
//    }
