package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	
	public void verifyDropdown()
	{
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown1);
		//select.selectByIndex(2);
		//select.selectByValue("java");
		select.selectByVisibleText("JAVA");
		
		
	}
	public void checkBox()
	{
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		
	}
	public void radioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio1=driver.findElement(By.xpath("//input[@value='green']"));
		radio1.click();
		System.out.println(radio1.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown dropdown=new HandlingDropdown();
		dropdown.intializeBrowser();
		//dropdown.verifyDropdown();
		//dropdown.checkBox();
		dropdown.radioButton();
	}

}
