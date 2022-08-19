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
//WebUI.delay(1)
	
	
//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameCDH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//ACCESSING MENU CREDIT APPROVAL BY DECISION ENGINE
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/img_Welcome, AGUNG BUDI KUNCARA, HEAD OFFIC_8c5647'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/a_Credit Approval with Decision Engine'))
//WebUI.delay(1)
	
	
//INPUT CUSTOMER CREDENTIAL
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'),
	appNumber)
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/input_Value must be Date Format_ucSearchbtnSearch'))
	
	
//APPROVAL PROCESS
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/a_Process'))
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/input_Customer Income_ucCustIncometxtInput'))

WebUI.scrollToElement(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/input_Customer Income_ucCustIncometxtInput'), 2)

WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/input__lb_Form_CalcInstRatio'))
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/select_Select OneApproveRejectRequest'), 2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/select_Select OneApproveRejectRequest'),
	'Approve', false)
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/textarea_Notes_txtNotes'),
	notes)
//WebUI.waitForPageLoad(5)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Division Head/a_Submit'))
WebUI.delay(3)
	
//CLOSING BROWSER
WebUI.closeBrowser()
