package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for mens");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String text = driver.findElement(By.xpath("//span[text()='1,700']")).getText();
		System.out.println(text);
	}

}
