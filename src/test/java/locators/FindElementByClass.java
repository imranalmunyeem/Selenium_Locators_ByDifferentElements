package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindElementByClass extends DriverSetup {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();

		// input email //Locator By Class
		WebElement email = driver.findElement(By.className("form-control"));
		email.sendKeys("imran@tester.com");
		Thread.sleep(1000);

		// input password //Locator By Class
		WebElement password = driver.findElement(By.className("form-control"));
		password.sendKeys("12345678");
		Thread.sleep(1000);

		// Login Button //Locator By Class
		WebElement login = driver.findElement(By.className("btn btn-primary btn-block waves-effect waves-light"));
		login.click();
		Thread.sleep(1000);

		driver.close();

	}
}
