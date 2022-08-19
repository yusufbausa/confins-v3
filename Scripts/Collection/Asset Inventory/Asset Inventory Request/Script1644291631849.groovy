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
WebUI.setText(findTestObject('Login/username'), usernameAR)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select role
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role_asset_inv'))
//WebUI.delay(1)
	
	
//select menu asset inventory request
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/select_menu_collection'), 'COLLECTION', false)
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/expand_menu_repossess'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/btn_menu_asset_inv_req'))
WebUI.delay(40)
	
	
//input cust credential (agree no)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/field_agreement_number'),
	agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/btn_execute'))
WebUI.delay(1)
	
	
//asset inventory request process
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/select_reason'),
	'555', false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/select_approved_by'),
	approvedBy2, false)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/field_notes'), notes)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Request/btn_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()