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
WebUI.setText(findTestObject('Login/username'), usernameRAH1)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select role remedial area 1
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'))
//WebUI.delay(1)
	
	
//select menu remedial expense approval
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_menu_remedial'),
	'REMEDIAL', false)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense_approval'))
WebUI.delay(1)
	
	
//input cust credential
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_agreement_no'),
	agreeNo)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_process'))
WebUI.delay(1)
	
	
//remedial expense approval process
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_action'),
	'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_notes'),
	notes)
WebUI.delay(1)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_submit'))
WebUI.delay(10)
	
	
//close browser
WebUI.closeBrowser()
	
	
