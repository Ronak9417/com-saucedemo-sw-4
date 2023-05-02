package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {


        String expected = "Products";
        //Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        //Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        waitUntilVisibilityOfElementLocated(By.xpath("//span[@class='title']"),5);
        // Verify the text 'product'
        String actualText = homePage.successfulLoginMessage();
        Assert.assertEquals(actualText, expected, "Login page not found");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        //Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();

        //Verify that six products are displayed on page
        int actualQuantity = homePage.productlist();
        int expectedQuantity = 6;
        Assert.assertEquals(expectedQuantity, actualQuantity);


    }
}
