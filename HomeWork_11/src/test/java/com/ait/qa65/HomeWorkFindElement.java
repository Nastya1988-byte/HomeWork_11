package com.ait.qa65;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkFindElement {

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
    public void findElementById() {
        WebElement elementId = driver.findElement(By.id("dialog-notifications-success"));
    }

    @Test
    public void findByCssSelector() {
        driver.findElement(By.cssSelector("[type = 'text/javascript']"));
        driver.findElement(By.cssSelector("link[rel='shortcut icon']"));

    }

    @Test
    public void findByClassName() {
        driver.findElement(By.className("header"));
    }

    @Test
    public void findByName() {
        driver.findElement(By.name("NewsletterEmail"));
    }

    @Test
    public void findByXpath() {
        driver.findElement(By.xpath("//meta[@name='viewport']"));
    }

    @Test
    public void findByTagName() {
        List<WebElement> elements = driver.findElements(By.tagName("script"));
        System.out.println(elements.size());

        List<WebElement> elements1 = driver.findElements(By.tagName("strong"));
        System.out.println(elements1.size());
        System.out.println(elements1.get(0).getText());
        System.out.println(elements1.stream().map(WebElement::getText).toList());

        List<WebElement> li = driver.findElements(By.tagName("li"));
        System.out.println(li.size());
        System.out.println(li.isEmpty());

        WebElement h3 = driver.findElement(By.tagName("h3"));
        System.out.println(h3.getText());


    }

}
