package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Concept {

//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\nazee\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe"); // create driver
//		WebDriver driver = new ChromeDriver(); // initializing driver
//		driver.get("https://demo.automationtesting.in/Frames.html"); 
//		driver.manage().window().maximize();  //maximize window	
//		WebElement SingleIframe = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
//		SingleIframe.click();
//		WebElement iFrameDemo = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(iFrameDemo);
//		WebElement sendingname = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//		sendingname.sendKeys("Nazeera"); //to send keys
//		driver.switchTo().defaultContent(); //to come out of the frame
//		WebElement iframewith = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div/ul/li[2]/a"));
//		iframewith.click();
//		WebElement NestedIframes = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
//		
//		
//		
//// 
		
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nazee\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
	//	driver.findElement(By.xpath("//input[@fdprocessedid='h69e5f']")).sendKeys("Nazeera");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Nazeera");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']//iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style ='float: left;height: 250px;width: 400px']")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("SDET");
		driver.switchTo().defaultContent();
		
		
		
	}

}

// /html/body/section/div/div/div/input