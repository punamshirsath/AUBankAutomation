package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commonutilities.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();

		FileInputStream ip;
		try {
			ip = new FileInputStream("D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\java\\configfiles\\confiq.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	@BeforeClass
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\crmnext\\chromedriver_win32\\chromedriver.exe");
			driver = (WebDriver) new ChromeDriver();
		} else if (browserName.equals("FireFox")) {

			driver = (WebDriver) new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}


	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
