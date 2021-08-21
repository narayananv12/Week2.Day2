package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {

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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("lakshmi");

		// Click Find Leads
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(3000);

		// Click on the First resulting lead
		WebElement firstname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String firstnametxt = firstname.getText();
		System.out.println("The firstname is :" + firstnametxt);
		firstname.click();
		
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//Verify the title as 'Duplicate Lead'
		String title1=driver.getTitle();
		
		
		if(title1.equals("Duplicate Lead | opentaps CRM"))
			System.out.println("Title matched");
		
		//Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Confirm the duplicated lead name is same as captured name
		String dupl = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(firstnametxt.equals(dupl))
		{
			System.out.println("Duplicate lead matched");
		}	
		else
			
		{
			System.out.println("Duplicate lead not matched");
		}
		
		driver.close();
		
		//Close the browser (Do not log out)


	}

}
