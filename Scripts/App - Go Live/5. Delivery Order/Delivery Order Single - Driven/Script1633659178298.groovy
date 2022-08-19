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


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameDO)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('Delivery Order/select_role'), 20)
WebUI.click(findTestObject('Delivery Order/select_role'))
WebUI.delay(1)


//ACCESSING MENU DELIVERY ORDER
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'), 
    20)
WebUI.click(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/a_Delivery Order'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Delivery Order'))
WebUI.delay(1)


//INPUT CUSTOMER CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    20)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    appNumber)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)


//DELIVERY ORDER PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02ibDelOrd'), 
    20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02ibDelOrd'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_Olaf One_gvAssetListctl02ibDelOrd'), 
    20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Olaf One_gvAssetListctl02ibDelOrd'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 
    20)
WebUI.scrollToElement(findTestObject('Object Repository/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 
    0)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), '4')
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 'A')
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_COLOR_rptAssetAttrctl04txtAttrName'), 'BLACK')
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), '01/01/2021')
WebUI.sendKeys(findTestObject('Object Repository/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), Keys.chord(
        Keys.ENTER))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 0)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), 2)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), '123456789')
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), 2)
WebUI.setText(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), '123456789')
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl04cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl04cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl06cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl06cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl07cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl07cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl08cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl08cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl09cbChecked'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/input_No_gvAssetDocctl09cbChecked'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/a_Save'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Save'))
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/a_Next'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Next'))
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/a_Submit'), 20)
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Submit'))
WebUI.delay(3)


//CLOSING BROWSER
WebUI.closeBrowser()

