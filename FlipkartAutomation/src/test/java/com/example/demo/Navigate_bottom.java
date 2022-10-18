package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_bottom {
	WebDriver wd;
	 @BeforeTest
	  public void config() {
	  	WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	
	  }

	  @AfterTest
	  public void quitbrowser() throws InterruptedException {
		  Thread.sleep(2000);
	  	wd.quit();
	  }
	  	
	  	
	    @Test
	    public void test1() throws InterruptedException {
	   wd.get("https://www.flipkart.com/");
	   wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	   JavascriptExecutor js = (JavascriptExecutor) wd;
       //Scroll down till the bottom of the page
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       System.out.println("Navigates to the bottom of the page");
	   Reporter.log("Navigates to the bottom of the page");

	    }}
