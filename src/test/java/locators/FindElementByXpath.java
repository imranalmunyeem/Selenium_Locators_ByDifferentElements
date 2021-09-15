package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindElementByXpath extends DriverSetup {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();

		// input email //Locators by Xpath
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("imran@tester.com");
		Thread.sleep(1000);

		// input password //Locators by Xpath
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("12345678");
		Thread.sleep(1000);

		// Login Button //Locators by Xpath
		WebElement login = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(1000);

		driver.close();

	}
}
