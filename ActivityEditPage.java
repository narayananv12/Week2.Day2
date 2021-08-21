package week2.day2;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActivityEditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Edit.html");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshmi@gmail.com");
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.clear();
		append.sendKeys("LakshmiNarayanan", Keys.TAB);
		String text =  driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement disbaledtext = driver.findElement(By.xpath("//input[@disabled ='true']"));
		System.out.println(disbaledtext.isEnabled());  
		
	
		
		
	 
	    		
	    
	    
	
	
		
		
	
		
		
		
		
	}

}
