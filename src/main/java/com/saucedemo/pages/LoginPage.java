package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


       By emailField = By.id("user-name");
       By passwordField = By.name("password");
       By loginButton = By.xpath("//input[@id='login-button']");

       //Enter username
       public void enterEmailId(String email){
              sendTextToElement(emailField, email);
       }

      // Enter  password
       public void enterPassword(String password){
              sendTextToElement(passwordField, password);
       }

       //Click on Login Button
       public void clickOnLoginButton(){
              clickOnElement(loginButton);
       }




}
