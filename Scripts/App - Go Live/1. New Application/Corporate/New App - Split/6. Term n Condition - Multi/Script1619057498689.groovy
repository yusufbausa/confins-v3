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

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/a_Select'))


WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_No_gvTermConditionctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_No_gvTermConditionctl09cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_Yes_gvTermConditionctl10cbChecked'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Multi/input_-_lb_Form_Save'))


WebUI.closeBrowser()

