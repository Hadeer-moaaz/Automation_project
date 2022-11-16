package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class categories_page {
    WebDriver driver;

    public categories_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement categoryList(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}

//package org.example.pages;
//
//
//
//import org.example.StepDefs.Hooks;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class categories_page{
//
//
//    public WebElement select_Computer_Category() {
//        By ComputerCategory = By.cssSelector("a[href=\"/computers\"]");
//        WebElement select_Computer_Category = Hooks.driver.findElement(ComputerCategory);
//        Actions actionProvider = new Actions(Hooks.driver);
//        actionProvider.moveToElement(select_Computer_Category).click().build().perform();
//        return select_Computer_Category;
//
//    }
//
//    public WebElement select_subCategory() {
//        By subcategory = By.cssSelector("a[href=\"/electronics\"]");
//        WebElement select_subCategory = Hooks.driver.findElement(subcategory);
//        Actions actionProvider = new Actions(Hooks.driver);
//        actionProvider.moveToElement(select_subCategory).build().perform();
//
//        By CameraSubCategory = By.cssSelector("a[href=\"/camera-photo\"]");
//        WebElement Electronics_SubCategory_Camera_photo = Hooks.driver.findElement(CameraSubCategory);
//        actionProvider.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
//        return select_subCategory;
//    }
//    public WebElement Gift_Cards_Category() {
//        By giftCard = By.cssSelector("a[href=\"/gift-cards\"]");
//        WebElement Gift_Cards_Category = Hooks.driver.findElement(giftCard);
//        Actions actionProvider = new Actions(Hooks.driver);
//        actionProvider.moveToElement(Gift_Cards_Category).click().build().perform();
//        return Gift_Cards_Category;
//    }
//}
