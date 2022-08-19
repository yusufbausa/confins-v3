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


//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'NKU1249')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(2)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/a_Select'))
WebUI.delay(3)


//SELECT MENU GO LIVE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Go Live/img_Welcome, NATASHA KUSNADI, FLEET JAKARTA_d68adc'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Go Live/a_Go Live'))
WebUI.delay(3)


//INPUT CUST CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), '0021APP20210300053')
WebUI.click(findTestObject('Object Repository/FLEET/Go Live/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Go Live/input_FLEET BUSINESS VEHICLE NONPAKET_gvGoL_22a002'))
WebUI.delay(3)


//GO LIVE PROCESS================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Go Live/textarea_Notes_txtNotes'), 'Go Live')
WebUI.click(findTestObject('Object Repository/FLEET/Go Live/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

