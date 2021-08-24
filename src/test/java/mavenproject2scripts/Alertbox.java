package mavenproject2scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//scenario, dont enter username or password on rediff sign in page and click log in. Alert box with error will show. capture it
public class Alertbox {

	@Test
	public void messagecheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi	");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//will give alert box
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();// go from webpage to alert box. import Alert class here
				//cannot locate elemenets on alert box
				String errortext= a.getText();// will get error text from alert box
				System.out.println(errortext);
		        a.accept();// will clock ok on alert box
		        //a.dismiss();// will click cancel button on alert box
		        //driver.close();
		        
				
		
		

	}

}
