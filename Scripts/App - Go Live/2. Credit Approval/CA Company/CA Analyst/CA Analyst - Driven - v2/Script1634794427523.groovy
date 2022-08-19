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
WebUI.setText(findTestObject('Login/username'), usernameCR)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select role	
WebUI.click(findTestObject('Credit Review/Credit Review Company/select_role'))
//WebUI.delay(1)
	
	
//select menu credit approval	
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/btn_menu_credit_approval'))
//WebUI.delay(1)
	
	
//input cust credential	
WebUI.setText(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_app_number'), appNo)	
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_search'))
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_process'))
WebUI.delay(1)
	
	
//credit approval analyst process	
WebUI.selectOptionByValue(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/select_action'), 'Approve', false)
WebUI.setText(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_notes'), notes)
WebUI.delay(1)
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()
	
