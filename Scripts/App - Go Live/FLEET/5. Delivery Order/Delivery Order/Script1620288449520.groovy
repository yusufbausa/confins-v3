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
WebUI.setText(findTestObject('Login/username'), 'REP1529')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'))
WebUI.delay(3)


//SELECT MENU DELIVERY ORDER================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Delivery Order'))
WebUI.delay(3)


//INPUT CUST CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '0021APP20210300040')
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_a3d666'))
WebUI.delay(3)


//DELIVERY ORDER PROCESS================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_FATHONI ERLAMBANG_gvAssetListctl02ibDelOrd'), 0)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_FATHONI ERLAMBANG_gvAssetListctl02ibDelOrd'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), 0)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), '3')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 'M')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_COLOR_rptAssetAttrctl04txtAttrName'), 'Black')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 0)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 'notes')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter No._txt_84528a'), 
    '01/01/2021')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), 
    '01/01/2021')
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'),
	Keys.chord(Keys.TAB))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 0)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl04cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl06cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl07cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl08cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl09cbChecked'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), '123456789')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), '123456789')
WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Delivery Order/a_Save'), 2)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Save'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Delivery Order/a_Next'), 2)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Next'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Delivery Order/a_Submit'), 2)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

