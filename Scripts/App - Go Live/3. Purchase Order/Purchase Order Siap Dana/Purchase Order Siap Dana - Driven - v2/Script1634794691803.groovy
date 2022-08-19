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
	
//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)
	
	
//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernamePO)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//select menu purchase order agreement
WebUI.click(findTestObject('Purchase Order Siap Dana/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('Purchase Order Siap Dana/btn_menu_purchase_order'))
//WebUI.delay(1)
	
	
//input cust credential (app number)
WebUI.setText(findTestObject('Purchase Order Siap Dana/field_app_number'), appNo)	
WebUI.click(findTestObject('Purchase Order Siap Dana/button_search'))
WebUI.click(findTestObject('Purchase Order Siap Dana/button_action'))
WebUI.delay(1)
	
	
//purchase order process
WebUI.click(findTestObject('Purchase Order Siap Dana/button_entry'))
WebUI.delay(1)
WebUI.setText(findTestObject('Purchase Order Siap Dana/field_notes'), 'notes')
WebUI.setText(findTestObject('Purchase Order Siap Dana/field_go_live_plan_date'), goLivePlanDate)
WebUI.sendKeys(findTestObject('Purchase Order Siap Dana/field_go_live_plan_date'), Keys.chord(Keys.ENTER))
//WebUI.delay(1)
WebUI.click(findTestObject('Purchase Order Siap Dana/button_calculate'))
WebUI.delay(5)
WebUI.click(findTestObject('Purchase Order Siap Dana/btn_print _ET_doc_customer'))
WebUI.delay(15)
WebUI.click(findTestObject('Purchase Order Siap Dana/btn_print_ET_doc_company'))
WebUI.delay(15)
WebUI.click(findTestObject('Purchase Order Siap Dana/button_save'))
WebUI.delay(1)
WebUI.click(findTestObject('Purchase Order Siap Dana/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()

