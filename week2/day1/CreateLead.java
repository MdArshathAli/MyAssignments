package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
     	driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arshath"); 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ali");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arshu"); 
		driver.findElement(By.name("departmentName")).sendKeys("Non-IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To create a lead Page");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arshath722@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.linkText("Logout")).click();
		
	}
}
