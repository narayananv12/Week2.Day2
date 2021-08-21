package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dropdown {
	
	public static void main(String[] args) {
		
		// Importing the driver files
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				// Launching the webpage
				driver.get("http://www.leafground.com/pages/Dropdown.html");
				driver.manage().window().maximize();

				// 1.Select training program using Index
				WebElement drpdown1 = driver.findElement(By.id("dropdown1"));
				Select drpdown1Select = new Select(drpdown1);
				drpdown1Select.selectByIndex(1);

				// 2.Select training program using Text
				WebElement drpdown2 = driver.findElement(By.name("dropdown2"));
				Select drpdown2Select = new Select(drpdown2);
				drpdown2Select.selectByVisibleText("Appium");

				// 3.Select training program using Value
				WebElement drpdown3 = driver.findElement(By.id("dropdown3"));
				Select drpdown3Select = new Select(drpdown3);
				drpdown3Select.selectByValue("3");

				// 4.Get the number of dropdown options
				WebElement drpdown4 = driver.findElement(By.xpath("//select[ @class = 'dropdown']"));
				Select drpdown4Select = new Select(drpdown4);
				drpdown4Select.selectByIndex(3);
				int size = drpdown4Select.getOptions().size();
				System.out.println("The size of the listbox is :" + size);

				// 5.You can also use sendKeys to select
				driver.findElement(By.xpath("(//section[ @class = 'innerblock']//select)[5]")).sendKeys("Loadrunner");

				// 6.Select multiple programs
				WebElement listBox6 = driver.findElement(By.xpath("(//section[ @class = 'innerblock']//select)[6]"));
				Select listBox6Select = new Select(listBox6);
				listBox6Select.selectByValue("1");
				listBox6Select.selectByValue("2");
				listBox6Select.selectByValue("3");

			}

		
	}

		
	
	
	