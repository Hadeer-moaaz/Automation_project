package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.example.pages.whislist_page;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Wishlist_steps {
    HomePage homepage;
    whislist_page wish;
    int num;

    @Given("user add item to wishlist")
    public void user_add_item_to_wishlist() {
        homepage = new HomePage(Hooks.driver);
        wish = new whislist_page(Hooks.driver);
        homepage.add_button().get(2).click();
    }

    @Then("wishlist success operation massage is visible")
    public void success_notification() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(homepage.wishSuccessMsg().isDisplayed(), "Success Message");

        String actual = homepage.wishSuccessMsg().getCssValue("background-color");
        String expected = "rgba(75, 176, 122, 1)";
        soft.assertEquals(actual, expected, "Message color");
        soft.assertAll();
    }

    @And("user can get the number of wishlist items added")
    public void items_increased() {
        String text = homepage.wishList().getText();
        text = text.replaceAll("[^0-9]", "");
        num = Integer.parseInt(text);
    }

    @Then("the number of wishlist increased")
    public void number_of_items_of_wishlist() throws InterruptedException {
        Assert.assertTrue(num > 0, "count of wishlist items");
    }

    @And("user can go to wishlist page")
    public void user_go_to_wishlist() throws InterruptedException {
        homepage.closeB().click();
        Thread.sleep(500);
        homepage.wishList().click();
    }

    @Then("the number of items greater than zero in wishlist page")
    public void wishlist_Page_Assertion() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"), "wishlist URL");
        int size = wish.wishListItems();
        soft.assertTrue(size > 0,"wishlist items");
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
//
//import org.example.pages.whislist_page;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//public class Wishlist_steps {
//    whislist_page wishlist = new whislist_page();
//
//    @Given("user navigate to home_page")
//    public void navigate_log_in_page()
//    {
//        String url = "https://demo.nopcommerce.com/";
//        Hooks.driver.navigate() .to(url);
//    }
//
//    @When("user add Apple MacBook to wishlist")
//    public void Apple_MacBook() {
//        wishlist.Apple_MacBook().click();
//    }
//
//    @And("user click on add to wishlist button")
//    public void Add_To_Wishlist_1() {
//        wishlist.Add_To_Wishlist_1().click();
//    }
//
//    @Then("success message_1")
//    public void Success_message_1() {
//        String ExpectedResult = "The product has been added to your wishlist";
//        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
//        Assert.assertTrue(ActualResult.contains(ExpectedResult));
//        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your wishlist");
//    }
//    @When("user add Laptop Samsung to wishlist")
//
//    public void Laptop_Samsung() {
//        wishlist.Laptop_Samsung().click();
//    }
//    @And("user click on add to wishlist button_2")
//    public void Add_To_wishlist_2() {
//        wishlist.Add_To_Wishlist_2().click();
//    }
//    @Then("success message_2")
//    public void Success_message_2() {
//        String ExpectedResult = "The product has been added to your wishlist";
//        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
//        Assert.assertTrue(ActualResult.contains(ExpectedResult));
//        System.out.println("Samsung Series 9 Laptop: The product has been added to your wishlist");
//    }
//    @When("user add HP laptop to wishlist")
//    public void HP_Laptop() {
//        wishlist.HP_Laptop().click();
//
//    }
//
//    @And("user click on add to tha wishlist button_3")
//    public void Add_To_wishlist_3() {
//        wishlist.Add_To_Wishlist_3().click();
//    }
//
//    @Then("success message_3")
//    public void Success_message_3() {
//        String ExpectedResult = "The product has been added to your wishlist";
//        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
//        Assert.assertTrue(ActualResult.contains(ExpectedResult));
//        System.out.println("HP Spectre XT Pro UltraBook: The product has been added to your wishlist");
//    }
//}
