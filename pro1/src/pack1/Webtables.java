package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		int rowcount=rows.size();
		System.out.println(rowcount);
		List<WebElement>cols=driver.findElements(By.xpath("//table/thead/tr/th"));
		int colscount=cols.size();
		System.out.println(colscount);
		for(int i=0;i<rows.size();i++) {
			List<WebElement>col=driver.findElements(By.xpath("//table/thead/tr/th["+ i +"]"));
			String coltext=col.get(i).getText();
			System.out.println(coltext);
		}
		/*
		 * WebElement obj=driver.findElement(By.xpath(
		 * "//div[@id='dropdownGroup1']//select[contains(@id,'ctl00_mainContent_ddl_originStation1')]"
		 * )); obj.sendKeys("DED");
		 */
	}
}
