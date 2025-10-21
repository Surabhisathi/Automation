package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Surabhi");
		WebElement messagebutton= driver.findElement(By.xpath(" //button[@id=\"button-one\"]"));
		System.out.println(messagebutton.isDisplayed());
		System.out.println(messagebutton.isEnabled());
		messagebutton.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(message.getText());
		WebElement gettotalbutton=driver.findElement(By.id("button-two"));
		System.out.println(gettotalbutton.getTagName());
		System.out.println(messagebutton.getCssValue("background-color"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands=new WebElementCommands();
		commands.intializeBrowser();
		commands.verifyCommands();
		
	}

}
