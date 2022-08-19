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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
	
	
//input credential
WebUI.setText(findTestObject('Login/username'), usernameSDH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select_role
//WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/select_role'))
//WebUI.delay(1)
	
	
//select_menu_WO NA Approval
//WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/button_menu'))
//WebUI.delay(1)
//	//WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/select_menu_account_maintenance'), '80', false)
//WebUI.delay(1)
//	//WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/button_menu_write_off_approval'))
//WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/PAYMENT/Write Off/Write Off no NA Approval/New Folder/a_Write Off Approval'))
	
	
//input cust credential
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/button_search'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/button_process'))
WebUI.delay(1)
	
	
//WO NA approval process
WebUI.scrollToElement(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/select_action'), 10)
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/select_action'), 'Approve', false)
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/field_notes'), notes)
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Approval/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()