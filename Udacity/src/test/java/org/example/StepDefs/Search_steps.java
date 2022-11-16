package org.example.StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.Search_page;
import org.testng.asserts.SoftAssert;

public class Search_steps {
    HomePage HomePage  = new HomePage(Hooks.driver);
    Search_page search = new Search_page(Hooks.driver);

    @Given("user clicks on search field")
    public void search_field() {

        HomePage.search().click();
    }

    @When("user search for product name like \"(.*)\"$")
    public void search_for_product(String search) {
        HomePage.search().sendKeys(search);
    }

    @And("user click on search Button")
    public void search_Button() {

        HomePage.search_Button().click();
    }

    @Then("user could search successfully and go to search page")
    public void search_successfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Nokia"), "search URL");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could search successfully with SKU code")
    public void successfully_with_SKU_code() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could not search for the product")
    public void unable_to_search() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(search.noProducts().isDisplayed(), "No products");
    }
}
//package org.example.StepDefs;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import org.example.pages.Search_page;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//public class Search_steps {
//    Search_page search = new Search_page();
//
//    @When("user clicks on search field")
//    public void search()
//    {
//        search.search().click();
//    }
//
//
//    @And("user search with {string}")
//    public void userSearchWith(String arg0) throws InterruptedException {
//
//        Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//        search.search().sendKeys("book");
//    search.search().click();
//
//
//    search.search().sendKeys("laptob");
//    search.search().click();
//
//    search.search().sendKeys("nike");
//    search.search_button().click();
//
//    }
//
//
//        @And("user search with {string} product")
//        public void userSearchWithProduct(String arg0)  {
//
//            Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//            search.search().sendKeys("AP_MBP_13");
//            search.search().click();
//
//            search.search().sendKeys("FL_GIRL_B");
//            search.search_button().click();
//
//            search.search().sendKeys("FIRST_PRP");
//            search.search_button().click();
//
//        }
//
//
//
//    @Then("user could find relative results")
//    public void relative_result()
//    {
//
//        for (int x = 0; x < search.().size(); x ++) {
//
//
//            String value = search.prices().get(x).getText();
//            System.out.println(value);
//        }
//
//
//
//        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
//        System.out.println(count);
//        Assert.assertTrue(count>0);
//        ArrayList <String>products = null;
//        products = new ArrayList<String>();
//        for (int x = 0 ; x < count ; x++ ){
//            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
//            products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
//            // Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText().toLowerCase().contains("Apple MacBooK"));
//        }
//        System.out.println(products);
//    }
//
//
//}