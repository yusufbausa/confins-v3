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
WebUI.setText(findTestObject('Login/username'), usernameDO)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)

//ACCESSING MENU DELIVERY ORDER
WebUI.click(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Delivery Order'))
WebUI.delay(3)


//INPUT CUSTOMER CREDENTIAL
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    appNumber)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)


//DELIVERY ORDER PROCESS
WebUI.click(findTestObject('Object Repository/Delivery Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02ibDelOrd'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Olaf One_gvAssetListctl02ibDelOrd'))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 0)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 'A')
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_COLOR_rptAssetAttrctl04txtAttrName'), 'BLACK')
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), '01/01/2021')
WebUI.sendKeys(findTestObject('Object Repository/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), Keys.chord(
        Keys.ENTER))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 0)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02cbChecked'))
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), 2)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), '123456789')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'))
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), 2)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), '123456789')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl04cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl06cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl07cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl08cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl09cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Save'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Submit'))


//CLOSING BROWSER
WebUI.closeBrowser()

