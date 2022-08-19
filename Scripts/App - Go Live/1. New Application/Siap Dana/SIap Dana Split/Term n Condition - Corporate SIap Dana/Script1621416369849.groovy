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

WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0752')

WebUI.setEncryptedText(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')


WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl04cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl05cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl08cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl09cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_Yes_gvTermConditionctl10cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl11cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl12cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl13cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_No_gvTermConditionctl14cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition Corporate Siap Dana/input_-_lb_Form_Save'))
WebUI.delay(1)


WebUI.closeBrowser()

