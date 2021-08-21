package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Button.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		
		driver.navigate().back();
		
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//Find button color
		WebElement color = driver.findElement(By.id("color"));
		String colorname = color.getAttribute("style");
		System.out.println("Background color is :" + colorname);
		
		//Find the height and width
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
		
	
		
		

		
	}

}
