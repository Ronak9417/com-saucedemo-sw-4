package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By productMessage = By.xpath("//span[@class='title']");

    By listOfProduct = By.xpath("//div[@class='inventory_item']");

    public String successfulLoginMessage(){
        return getTextFromElement(productMessage);
    }

    public int productlist(){
        List<WebElement> product = driver.findElements(listOfProduct);
        return product.size();
            }

}
