package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

		static WebDriver driver;
		public static void main(String[] args) {
			String projectpath = System.getProperty("user.dir");
			// System.setProperty("webdriver.chrome.driver",
			// projectpath+"//Drivers//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("parv");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jad");
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("9623457670");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dykmcja");
			List<WebElement> ep=driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("size of radio buttons  "+ep.size());
			for(WebElement e:ep) {
				System.out.println(e.getCssValue("name")+" "+e.getAttribute("value")+"  "+e.getTagName());
				System.out.println(e);
			}
			
	}

}
