package automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Login {
	@Test
	public void login(Page page){
		
		/*  Playwright playwright = null;
		  Browser browser = null;
		  page = null; 
		  playwright = Playwright.create();
		  browser = playwright.chromium().launch(new
		  BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100)); 
		  page = browser.newPage(); */
		 
    page.navigate("https://opensource-demo.orangehrmlive.com");
    System.out.println("Title - "+page.title());    
    assertEquals("OrangHRM",page.title());
    page.locator("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input").fill("Admin");
    page.locator("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input").fill("admin123");
    page.locator("//button").click();
    //System.out.println( assertEquals("abc","bc"));
   

}

}