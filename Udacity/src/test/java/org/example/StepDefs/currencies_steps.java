package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

    public class currencies_steps {
        HomePage HomePage = new HomePage(Hooks.driver);

        @When("user select “euro” from currency dropdown list")
        public void userSelectEuroFromCurrencyDropdownList() {

            HomePage.currency_symbol().click();
            HomePage.currencyEuro().click();
        }

        @Then("All the products change to euro symbol")
        public void AllTheProductschangeToEuroSymbol() {
            int count = Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
            for (int x = 0; x < count; x++) {
                String text = HomePage.productPrices().getText();
                Assert.assertTrue(text.contains("€"));
            }
        }

        @Then("user choose Euro successfully")
        public void userChooseEuroSuccessfully() {
            String ExpectedResult = "€";
            String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
            Assert.assertTrue(ActualResult.contains(ExpectedResult));

        }
    }
//package org.example.StepDefs;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import java.util.List;
//import org.example.pages.currenciesPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//
//    public class currencies_steps {
//
//        currenciesPage home = new currenciesPage();
//        currenciesPage switchCurrencies = new currenciesPage();
//
//
//        @Given("user choose Euro from dropdown menu")
//        public void choose_Euro() {
//
//            switchCurrencies.choose_Euro();
//
//        }
//
//
//        @Then ("euro symbol is displayed on all products")
//        public void euro_symbol() {
//
//
//            for (int x = 0; x < home.prices().size(); x ++) {
//
//
//                String value = home.prices().get(x).getText();
//                System.out.println(value);
//            }
//
//        }
//        @Then ("user choose Euro successfully")
//        public void success_Euro() {
//            String ExpectedResult = "Euro";
//            String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
//            Assert.assertTrue(ActualResult.contains(ExpectedResult));
//
//        }
//
//
//    }
