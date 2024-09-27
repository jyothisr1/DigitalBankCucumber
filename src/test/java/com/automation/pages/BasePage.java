package com.automation.pages;

import com.automation.utils.DriverManager;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage(){
        driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

}
