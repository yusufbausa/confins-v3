import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'DMN1556')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'))
WebUI.delay(3)


//select menu borrow request
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 
    '121', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/span_Receive_rtPlus'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Request'))
WebUI.delay(2)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    '2110903367')
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Main Document Status_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_On Hand_gvAssetListctl02imbBrw'))
WebUI.delay(3)


//borrow request process
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_BORROW_gvDocListctl01cbAll'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Borrower NameBorrower Company_txtBorr_045804'), 
    'PT Maju Kedepan')
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), 
    '01/05/2021')
WebUI.scrollToElement(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), 
    '325', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'), 
    '304957', false)
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/textarea_Notes_ucApprovaltxtNotes'), 'Request')
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

