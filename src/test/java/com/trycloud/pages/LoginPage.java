package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;


    @FindBy(id = "submit-form")
    public WebElement logInButton;

    public void login(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        logInButton.click();
    }


}

