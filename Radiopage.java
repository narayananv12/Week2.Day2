package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiopage {
	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/radio.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				//1.Are you enjoying the classes?
				driver.findElement(By.id("yes")).click();
				
				//2.Find default selected radio button
				 System.out.println(driver.findElement(By.xpath("//label[@for='Checked']/input")).isSelected());
				
						
				//3.Select your age group (Only if choice wasn't selected)
				int myage = 30;
				if (myage < 20) {
					driver.findElement(By.xpath("//label[contains (text(),'Select your age')]/following-sibling::input[@value = '0']")).click();
					System.out.println("My age group is 1-20 years");
				}
				else if (myage > 40) {
					driver.findElement(By.xpath("//label[contains (text(),'Select your age')]/following-sibling::input[@value = '2']")).click();
					System.out.println("My age group is above 40 years");
				}
				else
					System.out.println("My age group is 21-40 years");
			
		}

	

		
	}


