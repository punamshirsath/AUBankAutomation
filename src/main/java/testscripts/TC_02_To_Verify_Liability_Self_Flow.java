package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonutilities.CommonMethods;
import commonutilities.CustomListener;
import pages.AULoginPage;
import pages.LiabilitySelfFlowPage;
import testbase.TestBase;
@Listeners(CustomListener.class)
public class TC_02_To_Verify_Liability_Self_Flow extends TestBase{

	public TC_02_To_Verify_Liability_Self_Flow() {
		super();
	}
	AULoginPage au;
	LiabilitySelfFlowPage lp;

	@Test
	public void Verify_Liability_Self_Flow() throws Exception {
		au=new AULoginPage();
		lp=new LiabilitySelfFlowPage();
		//login as CSE User
		au.Login("punam@gmail.com", "Pass@123");
		lp.moveToLiabilityFlow();
		lp.fillDataAtNewLeadStage();
		lp.leadID.isDisplayed();
		lp.editLead();
		lp.fillDataAtDocCollectedStage();
		au.Logout();
		//login as Branch Manager
		au.Login("punam@gmail.com", "Pass@123");
		lp.editLeadAtBMStage();
		au.Logout();
		//login as back office
		au.Login("punam@gmail.com", "Pass@123");
		lp.editLeadAtBOStage();
		au.Logout();
		au.Login("punam@gmail.com", "Pass@123");
		lp.editLeadAtDVUStage();

	}

}
