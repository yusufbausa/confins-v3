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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://confins-qa.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'MST1760')

WebUI.setEncryptedText(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/a_Select'))

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/a_Delivery Order'))

WebUI.setText(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '0037APP20211000148')

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_Task Claim By_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_MULTIGUNA NON PAKET_gvAgrmntctl02ibDelOrd'))

WebUI.click(findTestObject('Delivery Order/DO Multi Additional/button_edit_asset_2'))

WebUI.setText(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_CYLINDER_rptAssetAttrctl02txtAttrName'), 
    '4')

WebUI.setText(findTestObject('Page_New Confins 1 - Main/input_TRANSMITION_rptAssetAttrctl03txtAttrName'), '3')

WebUI.setText(findTestObject('Object Repository/Delivery Order/DO Multi Additional/input_COLOR_rptAssetAttrctl04txtAttrName'), 
    'black')

WebUI.closeBrowser()

