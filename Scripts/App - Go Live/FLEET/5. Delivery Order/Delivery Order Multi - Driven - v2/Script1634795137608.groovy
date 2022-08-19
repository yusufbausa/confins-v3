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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
//WebUI.delay(1)
	
	
//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), usernameDO)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'))
//WebUI.delay(1)
	
	
//SELECT MENU DELIVERY ORDER================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Delivery Order'))
//WebUI.delay(1)
	
	
//INPUT CUST CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'),
	appNo)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_a3d666'))
WebUI.delay(1)
	
	
//DELIVERY ORDER 1 PROCESS================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_FATHONI ERLAMBANG_gvAssetListctl02ibDelOrd'), 10)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_FATHONI ERLAMBANG_gvAssetListctl02ibDelOrd'))

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), 10)

WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), '3')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 'M')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_COLOR_rptAssetAttrctl04txtAttrName'), 'Black')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 10)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 'notes')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter No._txt_84528a'), date)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), date)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), Keys.chord(Keys.TAB))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 10)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl09cbChecked'))
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), docNo)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), docNo)
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Save'))
WebUI.delay(5)
	
	
//DELIVERY ORDER 2 PROCESS================================================================================================================================================================
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_FATHONI ERLAMBANG_gvAssetListctl02ibDelOrd2'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), 10)

WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_CYLINDER_rptAssetAttrctl02txtAttrName'), '3')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), 'M')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_COLOR_rptAssetAttrctl04txtAttrName'), 'Black')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 10)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/textarea_Notes_txtNote'), 'notes')
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter No._txt_84528a'), date)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), date)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Delivery Order/input_Temporary Registration Letter Date_uc_ce763e'), Keys.chord(Keys.TAB))

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'), 10)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl09cbChecked'))
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_No_gvAssetDocctl02txtDocNo'), docNo)
WebUI.setText(findTestObject('Object Repository/FLEET/Delivery Order/input_Yes_gvAssetDocctl03txtDocNo'), docNo)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Save'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Next'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Submit'))
WebUI.delay(3)
	
	
//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()
