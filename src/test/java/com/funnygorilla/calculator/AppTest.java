package com.funnygorilla.calculator;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 * mvn clean test -Dwebdriver.chrome.driver="C:\\Opt\\Selenium\\chromedriver.exe"
 */
public class AppTest  
{
	protected static WebDriver driver;
	protected static String appUrl = "http://www.calculator.net/";
	
	@BeforeAll
	static void setup(){
		System.out.println("@BeforeAll executed");
	 	//System.setProperty("webdriver.chrome.driver", "C:\\Opt\\Selenium\\chromedriver.exe");		   
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(appUrl);
	}

	@BeforeEach
	void setupThis(){
		System.out.println("@BeforeEach executed");
	}

    @AfterEach
	void tearThis(){
	    driver.manage().deleteAllCookies();
    	System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear(){
		System.out.println("@AfterAll executed");
	    driver.close();
	}
	
    /**
     * Rigorous Test :-)
     */
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01()
    {
    	System.out.println("@Test-01 executed");
	    //Launch website
	   driver.navigate().to(appUrl);
     
       //Maximize the browser
       driver.manage().window().maximize();

       // Click on Math Calculators
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='7']")).click();
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='+']")).click();
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='8']")).click();
       
       // Get the Result Text based on its xpath
       String result = driver.findElement(By.xpath("//div[@id = 'sciOutPut']")).getText();

       int expectedResult = 15;
       // Print a Log In message to the screen
       System.out.println(" The Result is: [" + result + "]  Exoected result is: [" + expectedResult + "]");
       
       Assertions.assertEquals(Integer.parseInt(result.trim()), expectedResult);
    }    
    
    @Test
    public void test02()
    {
    	System.out.println("@Test-02 executed");
	    //Launch website
	   driver.navigate().to(appUrl);
     
       //Maximize the browser
       driver.manage().window().maximize();

       // Click on Math Calculators
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='7']")).click();
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='+']")).click();
       driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='8']")).click();
       
       // Get the Result Text based on its xpath
       String result = driver.findElement(By.xpath("//div[@id = 'sciOutPut']")).getText();

       int expectedResult = 15;
       // Print a Log In message to the screen
       System.out.println(" The Result is: [" + result + "]  Exoected result is: [" + expectedResult + "]");
       
       Assertions.assertEquals(Integer.parseInt(result.trim()), expectedResult);
    }    
	
	
}
