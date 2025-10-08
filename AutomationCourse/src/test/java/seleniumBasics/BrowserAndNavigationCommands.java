package seleniumBasics;

public class BrowserAndNavigationCommands extends Base{
	public void browserCommands()
	{
		 String title= driver.getTitle();
		 System.out.println(title);
		 String source=driver.getPageSource();
		 System.out.println(source);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands command =new BrowserAndNavigationCommands();
		command.intializeBrowser();
		command.browserCommands();
		
	}

}
