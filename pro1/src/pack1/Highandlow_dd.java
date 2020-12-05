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

public class Highandlow_dd {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		lby();
	}
		public static Integer lby() {
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
		 WebElement el=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		  Select s=new Select(el); 
		List<WebElement> sm = s.getOptions();
		
	 ArrayList<Integer>sm1=new ArrayList<Integer>();
	 if (sm1 == null || sm1.size() == 0)
	        return Integer.MAX_VALUE;
		for (WebElement value : sm) {
			// System.out.println("values are"+ value.getText());*/
			sm1.addAll((Collection<? extends Integer>) value.getSize());
			Collections.sort(sm1);
			 return sm1.get(0);
			
		}
		for (int e : sm1) {

			System.out.println(e);
		 
		}
		return null;}
}