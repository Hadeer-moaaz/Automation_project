package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.categories_page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class categories_steps {
    HomePage HomePage = new HomePage(Hooks.driver);
    categories_page category = new categories_page(Hooks.driver);
    String subCategoryName;

    @When("user select category and subcategory")
    public void select_category() throws InterruptedException {


        Actions action = new Actions(Hooks.driver);
        action.moveToElement(HomePage.computers()).perform();
        action.moveToElement(HomePage.computers()).perform();

        subCategoryName = HomePage.desktops().getText().toLowerCase();

        Thread.sleep(1000);
    }

    @And("user click on subcategory")
    public void user_clicks_subcategory(){
        HomePage.desktops().click();
    }

    @Then("user find relative product page")
    public void product_found(){
        Assert.assertEquals(category.categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}



//package org.example.StepDefs;
//
//
//import org.example.pages.categories_page;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//
//public class categories_steps {
//    categories_page Categories = new categories_page ();
//    private Actions actionProvider;
//
//    @Given("logged user navigate to home page")
//    public void navigate_to_home() {
//        String url = "https://demo.nopcommerce.com/";
//        Hooks.driver.navigate().to(url);
//    }
//
//    @When("user select Computer categories")
//    public void select_Computer_Category() {
//        Categories.select_Computer_Category();
//    }
//
//    @And("user select a Electronics categories then hover to camera and photo subcategory")
//    public void select_subCategory() {
//        Categories.select_subCategory();
//    }
//
//
//    @And("user choose Gift Cards categories")
//    public void Gift_Cards_Category() {
//        Categories.Gift_Cards_Category();
//    }
//}