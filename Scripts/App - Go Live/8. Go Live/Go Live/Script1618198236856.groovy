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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), 'SUG0793')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT PROFILE
WebUI.click(findTestObject('Object Repository/Document Checklist/a_Select'))
WebUI.delay(3)


//ACCESS MENU GO LIVE
WebUI.click(findTestObject('Object Repository/Go Live/img_Welcome, SUGIHARTINI, TANGERANG, Servic_90353b'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Go Live/a_Go Live'))
WebUI.delay(2)


//INPUT CUSTOMER APP NUMBER
WebUI.setText(findTestObject('Object Repository/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), '0037APP20210300430')
WebUI.click(findTestObject('Object Repository/Go Live/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(2)


//GO LIVE PROCESS
WebUI.click(findTestObject('Object Repository/Go Live/input_MULTIGUNA NON PAKET_gvGoLivectl02ibGoLive'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Go Live/textarea_Notes_txtNotes'), 'Congratulation')
WebUI.click(findTestObject('Object Repository/Go Live/a_Submit'))


//CLOSING BROWSER
WebUI.closeBrowser()

