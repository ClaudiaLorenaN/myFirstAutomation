package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    /*{
        System.out.println("Hello world!");
    }*/
}