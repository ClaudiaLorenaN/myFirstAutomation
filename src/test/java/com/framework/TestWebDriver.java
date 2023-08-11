package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class TestWebDriver {

    public static void main(String[] args){
        ChromeOptions co = new ChromeOptions();
        co.setBrowserVersion("116");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("naveen automation labs");
        System.out.println(driver.getTitle());

        /*WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("naveen automation labs");
        System.out.println(driver.getTitle());*/


    }
}
