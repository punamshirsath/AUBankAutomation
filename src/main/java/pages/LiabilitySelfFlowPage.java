package pages;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonutilities.CommonMethods;
import commonutilities.TestUtil;
import testbase.TestBase;

public class LiabilitySelfFlowPage extends TestBase {

	public LiabilitySelfFlowPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public String sheetName = "NewLeadDetails";
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// object repository
	@FindBy(xpath = "(//a[@class='white side-nav-list__link wt50 mid f16 ht50'])[8]")
	public WebElement leadTab;

	@FindBy(xpath = "//label[text()='New']")
	WebElement newBtn;

	@FindBy(xpath = "//span[text()='Liability']")
	WebElement liabilityFlow;

	@FindBy(xpath = "//div[text()='Liability']")
	public WebElement liabilitytitle;

	@FindBy(xpath = "(//a[@title='Search'])[1]")
	WebElement productcategorysearch;

	@FindBy(xpath = "//div[text()='Saving Account']")
	WebElement productCatergory;

	@FindBy(xpath = "//input[@name='LE_MOBILE']")
	WebElement mobileNo;

	@FindBy(xpath = "//input[@name='cust_100785391']")
	WebElement customerName;

	@FindBy(xpath = "//input[@name='LE_TERRITORY']")
	WebElement branch;

	@FindBy(xpath = "//td[text()='Palanpur_Abu National Highway']")
	WebElement branchName;

	@FindBy(xpath = "//i[@class='icon  icon-acid-calendar']")
	WebElement calender;

	@FindBy(xpath = "//div[@class='days flex flex-wrap pb-8 f12']/div[30]")
	WebElement selectDate;

	@FindBy(xpath = "(//i[@class='icon-acid-timer'])[1]")
	WebElement timeIcon;

	@FindBy(xpath = "//li[text()='12:10 AM']")
	WebElement selectTime;

	@FindBy(xpath = "(//input[@class='textbox field__item'])[11]")
	WebElement expectedBuisness;

	@FindBy(xpath = "//select[@name='cust_3348']")
	WebElement expectedconversion;

	@FindBy(xpath = "(//input[@class='textbox field__item'])[12]")
	WebElement ebrpAmount;

	@FindBy(xpath = "//input[@name='cust_2179']")
	WebElement entityType;

	@FindBy(xpath = "//td[text()='INDIVIDUAL - FULL KYC']")
	WebElement entity;

	@FindBy(xpath = "(//i[@class='icon  icon-acid-calendar'])[3]")
	WebElement calender2;

	@FindBy(xpath = "(//div[text()='29'])")
	WebElement appointmentDate;

	@FindBy(xpath = "(//i[@class='icon-acid-timer'])[2]")
	WebElement timeicon2;

	@FindBy(xpath = "//li[text()='12:10 PM']")
	WebElement appointmentTime;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement dob;

	@FindBy(xpath = "//input[@name='cust_291']")
	WebElement turnover;

	@FindBy(xpath = "//input[@name='cust_908']")
	WebElement currentaddLine1;

	@FindBy(xpath = "//input[@name='cust_909']")
	WebElement currentaddLine2;

	@FindBy(xpath = "//input[@name='cust_910']")
	WebElement currentaddLine3;

	@FindBy(xpath = "(//i[@class='icon icon-acid-search'])[7]")
	WebElement pinSearch;

	@FindBy(xpath = "//div[text()='10051']")
	WebElement pinCode;

	@FindBy(xpath = "//label[@class='checkbox-button checkbox-right']")
	WebElement addressCheckbox;

	@FindBy(xpath = "//span[text()='Save and proceed']")
	WebElement saveAndProceedBtn;

	// Card View
	@FindBy(xpath = "//label[text()='Lead Id']")
	public WebElement leadID;

	@FindBy(xpath = "//a[@title='Toggle to Card View']")
	WebElement toggleView;

	@FindBy(xpath = "//div[@title='click here to see more actions']")
	WebElement bottomBtn;

	@FindBy(xpath = "(//span[text()='Edit'])[2]")
	WebElement editBtn;

	// Document collected
	@FindBy(xpath = "//span[text()='Document Collected']")
	WebElement docCollectedRibbon;

	@FindBy(xpath = "//input[@name='cust_100785441']")
	WebElement phoneExtension;

	@FindBy(xpath = "//td[contains(text(),'India')]")
	WebElement ext;

	@FindBy(xpath = "(//label[@class='checkbox-button checkbox-right'])[1]")
	WebElement pdfVerified;

	@FindBy(xpath = "(//select[@class='selectbox'])[5]")
	WebElement consentFlag;

	@FindBy(xpath = "//select[@name='SALUTATION']")
	WebElement nameSalutation;

	@FindBy(xpath = "//input[@name='cust_1602']")
	WebElement shortN;

	@FindBy(xpath = "//input[@name='cust_369']")
	WebElement panNo;

	@FindBy(xpath = "(//input[@name='qqfile'])[1]")
	// @FindBy(xpath="(//i[@class='icon icon-viewattachment f4'])[1]")
	WebElement attchPan;

	@FindBy(xpath = "//select[@name='cust_53']")
	WebElement gender;

	@FindBy(xpath = "//input[@name='cust_62']")
	WebElement adharNo;

	@FindBy(xpath = "//select[@name='cust_397']")
	WebElement sourcingChannel;

	@FindBy(xpath = "//select[@name='cust_2325']")
	WebElement riskClassification;
	
	@FindBy(xpath="//select[@name='cust_2362']")
	WebElement secondaryHolder;

	@FindBy(xpath = "//select[@name='cust_892']")
	WebElement currentrelationshipwithBank;

	@FindBy(xpath = "//select[@name='cust_496']")
	WebElement physicallyexposed;

	@FindBy(xpath = "//input[@name='cust_267']")
	WebElement customerRelation;

	@FindBy(xpath = "//td[text()='Sole Owner']")
	WebElement soleOwner;

	@FindBy(xpath = "//select[@name='cust_245']")
	WebElement sourceFund;

	@FindBy(xpath = "//select[@name='cust_272']")
	WebElement residentStatus;

	@FindBy(xpath = "//select[@name='cust_2405']")
	WebElement debitcardreqired;

	@FindBy(xpath = "//select[@name='cust_2364']")
	WebElement checkbookRequired;

	@FindBy(xpath = "(//input[@name='qqfile'])[2]")
	WebElement cutomerphotograph;

	@FindBy(xpath = "(//input[@name='qqfile'])[3]")
	WebElement customersignature;

	@FindBy(xpath = "(//input[@name='qqfile'])[4]")
	WebElement accountopeningform;

	@FindBy(xpath = "//select[@name='cust_240']")
	WebElement proofofID;

	@FindBy(xpath = "(//input[@name='qqfile'])[5]")
	WebElement attachmentofID;
	
	@FindBy(xpath="//input[@name='cust_897']")
	WebElement poiDocNo;

	@FindBy(xpath = "//input[@name='cust_1034']")
	WebElement communicationProof;

	@FindBy(xpath = "//td[text()='Voter ID']")
	WebElement voterID;

	@FindBy(xpath = "(//input[@name='qqfile'])[6]")
	WebElement communicationproof;
	
	@FindBy(xpath="//input[@name='cust_1044']")
	WebElement communicationDocNo;

	@FindBy(xpath = "//select[@name='cust_100786081']")
	WebElement permantproof;

	@FindBy(xpath = "//input[@name='cust_100786117']")
	WebElement permantAddNo;

	@FindBy(xpath = "(//input[@name='qqfile'])[7]")
	WebElement permantproofOfDoc;
	
	@FindBy(xpath="//select[@name='cust_1036']")
	WebElement addDocuments;
	
	@FindBy(xpath="//select[@name='cust_58']")
	WebElement maritalStatus;
	
	@FindBy(xpath="//input[@name='cust_919']")
	WebElement motherName;
	
	@FindBy(xpath="//input[@name='cust_220']")
	WebElement fatherName;
	
	@FindBy(xpath="//select[@name='cust_164']")
	WebElement occupation;
	
	@FindBy(xpath="//select[@name='cust_50']")
	WebElement auFinanciers;
	
	@FindBy(xpath="//select[@name='cust_268']")
	WebElement religion;
	
	@FindBy(xpath="//select[@name='cust_751']")
	WebElement category;
	
	@FindBy(xpath="//select[@name='cust_60']")
	WebElement qualification;
	
	@FindBy(xpath="//select[@name='cust_2148']")
	WebElement bloodGrp;
	
	@FindBy(xpath="//select[@name='cust_36']")
	WebElement grossIncome;
	
	@FindBy(xpath="//select[@name='cust_229']")
	WebElement physicallyChallenged;
	
	@FindBy(xpath="//input[@name='cust_370']")
	WebElement placeOfBirth;
	
	@FindBy(xpath="//select[@name='cust_165']")
	WebElement employerType;
	
	@FindBy(xpath="//input[@name='cust_518']")
	WebElement employerName;
	
	@FindBy(xpath="//select[@name='cust_263']")
	WebElement designation;
	
	@FindBy(xpath="(//input[@placeholder='DD-MM-YYYY'])[5]")
	WebElement KycDate;
	
	@FindBy(xpath="//a[@data-autoid='cust_100785403_srch']")
	//@FindBy(xpath="(//a[@class='field__item picker-icon'])[32]")
	WebElement specialidentifier;
	
	@FindBy(xpath="//div[text()='Central Government']")
	WebElement centralgov;
	
	@FindBy(xpath="//input[@name='cust_2587']")
	WebElement lgCode;
	
	@FindBy(xpath="//input[@name='cust_2588']")
	WebElement lcCode;
	
	@FindBy(xpath="//input[@name='cust_2589']")
	WebElement rmCode;
	
	@FindBy(xpath="//select[@name='cust_100786069']")
	WebElement factaReporting;
	
	@FindBy(xpath="//select[@name='cust_100786685']")
	WebElement employement;
	
	@FindBy(xpath="//a[@data-autoid='cust_100786686_srch']")
	WebElement employerType1;
	
	@FindBy(xpath="//div[text()='Central Government']")
	WebElement industry;
	
	@FindBy(xpath="//a[@data-autoid='cust_100786687_srch']")
	WebElement departmentSearch;
	
	@FindBy(xpath="//div[text()='Air Transportation']")
	WebElement department;
	
	@FindBy(xpath="//a[@data-autoid='cust_100786688_srch']")
	WebElement professionsearch;
	
	@FindBy(xpath="//div[text()='Architect']")
	WebElement profession;
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement okBtn;
	
	@FindBy(xpath="(//span[text()='Pending BM Recommendation'])[1]")
	WebElement statuscode1;
	
	
	//Login as Branch Manager
	@FindBy(xpath="")
	WebElement leadsT;
	
	@FindBy(xpath="(//div[@class='action-hover'])[1]")
	WebElement leadThreeDots;
	
	@FindBy(xpath="//select[@name='QueryCategoryId']")
	WebElement dropdown1;
	
	@FindBy(xpath="//select[@name='QueryViewId']")
	WebElement dropdown2;
	
	@FindBy(xpath="(//a[@class='tb button-icon-text f12'])[5]")
	WebElement lead1;
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement editLead;
	
	@FindBy(xpath="//span[text()='BM Recommended']")
	WebElement bmRecommended;
	
	@FindBy(xpath="//span[@data-autoid='LE_STATUSCODE_ctrl']")
	WebElement statuscode2;
	
	@FindBy(xpath="(//a[@name='ProfileImage_header'])[1]")
	public WebElement profileimage;
	
	@FindBy(xpath="//select[@data-autoid='Branch Manager_ctrl']")
	WebElement roledropdown;
	
	@FindBy(xpath="//select[@data-autoid='Back Office_ctrl']")
	WebElement roledropdown1;
	
	@FindBy(xpath="//input[@name='checkbox0']")
	WebElement leadcheckbox;
	
	@FindBy(xpath="//span[text()='Assign to Me']")
	WebElement assignToMeBtn;
	
	@FindBy(xpath="//span[text()='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement okbtn;
	
	@FindBy(xpath="//a[@data-autoid='LeadName_0']")
	WebElement lead;
	
	@FindBy(xpath="//span[text()='Sent to DVU']")
	WebElement sentToDVU;
	
	//DVU stage
	@FindBy(xpath="(//a[@class='white side-nav-list__link wt50 mid f16 ht50'])[6]")
	WebElement dvuLeads;
	
	@FindBy(xpath="//span[text()='Mobile PDF']")
	WebElement mobilePdf;
	
	@FindBy(xpath="//div[@class='warning__message']")
	WebElement warningmsg;
	
	@FindBy(xpath="//span[text()='DVU Verified']")
	WebElement dvuVerified;

	

	public static String panpath = "D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\resources\\Pan card.pdf";
	public static String customerphoto = "D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\resources\\customerphotograph.png";
	public static String customerSign = "D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\resources\\signature.jpg";
	public static String accountform = "D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\resources\\accountopeningform.jpg";
	public static String idProof = "D:\\AU Bank\\AUbank\\AUBankProject\\src\\main\\resources\\voterid.jpg";

	
	public void moveToLiabilityFlow() throws InterruptedException {
		leadTab.click();
		Thread.sleep(1000);
		newBtn.click();
		Thread.sleep(5000);
		liabilityFlow.click();
		Thread.sleep(1000);

	}

	public void fillDataAtNewLeadStage() throws InterruptedException, EncryptedDocumentException, IOException {
		productcategorysearch.click();
		Thread.sleep(1000);
		productCatergory.click();
		// enter mobile no
		String mobilenumber = CommonMethods.generateRandomMobileNumber();
		System.out.println("Actual mobile no: " + mobilenumber);
		System.out.println();
		mobileNo.sendKeys(mobilenumber);
		TestUtil.writeToExcel(sheetName, 1, 0, mobilenumber);
		// Enter Customer Name
		Random random = new Random();
		char c = (char) (random.nextInt(26) + 'a');
		String custname = TestUtil.getCellData(sheetName, "Customer Name", 1);
		String actualcustname = custname + c;
		System.out.println();
		System.out.println("Actual account name Entered:  " + actualcustname);
		System.out.println();
		// enter Customer Name
		customerName.sendKeys(actualcustname);
		TestUtil.writeToExcel(sheetName, 1, 1, actualcustname);
		// Enter Branch
		branch.sendKeys("2143");
		Thread.sleep(2000);
		branchName.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		calender.click();
		Thread.sleep(3000);
		// SimpleDateFormat df = new SimpleDateFormat("DD-MM-YYYY");
		// Date dt = new Date();
		// Calendar cl = Calendar.getInstance();
		// cl.setTime(dt);;
		// cl.add(Calendar.DATE, 2);
		// dt=cl.getTime();
		// String str = df.format(dt);
		// System.out.println("the date today is " + str);

		// WebElement el = driver.findElement(By.xpath("//div[@class='days flex
		// flex-wrap pb-8 f12']/div[30]"));
		// Thread.sleep(3000);
		// el.click();
		selectDate.click();
		Thread.sleep(3000);
		timeIcon.click();
		selectTime.click();

		// Enter expected buisness
		String expectedBuisness1 = TestUtil.getCellData(sheetName, "Expected Buisness", 1);
		expectedBuisness.sendKeys(expectedBuisness1);
		Thread.sleep(3000);
		// Select expected conversion
		CommonMethods.selectByIndex(expectedconversion, 1);
		// Enter EBRP Amount
		String ebrp = TestUtil.getCellData(sheetName, "EBRP Amount", 1);
		ebrpAmount.sendKeys(ebrp);
		// Enter Entity
		entityType.sendKeys("individual");
		entity.click();
		// EnterDOB
		String dateofbirth = TestUtil.getCellData(sheetName, "DOB", 1);
		dob.sendKeys(dateofbirth);
		Thread.sleep(3000);
		// select appointment Date & Time
		js.executeScript("window.scrollBy(0,500)");
		calender2.click();
		appointmentDate.click();
		timeicon2.click();
		appointmentTime.click();
		// Enter turnover
		String turnOver = TestUtil.getCellData(sheetName, "Turnover", 1);
		turnover.sendKeys(turnOver);
		// Enter Address
		String add1 = TestUtil.getCellData(sheetName, "Current address Line1", 1);
		currentaddLine1.sendKeys(add1);
		Thread.sleep(3000);
		String add2 = TestUtil.getCellData(sheetName, "Current address Line2", 1);
		currentaddLine2.sendKeys(add2);
		Thread.sleep(3000);
		String add3 = TestUtil.getCellData(sheetName, "Current address Line3", 1);
		currentaddLine3.sendKeys(add3);
		Thread.sleep(3000);
		// select pincode
		pinSearch.click();
		pinCode.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);

		// click on address same as above
		addressCheckbox.click();
		Thread.sleep(3000);
		// click on Save & Proceed
		saveAndProceedBtn.click();
		Thread.sleep(7000);

	}

	public void editLead() {
		bottomBtn.click();
		editBtn.click();

	}

	public void fillDataAtDocCollectedStage() throws IOException, InterruptedException {
		docCollectedRibbon.click();
		phoneExtension.sendKeys("india");
		ext.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		pdfVerified.click();
		CommonMethods.selectByIndex(consentFlag, 1);
		CommonMethods.selectByIndex(nameSalutation, 2);
		String shortname = TestUtil.getCellData(sheetName, "ShortName", 1);
		shortN.sendKeys(shortname);
		// String panNo1 = TestUtil.getCellData(sheetName, "PAN", 1);
		// panNo.sendKeys(panNo1);
		String panNo1 = CommonMethods.generatePANNumber();
		System.out.println("Actual Pan no: " + panNo1);
		System.out.println();
		js.executeScript("window.scrollBy(0,500)");
		panNo.sendKeys(panNo1);
		Thread.sleep(3000);
		TestUtil.writeToExcel(sheetName, 1, 10, panNo1);
		Thread.sleep(6000);
		Actions action = new Actions(TestBase.driver);
		action.moveToElement(attchPan).click().perform();
		// .CommonMethods.clickelementbyjavascript(attchPan);
		Thread.sleep(5000);
		CommonMethods.fileupload(panpath);
		System.out.println("Pan card uploaded");
		Thread.sleep(5000);
		CommonMethods.selectByIndex(gender, 2);
		Thread.sleep(5000);
		//source channel
		CommonMethods.selectByIndex(sourcingChannel, 4);
		Thread.sleep(2000);
		//risk classification
		CommonMethods.selectByIndex(riskClassification, 2);
		Thread.sleep(2000);
		//secondary holder
		CommonMethods.selectByIndex(secondaryHolder, 2);
		Thread.sleep(2000);
		CommonMethods.selectByIndex(currentrelationshipwithBank, 2);
		Thread.sleep(2000);
		CommonMethods.selectByIndex(physicallyexposed, 3);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		customerRelation.sendKeys("sole owner");
		soleOwner.click();
		// Enter source of fund
		Thread.sleep(2000);
		CommonMethods.selectByIndex(sourceFund, 1);
		// Enter resident Status
		Thread.sleep(2000);
		CommonMethods.selectByIndex(residentStatus, 1);
		Thread.sleep(2000);
		// Select debit card is required
		CommonMethods.selectByIndex(debitcardreqired, 2);
		Thread.sleep(2000);
		// Select check book required
		CommonMethods.selectByIndex(checkbookRequired, 2);
		js.executeScript("window.scrollBy(0,500)");
		// attach customer photograph
		action.moveToElement(cutomerphotograph).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(customerphoto);
		// attach customer sign
		action.moveToElement(customersignature).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(customerSign);
		// attach account opening form
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		action.moveToElement(accountopeningform).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(accountform);
		Thread.sleep(2000);
		// select ID of proof
		CommonMethods.selectByIndex(proofofID, 4);
		action.moveToElement(attachmentofID).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(idProof);
		//enter proof of POI id
		String poiDocNo1 = TestUtil.getCellData(sheetName, "POI Doc No", 1);
		poiDocNo.sendKeys(poiDocNo1);
		js.executeScript("window.scrollBy(0,500)");
		// select voter card
		communicationProof.sendKeys("voter");
		voterID.click();
		action.moveToElement(communicationproof).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(idProof);
		Thread.sleep(2000);
		//communication doc no
		String commDocNo = TestUtil.getCellData(sheetName, "Communication Doc No", 1);
		communicationDocNo.sendKeys(commDocNo);
		// select permant proof
		CommonMethods.selectByIndex(permantproof, 1);
		Thread.sleep(2000);
		//Enter permant proof No
		String addNo = TestUtil.getCellData(sheetName, "Permant Address No", 1);
		permantAddNo.sendKeys(addNo);
		Thread.sleep(5000);
		//attach permant proof document
		action.moveToElement(permantproofOfDoc).click().perform();
		Thread.sleep(5000);
		CommonMethods.fileupload(idProof);
		js.executeScript("window.scrollBy(0,500)");
		//enter additional Document
		CommonMethods.selectByIndex(addDocuments, 2);
		//Marital status
		CommonMethods.selectByIndex(maritalStatus, 1);
		//Enter Mother name
		String motherN = TestUtil.getCellData(sheetName, "Mother Name", 1);
		motherName.sendKeys(motherN);
		//Enter Father Name
		String fatherN = TestUtil.getCellData(sheetName, "Father Name", 1);
		fatherName.sendKeys(fatherN);
		//select occupation
		CommonMethods.selectByIndex(occupation, 2);
		//Enter Au Financiers
		CommonMethods.selectByIndex(auFinanciers, 2);
		//Enter religion
		CommonMethods.selectByIndex(religion, 1);
		//Enter Category
		CommonMethods.selectByIndex(category, 1);
		//Enter Qualification
		CommonMethods.selectByIndex(qualification, 4);
		//blood grp
		CommonMethods.selectByIndex(bloodGrp, 5);
		//Gross income
		CommonMethods.selectByIndex(grossIncome, 4);
		//physically challenged
		CommonMethods.selectByIndex(physicallyChallenged, 2);
		//place of birth
		String placeofb = TestUtil.getCellData(sheetName, "Place Of Birth", 1);
		placeOfBirth.sendKeys(placeofb);
		//employer type
		CommonMethods.selectByIndex(employerType, 2);
		//Enter employer name
		String employer = TestUtil.getCellData(sheetName, "Employer Name", 1);
		employerName.sendKeys(employer);
		//designation
		CommonMethods.selectByIndex(designation, 7);
		//last kyc date
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		String kycDate1 = TestUtil.getCellData(sheetName, "Last KYC Date", 1);
		KycDate.sendKeys(kycDate1);
		Thread.sleep(3000);
		//special identifier
		specialidentifier.click();
		Thread.sleep(5000);
		centralgov.click();
		System.out.println("selected special identifier");
		//enter LG, LC, RM code
		String lg = TestUtil.getCellData(sheetName, "LG Code", 1);
		lgCode.sendKeys(lg);
		String lc = TestUtil.getCellData(sheetName, "LC Code", 1);
		lcCode.sendKeys(lc);
		String rm = TestUtil.getCellData(sheetName, "RM Code", 1);
		rmCode.sendKeys(rm);
		//Facta Reporting
		js.executeScript("window.scrollBy(0,500)");
		CommonMethods.selectByIndex(factaReporting, 2);
		//select employer type
		CommonMethods.selectByIndex(employement, 6);
		Thread.sleep(3000);
		//employer/industry
		employerType1.click();
		Thread.sleep(3000);
		industry.click();
		Thread.sleep(3000);
		//department
		departmentSearch.click();
		Thread.sleep(3000);
		department.click();
		Thread.sleep(3000);
		//profession
		professionsearch.click();
		Thread.sleep(3000);
		profession.click();
		Thread.sleep(3000);
		saveAndProceedBtn.click();
		okBtn.click();
		Thread.sleep(5000);
		String statusCode=statuscode1.getText();
		Assert.assertEquals("Pending BM Recommendation", statusCode,"statuscode mismatch");
		Thread.sleep(2000);
		TestUtil.takeScreenShot("Lead Creation");
	}
	
	public void editLeadAtBMStage() throws InterruptedException, IOException {
		//Click on lead
		leadsT.click();
		js.executeScript("window.scrollBy(0,1000)");
		//leadThreeDots.click();
		//Search lead in bucket
		CommonMethods.selectByIndex(dropdown1, 2);
		CommonMethods.selectByIndex(dropdown2, 12);
		//click on lead
		lead1.click();
		CommonMethods.scrollAtBottom();
		editLead.click();
		Thread.sleep(4000);
		bmRecommended.click();
		CommonMethods.scrollAtBottom();
		saveAndProceedBtn.click();
		String statusCode2=statuscode2.getText();
		Assert.assertEquals("DDE", statusCode2,"statuscode mismatch");
		Thread.sleep(2000);
		TestUtil.takeScreenShot("DDE Status code");
		
	}
	
	public void editLeadAtBOStage() throws InterruptedException, IOException {
		Thread.sleep(4000);
		profileimage.click();
		CommonMethods.selectByIndex(roledropdown, 1);
		Thread.sleep(5000);
		//click on lead
		leadsT.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		CommonMethods.selectByIndex(dropdown1, 2);
		CommonMethods.selectByIndex(dropdown2, 1);
		Thread.sleep(3000);
		leadcheckbox.click();
		js.executeScript("window.scrollBy(0,1000)");
		//click on assign to me
		assignToMeBtn.click();
		updateBtn.click();
		okbtn.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		CommonMethods.selectByIndex(dropdown1, 2);
		CommonMethods.selectByIndex(dropdown2, 12);
		Thread.sleep(4000);
		lead.click();
		Thread.sleep(4000);
		CommonMethods.scrollAtBottom();
		editLead.click();
		Thread.sleep(4000);
		sentToDVU.click();
		CommonMethods.scrollAtBottom();
		saveAndProceedBtn.click();
		String statusCode3=statuscode2.getText();
		Assert.assertEquals("Sent to DVU", statusCode3,"statuscode mismatch");
		Thread.sleep(2000);
		TestUtil.takeScreenShot("Sent to DVU Status code");
		
	}
	
	public void editLeadAtDVUStage() throws InterruptedException, IOException {
		Thread.sleep(4000);
		profileimage.click();
		CommonMethods.selectByIndex(roledropdown1, 8);
		Thread.sleep(5000);
		dvuLeads.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		CommonMethods.selectByIndex(dropdown1, 2);
		CommonMethods.selectByIndex(dropdown2, 0);
		Thread.sleep(3000);
		leadcheckbox.click();
		js.executeScript("window.scrollBy(0,1000)");
		//click on assign to me
		assignToMeBtn.click();
		updateBtn.click();
		okbtn.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		CommonMethods.selectByIndex(dropdown1, 2);
		CommonMethods.selectByIndex(dropdown2, 12);
		Thread.sleep(4000);
		lead.click();
		Thread.sleep(4000);
		//Thread.sleep(4000);
		CommonMethods.scrollAtBottom();
		mobilePdf.click();
		warningmsg.click();
		okbtn.click();
		Thread.sleep(3000);
		CommonMethods.scrollAtBottom();
		editLead.click();
		Thread.sleep(4000);
		dvuVerified.click();
		CommonMethods.scrollAtBottom();
		saveAndProceedBtn.click();
		Thread.sleep(3000);
		String statusCode4=statuscode2.getText();
		Assert.assertEquals("Account Opened", statusCode4,"statuscode mismatch");
		Thread.sleep(2000);
		TestUtil.takeScreenShot("Sucessful liability flow");
		
		
	}
}
