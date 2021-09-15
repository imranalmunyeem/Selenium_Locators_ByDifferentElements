package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindElementByCSSSelectors extends DriverSetup {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();

		// input email //Locator By CSS Selector
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("salman.auvi@gmail.com");
		Thread.sleep(1000);

		// input password //Locator By CSS Selector
		WebElement password = driver.findElement(By.cssSelector(
				"<input id=\"password\" type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\">"));
		password.sendKeys("12345678");
		Thread.sleep(1000);

		// Login Button //Locator By CSS Selector
		WebElement login = driver.findElement(By.cssSelector(
				"body > div.accountbg > div > div > div > div > div > div > div > div > form > div.form-group.text-center.row.m-t-20 > div > button"));
		login.click();
		Thread.sleep(1000);

		driver.close();

	}
}
