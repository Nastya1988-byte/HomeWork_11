package com.ait.qa65;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork_11Test {
    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openTricentis(){
        System.out.println("Mein first AutoTest Home Work!!!");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
