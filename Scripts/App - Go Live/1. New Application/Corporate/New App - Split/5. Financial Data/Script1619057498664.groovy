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

WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_-_lb_Form_SaveContFinData'))


WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_Percentage_rblProvisionType'))

WebUI.sendKeys(findTestObject('1. New Application (NEW)/Financial Data/input_Provision Amount_ucINProvisionFeeAmttxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Financial Data/input_Provision Amount_ucINProvisionFeeAmttxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Financial Data/input_Provision Amount_ucINProvisionFeeAmttxtInput'), 
    '50000000')
WebUI.delay(1)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_Fees_lb_Form_CalcFee'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_Fees_lbCalculateFees'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_Financial Data_lbCalculateFinancialData'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_-_lb_Form_SaveContFinData'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_-_lb_Form_SaveContComData'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Financial Data/input_-_lb_Form_SaveContOtherData'))
WebUI.delay(5)

WebUI.closeBrowser()

