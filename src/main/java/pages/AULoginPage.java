package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class AULoginPage extends TestBase {

	public AULoginPage(){
		PageFactory.initElements(driver, this);
	}

	//Object Repository
	@FindBy(xpath="//div[@class='login-logo']")
	WebElement auLogo;

	@FindBy(xpath="//input[@id='TxtName']")
	WebElement aUUserName;

	@FindBy(xpath= "//input[@id='TxtPassword']")
	WebElement aUPassword;

	@FindBy(xpath= "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath= "//a[@id='trouble-login']")
	WebElement troubleloginLink;

	@FindBy(xpath= "//a[@id='forgot-pass']")
	WebElement forgotloginLink;
	
	@FindBy(xpath="(//a[@name='ProfileImage_header'])[1]")
	public WebElement profileimage;
	
	@FindBy(xpath="//a[@data-autoid='Logout_link']")
	WebElement logoutbtn;


	public void Login(String uname, String pwd) throws Exception {
		aUUserName.sendKeys(uname);
		aUPassword.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(2000);

	}
	
	public void Logout() {

		profileimage.click();
		logoutbtn.click();

	}




}
