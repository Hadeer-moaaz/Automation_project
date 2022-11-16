
package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
    WebDriver driver;

    public Register_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement Navigate_to_RegisterPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement maleGender()
    {
        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName()
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthMonth()
    {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement companyName()
    {
        return driver.findElement(By.id("Company"));
    }

    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerB()
    {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement successfulMsg()
    {
        return driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }


}

//package org.example.pages;
//
//import org.example.StepDefs.Hooks;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//
//
//    public class Register_page {
//
//        WebDriver driver;
//
//
//        public WebElement register_link()
//        {
//
//            return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")) ;
//        }
//
//
//        public WebElement gender()
//        {
//
//            return Hooks.driver.findElement(By.id("gender-female")) ;
//
//        }
//
//
//
//
//        public WebElement firstName()
//        {
//
//            return Hooks.driver.findElement(By.name("FirstName")) ;
//
//        }
//        public WebElement lastName()
//        {
//
//            return Hooks.driver.findElement(By.id("LastName")) ;
//
//        }
//
//        public void Register_steps (String firstName, String lastName){
//
//
//            firstName( ).clear();
//            firstName( ).sendKeys(firstName);
//
//            lastName( ).clear();
//            lastName( ).sendKeys(lastName);
//        }
//
//        public WebElement BirthDay()
//        {
//
//            By day = By.name("DateOfBirthDay'");
//            WebElement BirthDay= Hooks.driver.findElement(day);
//            Select select = new Select (BirthDay);
//            select.selectByIndex(16);
//            return BirthDay;
//
//        }
//
//        public WebElement DateOfBirthMonth()
//        {
//            By month = By.name("DateOfBirthMonth'");
//            WebElement BirthMonth= Hooks.driver.findElement(month);
//            Select se = new Select (BirthMonth);
//            se.selectByValue("5");
//            return BirthMonth;
//
//        }
//        public WebElement BirthYear()
//        {
//
//            By year = By.name("DateOfBirthYear'");
//            WebElement BirthYear= Hooks.driver.findElement(year);
//            Select lo = new Select (BirthYear);
//            lo.selectByVisibleText("1996");
//            return BirthYear;
//
//
//        }
//
//        public WebElement email()
//        {
//
//            return Hooks.driver.findElement(By.id("Email")) ;
//
//        }
//
//        public WebElement password()
//        {
//
//            return Hooks.driver.findElement(By.id("Password")) ;
//
//        }
//        public WebElement confirm_password()
//        {
//
//            return Hooks.driver.findElement(By.id("ConfirmPassword")) ;
//
//        }
//        public WebElement registerButton()
//        {
//
//            return Hooks.driver.findElement(By.id("register-button")) ;
//
//        }
//    }
//
