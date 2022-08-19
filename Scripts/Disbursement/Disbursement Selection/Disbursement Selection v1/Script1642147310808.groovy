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
	
//select menu disbursement selection
WebUI.click(findTestObject('Disbursement/DIsbursement Selection/btn_menu'))
WebUI.selectOptionByValue(findTestObject('Disbursement/DIsbursement Selection/select_menu_disbursement'), '83', false)
WebUI.click(findTestObject('Disbursement/DIsbursement Selection/menu_disbursement_selection'))
WebUI.delay(1)
	
//input cust credential
WebUI.waitForElementPresent(findTestObject('Disbursement/DIsbursement Selection/select_AP_type_name'), 30)
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Selection/select_AP_type_name'), apTypeName, false)
WebUI.setText(findTestObject('Disbursement/DIsbursement Selection/field_AP_due_date'), date)
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Selection/select_bank_name'), bankName, false)
WebUI.setText(findTestObject('Disbursement/DIsbursement Selection/field_AP_destination'), apDestination)
WebUI.delay(1)
	
WebUI.click(findTestObject('Disbursement/DIsbursement Selection/btn_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Disbursement/DIsbursement Selection/check_selected_data'), 30)
WebUI.click(findTestObject('Disbursement/DIsbursement Selection/check_selected_data'))
WebUI.click(findTestObject('Disbursement/DIsbursement Selection/btn_add_to_temp'))
WebUI.delay(1)

WebUI.click(findTestObject('Disbursement/DIsbursement Selection/btn_next'))
WebUI.delay(1)
	
//disbursement selection process
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Selection/select_wop'), wop, false)
WebUI.selectOptionByLabel(findTestObject('Disbursement/DIsbursement Selection/select_bank_account'), bankAccount, false)
WebUI.delay(1)

WebUI.click(findTestObject('Disbursement/DIsbursement Selection/btn_request_for_approval'))
//WebUI.acceptAlert()
WebUI.delay(6)
	
	
//close browser
WebUI.closeBrowser()
	
	
