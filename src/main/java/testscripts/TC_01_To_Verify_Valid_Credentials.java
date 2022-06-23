package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonutilities.TestUtil;
import pages.AULoginPage;
import testbase.TestBase;

public class TC_01_To_Verify_Valid_Credentials extends TestBase {

	public TC_01_To_Verify_Valid_Credentials() {
		super();

	}

	AULoginPage au;
	@Test
	public void To_verify_Valid_Credentials() throws Exception {
		au=new AULoginPage();
		au.Login("punam@gmail.com", "Pass@123");
		Assert.assertEquals(TestBase.driver.getCurrentUrl(), "https://crmdev.aubankuat.in/sn7/app/CRMNextObject/Home/Summary");
		TestUtil.takeScreenShot("login");
	}

}
