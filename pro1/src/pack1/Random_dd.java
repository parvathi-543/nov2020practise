package pack1;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Random_dd {
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
		/*
		 * WebElement el=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 * Select s=new Select(el); List<WebElement> day=s.getOptions(); for(WebElement
		 * dy:day) { System.out.println(dy.getText()); }
		 */
		WebElement el1 = driver.findElement(By.xpath("//select[@name='birthday_month' and @title='Month']"));
		Select s1 = new Select(el1);
		List<WebElement>ol=s1.getOptions();	
		 int iCnt = ol.size();
		 //Using Random class to generate random values
		 Random num = new Random();
		 int iSelect = num.nextInt(iCnt);
		 //Selecting value from DropDownList
		 s1.selectByIndex(iSelect);
		 //Selected Value
		 System.out.println(el1.getAttribute("value"));
				 }
	}


