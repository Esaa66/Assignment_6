package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

    WebDriver driver;

    public void Search1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Selenium Java//Drivers//Chrome Driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Software Testing");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"btnK\"]")).sendKeys(Keys.ENTER);
        driver.close();
    }

    public void tryFree() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Selenium Java//Drivers//Chrome Driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.actitime.com/%22");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@name="Try Free"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Try Free")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("Ameer");
        Thread.sleep(3000);
        driver.findElement(By.id("last-name")).sendKeys("Alkadhimi");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("e3sar@hotmail.se");
        driver.findElement(By.id("company")).sendKeys("LTU");
        driver.close();
    }
    public void Search (){
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://adlibris.com/se%22");

                driver.findElement(By.name("q")).sendKeys("praktisk mjukvarutestning");
        driver.findElement(By.id("search-button")).click();
        driver.findElement(By.className("search-resultproductname")).click();
        driver.findElement(By.className("productadd-to-cart")).click();
        //           driver.findElement(By.className("page-headertoogletext")).click();
        driver.findElement(By.className("material-iconsshopping_cart")).click();
        driver.findElement(By.linkText("Till kassan")).click();
    }


    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Googlesearch GSearch = new Googlesearch();
        GSearch.Search1();
        GSearch.tryFree();
        GSearch.Search();

    }
}