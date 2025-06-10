package automation;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class Logout {

	public void logout(Page page) throws InterruptedException{
		
		/* Playwright playwright = null; Browser browser = null; Page page = null;
		 playwright = Playwright.create(); browser = playwright.chromium().launch(new
		 BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100)); page =
		// browser.newPage();
		 /* page.navigate("https://opensource-demo.orangehrmlive.com");
		 * System.out.println("Title - "+page.title()); page.locator(
		 * "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"
		 * ).fill("Admin"); page.locator(
		 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"
		 * ).fill("admin123"); page.locator("//button").click();
		 */
		
    page.locator("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i").click();
    page.locator("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a").click();   

       
}
	
	}