package TestNGPackage;

import org.testng.annotations.Test;

import Utility.WebDriverUtility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Test_Url01 extends WebDriverUtility{
	private static final boolean True = false;
	public static WebDriver driver;
	
	  @Test(priority=1, enabled = True)
	  public void f() {
		  String myurl = "https://www.saucedemo.com/"; 		  
			String applicationurl =  driver.getCurrentUrl(); 
			if(myurl.equals(applicationurl)) { 			 
				System.out.println("passed"); 		  
				}
			else { 			  
				System.out.println("failed");
			}
	  }
	  @Test(priority=2, enabled = True)
	  public void g() throws InterruptedException {
		  
		   WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		   username.sendKeys("standard_user");
		   WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		   password.sendKeys("secret_sauce");
		   WebElement loginbutton= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		   loginbutton.click();
		 
	  }
	  @Test(priority=3, enabled = True)
	  public void h() throws InterruptedException {
		  WebElement addtocart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		  addtocart.click();
		  WebElement addtocart1= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		  addtocart1.click();
		  WebElement shopping_cart_link = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		  shopping_cart_link.click();
		  WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		  checkout.click();
		   
	  }
	  @Test(priority=4, enabled = True)
	  public void i() throws InterruptedException {
		  
		  WebElement firstName= driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		  firstName.sendKeys("Akshay");
		  WebElement lastName= driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		  lastName.sendKeys("km");
		  WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		  postalCode.sendKeys("123456");
		  WebElement submit = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		  submit.click();
		 
	  }
	  @Test(priority=5, enabled = True)
	  public void j() throws InterruptedException {
		  
		  WebElement text = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[1]"));
		  String actualtext = text.getText();
		  System.out.println(actualtext);
		  WebElement text1 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[2]/div[1]"));
		  String actualtext1 = text1.getText();
		  System.out.println(actualtext1);
		  WebElement text2 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]"));
		  String actualtext2 = text2.getText();
		  System.out.println(actualtext2);
		  WebElement text3 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]"));
		  String actualtext3 = text3.getText();
		  System.out.println(actualtext3);
		  WebElement text4 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]"));
		  String actualtext4 = text4.getText();
		  System.out.println(actualtext4);
		  WebElement text5 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]"));
		  String actualtext5 = text5.getText();
		  System.out.println(actualtext5);
		  WebElement text6 = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]"));
		  String actualtext6 = text6.getText();
		  System.out.println(actualtext6);
		  WebElement finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		  finish.click();
	
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  String driverpath="D:\\\\library\\\\chromedriver.exe";
		String url="https://www.saucedemo.com/";
		launchBrowser(driverpath,url);
		  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
}
