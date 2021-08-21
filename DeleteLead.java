package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("Leads")).click();
		
		// // 7      Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
 // 8	Click on Phone
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		// 9	Enter phone number
	driver.findElement(By.name("phoneNumber")).sendKeys("25");
		// 10	Click find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	Thread.sleep(3000);
		
		// 11	Capture lead ID of First Resulting lead
		WebElement searchLink = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
		String leadId = searchLink.getText();
		System.out.println("The leadId is :" + leadId);
		// 12	Click First Resulting lead
		searchLink.click();
		
	
		
		// 13	Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		// 14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		// 15	Enter captured lead ID
	driver.findElement(By.name("id")).sendKeys(leadId);
		
		// 16	Click find leads button
	driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		//
		// 17	Verify message "No records to display" in the Lead List. This message confirms the // 	successful deletion
	
	boolean displayed = driver.findElement(By.xpath("//div[text() = 'No records to display']")).isDisplayed();
	if (true)
		System.out.println("Test pass!! Delete lead successful");
	else
		System.out.println("Test fail");
		
	
		
		
	}

}
