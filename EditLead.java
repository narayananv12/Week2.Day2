package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("catt");

		// Click Find Leads
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(3000);

		// Click on the First resulting lead
		WebElement searchLink = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
		String leadId = searchLink.getText();
		System.out.println("The leadId is :" + leadId);
		searchLink.click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		WebElement comName = driver.findElement(By.id("updateLeadForm_companyName"));
		comName.clear();
		comName.sendKeys("New Company");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement compname = driver.findElement(By.xpath("//span[contains (text(), 'New Company')]"));
		boolean s1= compname.isDisplayed();
		if(s1==true)
		{
		System.out.println("The new value updated in the company name");	
				
	} else
		{
		System.out.println("The new value is not updated");
	
	}
}
}
		
		



	


