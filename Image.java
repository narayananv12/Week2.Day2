package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Image.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 1.Click on this image to go home page
		driver.findElement(By.xpath("//img[contains (@src, '/home.png')]")).click();
		driver.navigate().back();

		// 2.Am I Broken Image?
		WebElement brokenImg = driver.findElement(By.xpath("//img[contains(@src , 'abcd.jpg')]"));
		String image = brokenImg.getAttribute("naturalWidth");
		System.out.println(image);
		if(image.equals("0"))
			System.out.println(" The image is broken");
	
	
		
	}

}
