package pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_dd {
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
		
		/*
		 * List<WebElement> month=s1.getOptions(); System.out.println(month.size());
		 * 
		 * for(WebElement m:month) { //System.out.println(m.getText());
		 * if(m.getText().equals("Jun")) { m.click(); String mp=m.getAttribute("value");
		 * System.out.println("value:"+mp); String mp1=m.getText();
		 * System.out.println("text of clicked element:"+mp1); } Thread.sleep(4000);
		 * 
		 * }
		 */
		List<WebElement> sm = s1.getOptions();
		List<String> sm1 = new ArrayList<String>();
		// ArrayList<String>sm1=new ArrayList<String>();
		for (WebElement value : sm) {
			// System.out.println("values are"+ value.getText());*/
			sm1.add(value.getText());
			Collections.sort(sm1);
			
		}
		for (String e : sm1) {

			System.out.println(e);
			//return sortedList.get(sortedList.size() - 1);
			 //return sortedList.get(0);
		}

		/*
		 * //don't copy and paste this code, it's been years since I did java
		 * IIterator<IWebElement> iterator = yourlist.iterator(); IWebElement previous =
		 * iterator.next(); while( iterator.hasNext() ) { IWebElement current =
		 * iterator.next(); if(
		 * prevous.text().toLower().compareTo(current.text().toLower()) < 0 )
		 * Assert.fail("not in alphabetical order"); previous = current; }
		 */
		String[] exp = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		for (WebElement item : options) {
			for (int i = 0; i < exp.length; i++) {
				if (item.getText().equals(exp[i])) {
					System.out.println(exp[i] + "  Matched");
				}
			}}}}

				 
				 

			
		
	
