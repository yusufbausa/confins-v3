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
WebUI.delay(1)


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setEncryptedText(findTestObject('Login/password'), '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT PROFILE
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//ACCESSING MENU DOCUMENT SIGNER
WebUI.click(findTestObject('Object Repository/Document Signer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Document Signer/a_Document Signer'))
WebUI.delay(3)


//INPUT CUSTOMER CREDENTIAL
WebUI.setText(findTestObject('Object Repository/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '0037APP20210300430')
WebUI.click(findTestObject('Object Repository/Document Signer/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(3)


//DOCUMENT SIGNER PROCESS
WebUI.click(findTestObject('Object Repository/Document Signer/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), '%')
WebUI.click(findTestObject('Object Repository/Document Signer/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Document Signer/a_Select (1)'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Document Signer/a_Submit'))
WebUI.delay(5)


//CLOSING BROWSER
WebUI.closeBrowser()

