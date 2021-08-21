package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/checkbox.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[2]" )).click();		

	}

}
