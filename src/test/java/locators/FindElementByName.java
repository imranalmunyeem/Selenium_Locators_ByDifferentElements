package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindElementByName extends DriverSetup {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();

		// input email //Locator By Name
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("imran@tester.com");
		Thread.sleep(1000);

		// input password //Locator By Name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);

		driver.close();

	}
}
