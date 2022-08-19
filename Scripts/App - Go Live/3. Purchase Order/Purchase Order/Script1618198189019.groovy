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
WebUI.delay(2)


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setEncryptedText(findTestObject('Login/password'), '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT PROFILE
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//ACCESSING MENU PURCHASE ORDER
WebUI.click(findTestObject('Object Repository/Purchase Order/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Purchase Order Agreement'))
WebUI.delay(5)


//INPUTING CUSTOMER CREDENTIAL
WebUI.setText(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'), '0037APP20210300430')
WebUI.click(findTestObject('Object Repository/Purchase Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(2)


//PURCHASE ORDER PROCESS
WebUI.click(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'),
	2)
WebUI.click(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Save'))
WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'), '0037APP20210300338')
//WebUI.click(findTestObject('Object Repository/Purchase Order/input_Task Claim By_ucSearchbtnSearch'))
//WebUI.click(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
//WebUI.click(findTestObject('Object Repository/Purchase Order/a_Next'))
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Submit'))


//CLOSING BROWSER
WebUI.closeBrowser()

