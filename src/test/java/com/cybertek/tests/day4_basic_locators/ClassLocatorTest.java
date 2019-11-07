package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homelink = driver.findElement(By.className("nav-link"));
        homelink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement messageElement = driver.findElement(By.className("h3"));
        String message = messageElement.getText();
        System.out.println(message);

        // if there is a space in class name, don't use it.
        System.out.println(driver.findElement(By.className("h3")).getText());



    }
}
