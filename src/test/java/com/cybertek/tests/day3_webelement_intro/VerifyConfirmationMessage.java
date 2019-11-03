package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";

        emailInputBox.sendKeys(expectedEmail);

        //String actualEmail = emailInputBox.getText();
        String actualEmail = emailInputBox.getAttribute( "value");

        if (expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected email = " + expectedEmail);
            System.out.println("actual email = " + actualEmail);

        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedMessage = "Your e-mail's been sent!";

        WebElement messageElement = driver.findElement(By.name("confirmation_message"));

        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected message = " + expectedMessage);
            System.out.println("actual message = " + actualMessage);

        }
Thread.sleep(3000);


        driver.quit();



    }

}
