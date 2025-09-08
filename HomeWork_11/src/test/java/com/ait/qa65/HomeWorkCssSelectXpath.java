package com.ait.qa65;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkCssSelectXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void findElementCssSelector(){
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector("script"));
        driver.findElement(By.cssSelector("[href='/books']"));
        driver.findElement(By.cssSelector("[href^='/bo']"));
        driver.findElement(By.cssSelector("[href*='downloads']"));
        driver.findElement(By.cssSelector("[href$='ks']"));
        driver.findElement(By.cssSelector("input#small-searchterms"));
        driver.findElement(By.cssSelector("li.inactive"));
        driver.findElement(By.cssSelector("div.item-box"));
    }
    @Test
    public void findElementXpath(){
        driver.findElement(By.xpath("//div"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
        driver.findElement(By.xpath("//title[contains(.,'Web')]"));
        driver.findElement(By.xpath("//a[.='Register']"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//a[@class='ico-login']"));
        driver.findElement(By.xpath("//li/parent::*"));
        driver.findElement(By.xpath("//body/.."));
        driver.findElement(By.xpath("//ul/following-sibling::*"));
        driver.findElement(By.xpath("//li/preceding-sibling::*"));

    }

}
