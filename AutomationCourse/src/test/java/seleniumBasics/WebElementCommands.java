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
		messagebutton.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands=new WebElementCommands();
		commands.intializeBrowser();
		commands.verifyCommands();
		
	}

}
