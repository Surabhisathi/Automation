package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	public void verifyRightClick()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.contextClick(others).build().perform();
	}
	public void verifyMouseHover()
	{
		WebElement other=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.moveToElement(other).build().perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions=new HandlingActions();
		actions.intializeBrowser();
		//actions.verifyRightClick();
		actions.verifyMouseHover();
	}

}
