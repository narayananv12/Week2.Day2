package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title=driver.getTitle();

		System.out.println(title);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement (By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']" )).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Test1");
		driver.findElement(By.id("lastNameField")).sendKeys("Leaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test1");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("createContactForm_lastNameLocal");
		
		//Enter Department Field Using any Locator of Your Choice
		
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CS");
		  
		// 12. Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.name("description")).sendKeys("Give the description for department");
		
		// 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		// 
		// 14. Select State/Province as NewYork Using Visible Text
		  WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		  Select drpdown = new Select(dropdown);
		  drpdown.selectByVisibleText("New York");
		// 
		// 15. Click on Create Contact
		  driver.findElement(By.name("submitButton")).click();
		// 
		// 16. Click on edit button 
		  driver.findElement(By.linkText("Edit")).click();
		// 
		// 17. Clear the Description Field using .clear
		  driver.findElement(By.name("description")).clear();
		// 
		// 18. Fill ImportantNote Field with Any text
		  driver.findElement(By.name("importantNote")).sendKeys("fill in the important note if you have on it");
		// 
		// 19. Click on update button using Xpath locator
		  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		  
		// 
		// 20. Get the Title of Resulting Page.
		  
		  String title1 = driver.getTitle();
		  System.out.println(title1);

		
		
		
		
	}
		
	}
	


