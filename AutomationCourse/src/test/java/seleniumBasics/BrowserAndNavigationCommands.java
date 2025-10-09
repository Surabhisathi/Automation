package seleniumBasics;

public class BrowserAndNavigationCommands extends Base{
	public void browserCommands()
	{
		 String title= driver.getTitle();
		 System.out.println(title);
		 String source=driver.getPageSource();
		 // System.out.println(source);
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 String handleid=driver.getWindowHandle();
		 System.out.println(handleid);
		 }
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_1tmvcmz30t_e&adgrpid=1329311168025487&hvadid=83082214468070&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149223&hvtargid=kwd-83082829756950:loc-90&hydadcr=5650_2377261&mcid=6233a7c588f136ff9af0c63d9f6745bc");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands command =new BrowserAndNavigationCommands();
		command.intializeBrowser();
		//command.browserCommands();
		command.navigationCommand();
		
	}

}
