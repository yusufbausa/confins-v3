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

WebUI.setText(findTestObject('Object Repository/FLEET/Financial Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')
WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/Financial Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/a_Select'))


//ADDING FINANCIAL DATA=========================================================================================================================================================
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContLifeInsur'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Fees_lbCalculateFees'))
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'), 0)
WebUI.setText(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'), '13')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Financial Data_lbCalculateFinancialData'))
WebUI.delay(3)
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContFindat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContComdat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContOtherdat'))
WebUI.delay(3)


//CLOSE BROWSER=========================================================================================================================================================
WebUI.closeBrowser()

