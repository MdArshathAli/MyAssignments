package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arshath");
		driver.findElement(By.name("lastname")).sendKeys("Ali");
		driver.findElement(By.name("reg_email__")).sendKeys("arshath***@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		WebElement birthday= driver.findElement(By.name("birthday_day"));
		Select day= new Select(birthday);
		day.selectByValue("7");
		
		
		WebElement birthMonth= driver.findElement(By.name("birthday_month"));
        Select month= new Select(birthMonth);
		month.selectByVisibleText("Jan");
		
		WebElement birthYear= driver.findElement(By.name("birthday_year"));
        Select year= new Select(birthYear);
		year.selectByIndex(27);
		driver.findElement(By.xpath("//label[text()='Male']")).click();

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
