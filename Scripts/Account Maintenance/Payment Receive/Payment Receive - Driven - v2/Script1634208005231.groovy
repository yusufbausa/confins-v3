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


//SELECT MENU PAYMENT RECEIVE (CASHIER TRANSACTION) ========================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/img_Welcome, NOFRIANSYAH, HEAD OFFICE, FINA_fdd7b3'))
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/PAYMENT/Payment Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGCOMMON SETTINGOPERATIONLIFE INSURANCECOLLECTIONREMEDIALINCENTIVE'),
	'80', false)
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/a_Cashier Transactions'))
//WebUI.delay(1)


//INPUT TRANSACTION & PAYMENT INFO ==============================================================================================================================================================================
WebUI.selectOptionByValue(findTestObject('Object Repository/PAYMENT/Payment Receive/select_Select OneBankCashPickup'), 'BANK', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/PAYMENT/Payment Receive/select_Select One013-(JF) BP9081-IDR-070185_4af542'), '9', false)
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Receive From  Disburse To_txtReceiveFrom'), receiveDisburse)
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Receive/textarea_Notes_txtNotes'), 'notes')
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Reference No_txtReferenceNo'), refNo)
WebUI.sendKeys(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Amount_ucReceiveAmttxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Amount_ucReceiveAmttxtInput'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Amount_ucReceiveAmttxtInput'), amount)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/a_Payment Single'))
WebUI.delay(1)


//INPUT CUSTOMER CREDENTIAL ==============================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/PAYMENT/Payment Receive/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_96f6b8'), agreeNo)
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/input_License Plate No_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/input_TOYOTA INNOVA 2.0 BENSIN TG 40 E AT_g_21b928'))

WebUI.click(findTestObject('Object Repository/PAYMENT/Payment Receive/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER ==============================================================================================================================================================================
WebUI.closeBrowser()

