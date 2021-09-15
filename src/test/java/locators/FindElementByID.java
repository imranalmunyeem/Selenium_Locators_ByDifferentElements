package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindElementByID extends DriverSetup {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();

		// input email //Locator by ID
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("imran@tester.com");
		Thread.sleep(1000);

		// input password //Locator by ID
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);

		driver.close();

	}
}
