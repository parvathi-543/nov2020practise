package pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Only_duplicates_DD {

		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("Sagio Mane");
		 * list.add("Karius"); list.add("Mo Salah"); list.add("Firmino");
		 * list.add("Lovren"); list.add("Steven Gerrard"); list.add("Karius");
		 * list.add("Mo Salah");
		 * 
		 * Set<String> s = new HashSet<String>();
		 * 
		 * for(String name : list) { if(s.add(name) == false) System.out.println(name +
		 * "is duplicated"); }
		 */
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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
		HashSet<String>hs=new HashSet<>();
		
		  for(WebElement name : ol) {
		        if(hs.add(name.getText()) == false) {
		            System.out.println(name + "is duplicated");
		    }	
		}	}}	
		
		
		

