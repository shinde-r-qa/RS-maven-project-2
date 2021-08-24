package mavenproject2scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns {

	@Test
	public void dropdown() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement e= driver.findElement(By.xpath("//select[@name='coffee']"));
		Select dd=new  Select(e);// create object for your drop down
		dd.selectByIndex(2);//sugar option has index of 2 in drop down 
		Thread.sleep(3000);
		//you can also select by text or value in drop down. 
		dd.selectByVisibleText("With cream & sugar");
		Thread.sleep(3000);
		dd.selectByValue("crisp");
		Thread.sleep(3000);
		//when you execute, above 3 options will be selected in order
		
		//search box where values in drop down keep changing is a dynamic drop down..use get options method to get all values
		List<WebElement> l= dd.getOptions();
		//print all values
		System.out.println(l);
		int count = l.size();// will give count of values in drop down
		System.out.println(count);		

	}

}
