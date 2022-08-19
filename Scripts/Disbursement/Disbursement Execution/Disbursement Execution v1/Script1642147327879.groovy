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
WebUI.setText(findTestObject('Login/username'), usernameFH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select menu disbursement execution
WebUI.click(findTestObject('Disbursement/DIsbursement Execution/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Execution/select_menu_disbursement'), 'DISBURSEMENT', false)
WebUI.click(findTestObject('Disbursement/DIsbursement Execution/menu_disbursement_execution'))
WebUI.delay(1)
	
	
//input cust credential
WebUI.waitForElementPresent(findTestObject('Disbursement/DIsbursement Execution/selelct_ap_type_name'), 30)
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Execution/selelct_ap_type_name'), apTypeName, false)
WebUI.setText(findTestObject('Disbursement/DIsbursement Execution/field_ap_destination'), apDestination)
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Execution/select_bank_name'), bankName, false)
WebUI.delay(1)
	
WebUI.click(findTestObject('Disbursement/DIsbursement Execution/btn_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Disbursement/DIsbursement Execution/btn_action_approve'), 30)
WebUI.click(findTestObject('Disbursement/DIsbursement Execution/btn_action_approve'))
WebUI.delay(1)
	
	
//disbursement execution process
WebUI.setText(findTestObject('Disbursement/DIsbursement Execution/field_recipient_name'), recipientName)
WebUI.setText(findTestObject('Disbursement/DIsbursement Execution/field_notes'), notes)
WebUI.delay(1)

WebUI.click(findTestObject('Disbursement/DIsbursement Execution/btn_disburse'))
WebUI.delay(5)
	
	
//close browser
WebUI.closeBrowser()
	
	
