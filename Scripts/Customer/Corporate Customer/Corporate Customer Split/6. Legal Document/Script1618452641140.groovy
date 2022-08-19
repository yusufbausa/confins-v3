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

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/a_Select'))




WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP'), 
    'AKTA', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Please select one_gvLegalDocumentctl0_b3d8b7'), 
    '12345678987')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'), 
    '01/01/2006')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'),
	Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'), 
    '01/01/2050')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'), 
    Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input_-_lb_Form_SaveCont_LegalDocument'))

