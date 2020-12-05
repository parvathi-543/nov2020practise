package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("destination_publishing_iframe_spicejet_0_name");
		Thread.sleep(4000);
		////www.googletagmanager.com/ns.html?id=GTM-NS5W5Z
		
		/*
		 * driver.switchTo().frame("_hjRemoteVarsFrame"); Thread.sleep(4000);
		 */
		
		WebElement obj=driver.findElement(By.xpath("//div[@id='dropdownGroup1']//select[contains(@id,'ctl00_mainContent_ddl_originStation1')]"));
		obj.sendKeys("DED");
		/*
		 * Select s=new Select(obj); s.selectByVisibleText("DED");
		 */
	}
}
