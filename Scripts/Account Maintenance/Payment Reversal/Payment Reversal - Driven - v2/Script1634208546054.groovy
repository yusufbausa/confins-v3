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
	
//OPEN BROWSER ========================================================================================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
//WebUI.delay(1)
	
	
//INPUT ADMIN CREDENTIAL ========================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT MENU PAYMENT REVERSAL ========================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/img_Welcome, NOFRIANSYAH, HEAD OFFICE, FINA_fdd7b3'))
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/PAYMENT/Payment Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGCOMMON SETTINGOPERATIONLIFE INSURANCECOLLECTIONREMEDIALINCENTIVE'),
	'80', false)
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Reversal/a_Payment Reversal'))
//WebUI.delay(1)
	
	
//INPUT CUSTOMER CREDENTIAL ========================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Reversal/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNoSearch'), agreeNo)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Reversal/input_Contract Status Expired_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Reversal/input_IDR_gvPaymentReversalctl02imbEdit'))
WebUI.delay(1)
	
	
//PAYMENT REVERSAL PROCESS ========================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Reversal/a_Reverse'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Reversal/input_Reference No_txtRefNo'), refNo)
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Reversal/textarea_Notes_txtNotes'), notes)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Reversal/a_Submit'))
WebUI.delay(3)
	
	
//CLOSE BROWSER ========================================================================================================================================================================================================================================================================
WebUI.closeBrowser()
	
	
