package automation;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class App {
    @SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
    	Playwright playwright = null;
    	Browser browser = null;
    	Page page = null;
    	
        try {
               
        	playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));
            page = browser.newPage();
        	  
        	Login objlogin=new Login();
            objlogin.login(page);
            
            Logout objlogout=new Logout();
            objlogout.logout(page);
            
            
        } catch (Exception e) {
        	System.out.println(e);
        }
        finally {
        	       	
        	 page.wait(10);
			 page.close();
			 browser.close();
			 playwright.close();
			 
        }
    }
}
