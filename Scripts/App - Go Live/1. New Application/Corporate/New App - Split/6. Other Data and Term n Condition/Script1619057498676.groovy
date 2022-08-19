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


WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/select_Select OneYesNo'), 
    'No', true)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/select_Select OneYesNo_1'), 
    'No', true)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/select_Select OneYesNo_1_2'), 
    'No', true)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/select_Select OneYesNo_1_2_3'), 
    'No', true)
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_-_lb_Form_Save'))


WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl04cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl05cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_No_gvTermConditionctl08cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_No_gvTermConditionctl09cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_Yes_gvTermConditionctl10cbChecked'))
WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/input_-_lb_Form_SaveTerm'))


WebUI.click(findTestObject('1. New Application (NEW)/Other Data and Term n Condition/span_Submit'))

WebUI.closeBrowser()

