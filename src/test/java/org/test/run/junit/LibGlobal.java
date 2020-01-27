package org.test.run.junit;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LibGlobal {
	public static WebDriver driver;
	public static Actions acc;
	public static Select s;
	public static TakesScreenshot tk;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert al;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\AdactinProject\\ChromeServer\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void loadUrl(String url) {
		driver.get(url);
    }
	public static void type(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void btnClick(WebElement element) {
		element.click();

	}
	public static void quitBrowser() {
		driver.quit();

	}
	public static  void closeBrowser() {
		driver.close();

	}
    public static void Title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	   public static void dropDownByVisibleText(WebElement e,String text) {
					s=new Select(e);
					s.selectByVisibleText(text);
	  }

	 public static void screenshotUserLoc(String loc) throws IOException {
		 tk=(TakesScreenshot)driver;
	     File s = tk.getScreenshotAs(OutputType.FILE);
	     File d=new File(loc);
	     FileUtils.copyFile(s, d);
	   }

		 public static String getAttribute(WebElement e) {
			String att = e.getAttribute("value");
			return att;

				}
}
