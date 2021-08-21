package week2.day2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Link.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Go to home page
		WebElement home =driver.findElement(By.xpath("//a[text() = 'Go to Home Page']"));
		String link1 = home.getAttribute("href");
		home.click();
		System.out.println(link1);
		driver.navigate().back();
		
		//go to without clickme
		System.out.println(driver.findElement(By.xpath("//a[contains (text() , ' to go without clicking me?')]")).getAttribute("href"));
		
		//verify broken link
		WebElement brokenLink = driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']"));
		brokenLink.click();

		 
		String title1 = driver.getTitle();
		if (title1.contains("404"))
			System.out.println("The link is Broken");
		else
			System.out.println("The link is not Broken");
 
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		WebElement home1 = driver.findElement(By.partialLinkText("Go to Home Page"));
		String link2 = home1.getAttribute("href");
		
		if (link1.equals(link2))
			System.out.println("Both the links are same");
		driver.get(link1);
		driver.navigate().back();
		
		List <WebElement> numOfLinks = driver.findElements(By.tagName("a"));
		int sizeOfLink = numOfLinks.size();
		System.out.println("The Total number of links in the page is :" + sizeOfLink);
		
		
	}
}

