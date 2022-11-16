
package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class whislist_page {
    WebDriver driver;

    public whislist_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public int wishListItems(){
        int size = driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }
}

//package org.example.pages;
//
//
//import org.example.StepDefs.Hooks;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class whislist_page {
//    public WebElement Apple_MacBook() {
//        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
//        WebElement Apple_MacBook = Hooks.driver.findElement(MacBook);
//        return Apple_MacBook;
//    }
//    public WebElement Add_To_Wishlist_1() {
//        By wishlist_1 = By.id("add-to-wishlist-button-4");
//        WebElement Add_To_Wishlist_1 = Hooks.driver.findElement(wishlist_1);
//        return Add_To_Wishlist_1;
//    }
//
//
//    public WebElement Laptop_Samsung() {
//        By Samsung = By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]");
//        WebElement Laptop_Samsung = Hooks.driver.findElement(Samsung);
//        return Laptop_Samsung;
//
//    }
//    public WebElement Add_To_Wishlist_2() {
//        By wishlist_2 = By.id("add-to-wishlist-button-6");
//        WebElement Add_To_Wishlist_2 = Hooks.driver.findElement(wishlist_2);
//        return Add_To_Wishlist_2;
//    }
//
//    public WebElement HP_Laptop() {
//        By HP = By.cssSelector("a[href=\"/hp-spectre-xt-pro-ultrabook\"]");
//        WebElement HP_Laptop = Hooks.driver.findElement(HP);
//        return HP_Laptop;
//    }
//    public WebElement Add_To_Wishlist_3() {
//        By wishlist_3 = By.id("add-to-wishlist-button-7");
//        WebElement Add_To_Wishlist_3 = Hooks.driver.findElement(wishlist_3);
//        return Add_To_Wishlist_3;
//    }
//}