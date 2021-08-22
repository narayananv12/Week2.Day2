package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Enter from
		//WebElement fromloc = driver.findElement(By.id("src"));
		//fromloc.sendKeys("Chennai", Keys.ENTER);
		
		
		//Enter Destination
			//WebElement desloc =	driver.findElement(By.id("dest"));
			//desloc.sendKeys("Madiwala, Bangalore", Keys.ENTER, Keys.TAB);
			
		// Enter from location
				WebElement src = driver.findElement(By.id("src"));
				src.sendKeys("CMBT, Chennai");
				Thread.sleep(1000);
				src.sendKeys(Keys.TAB);

				// Enter to location
				WebElement dest = driver.findElement(By.id("dest"));
				dest.sendKeys("Bengaluru");
				Thread.sleep(1000);
				dest.sendKeys(Keys.TAB);

			
	    //Enter Date
			driver.findElement(By.id("onward_cal")).click();
			
			driver.findElement(By.xpath("//td[@class='next']/button")).click();
			
			//click the date
			driver.findElement(By.xpath("//td[text()='21']")).click();
			
		

			// Click Search Buses
			driver.findElement(By.xpath("//button[@class='fl button']")).click();
			
			
			Thread.sleep(50000);
			
			// Close the popup using X button at the right corner
			driver.findElement(By.xpath("//div[@class='close']/i")).click();

			// Print the number of search result found
			String noOfBus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
			System.out.println("The number of  total search result is :" + noOfBus);
			
			
			//select sleeper only
			
			driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
			
			// Print the number of search result found
			String noOfBus1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
			System.out.println("The number of  sleeper total search result is :" + noOfBus1);
			
			
			
			// Deselect  sleeper only 
			driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
			
			//select Ac bus only
			driver.findElement(By.xpath("//label[@title='AC']")).click();
			
			// Print the number of search result found
			String noOfBus2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
			System.out.println("The number of  AC buse total search result is :" + noOfBus2);
			
			Thread.sleep(50000);
			
			driver.findElement(By.xpath("//div[@class='close-primo']/i")).click();
			
			//select Non-AC 
			driver.findElement(By.xpath("//label[@title='NONAC']")).click();
			
			// Print the number of search result found
						String noOfBus3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
						System.out.println("The number of NonAC and AC buse total search result is :" + noOfBus3);
						
			
		
		driver.close();

		
	}

}
