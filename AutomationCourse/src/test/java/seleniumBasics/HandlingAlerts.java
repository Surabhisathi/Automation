package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base
{
	public void simpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click1=driver.findElement(By.id("alertButton"));
		click1.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click3=driver.findElement(By.id("confirmButton"));
		click3.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click4=driver.findElement(By.id("promtButton"));
		click4.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Surabhi");
		al.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts alert=new HandlingAlerts();
		alert.intializeBrowser();
		//alert.simpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
		
	}

}
