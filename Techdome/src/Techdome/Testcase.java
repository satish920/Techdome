package Techdome;

import java.lang.invoke.StringConcatFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Testcase {

	public static void main(String[] args) {

    //System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.amazon.in");
	   Actions act = new Actions(driver);
	   act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
	  driver.findElement(By.id("ap_email")).sendKeys("919014798352");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys("Satish@123");
	  driver.findElement(By.id("signInSubmit")).click();
	  driver.findElement(By.id("input-box-otp")).sendKeys("345267");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).click();
	  String productprice =  driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	
	    System.out.println(productprice);
	
	
	
	
	
	}

}
