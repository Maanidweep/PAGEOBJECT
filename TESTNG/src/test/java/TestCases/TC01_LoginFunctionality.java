package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC01_LoginFunctionality {
	
	WebDriver driver;
	
 @Test
  public void LoginFunctionality() throws InterruptedException {
	  
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");// Login
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.tagName("button")).click(); 
	  
	  
	  
	 
  }
 
 @Test
 public void Navigate_AdminPAge() throws InterruptedException
 {
	 
	 driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='menuitem'])[1]")).click();
		Thread.sleep(1000);

 }
 
 @AfterTest
 public void add_job_records_with_jobname_jobdescription_jobnote(String JobTitle, String JobDescr, String JobNote) throws InterruptedException {
	  
	  
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
     WebElement TextBox =  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
     TextBox.sendKeys(JobTitle);
     System.out.println(JobTitle);
	   Thread.sleep(1000);

		//driver.findElement(By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")).sendKeys(JobDescr);
		
	   WebElement TextBox1 = driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'][@placeholder='Type description here']"));
	   TextBox1.sendKeys(JobDescr);
	   System.out.println(JobDescr);
	   Thread.sleep(1000);
     
		//driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]").sendKeys(JobDescr);
		WebElement TextBox2 = driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'][@placeholder='Add note']"));
		TextBox2.sendKeys(JobNote);
		System.out.println(JobNote);
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'] [@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(3000);
	    
	  
	 
 }
 
 @AfterTest
 public void click_on_logout_button() throws InterruptedException
 {
	 
	 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		//driver.findElement(By.xpath("//a[@class='oxd-userdropdown-link'][normalize-space()='Logout']")).click();
		//Thread.sleep(3000);
		System.out.println("Logged Off The Appn");
 }
 
 @Test
 public void close_browser() 
 {
	 
	 System.out.println("Browser closed");

 }

 
} 
  


