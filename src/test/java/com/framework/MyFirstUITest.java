package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MyFirstUITest {

    public static void main(String[] args) throws MalformedURLException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    void userNameIsCorrectOnOverviewTab() {
        //arrange
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String user = "ClaudiaLorenaN";
        driver.get("https://github.com/" + user);

        //act
        String actualUserName = driver.findElement(By.className("p-nickname")).getText();


        //Assert
        Assertions.assertEquals(user, actualUserName);
        driver.close();
    }

    @Test
    void repoGoToCorrectRepo() {
        //arrange
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String user = "ClaudiaLorenaN";
        driver.get("https://github.com/" + user);

        //act
        String repo = "Claudia";
        WebElement repoLink = driver.findElement(By.linkText(repo));

        repoLink.click();
        String actualUrl = driver.getCurrentUrl();


        //Assert
        Assertions.assertEquals("https://github.com/ClaudiaLorenaN/" + repo, actualUrl);
        driver.close();
    }
}
