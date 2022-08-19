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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins_norm/')


WebUI.setText(findTestObject('Object Repository/FLEET/FInancial Data New/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')
WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/FInancial Data New/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/a_Select'))



WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Fees_lb_Form_CalcFee'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Fees_lbCalculateFees'))
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), 0)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), 
    '13')
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/td_Select OneFlatEffectiveThis field is req_aab00b'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Financial Data_lbCalculateFinancialData'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'), 0)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContComDat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContOtherDat'))


WebUI.closeBrowser()

