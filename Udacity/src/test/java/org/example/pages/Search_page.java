package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
    WebDriver driver;

    public Search_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public int productsList(){
        int size = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts(){
        return driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}





//package org.example.pages;
//
//
//
//import org.example.StepDefs.Hooks;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class Search_page {
//
//    public WebElement search()
//    {
//        By Search= By.id("small-searchterms");
//        WebElement search= Hooks.driver.findElement(Search);
//        return search;
//    }
//
//    public WebElement search_button()
//    {
//
//        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));

//    }

//public WebElement first_product()
//{
//
//        return Hooks.driver.findElement(By.id("small-searchterms"));
//    }
//
//    public WebElement second_product()
//    {
//
//        return Hooks.driver.findElement(By.cssSelector("a[title=\"Show details for Flower Girl Bracelet\"]"));
//    }
//
//
//    public WebElement third_product()
//    {
//
//        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1"));
//    }


//    public WebElement Flower_product1() {
//
//
//        return Hooks.driver.findElement(By.id("small-searchterms"));
//
//    }
//
//    public WebElement Flower_product()
//    {
//
//        return Hooks.driver.findElement(By.cssSelector("a[title=\"Show details for Flower Girl Bracelet\"]"));
//
//    }

