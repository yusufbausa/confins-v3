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


WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/a_Select'))

WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP'), 
    'L_AKTA', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Please select one_gvLegalDocumentctl0_b3d8b7'), 
    '987654321')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_concat(Only Number, Alphabet and , , _71437c'), 
    '10/10/2006')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input__gvLegalDocumentctl02ucDPLegalDocDocE_378404'), 
    '10/10/2030')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Value must be Date Format_gvLegalDocu_acc4f3'))


WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/a_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP_1'), 
    'SIUP', true)

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Please select one_gvLegalDocumentctl0_7d5fe7'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_concat(Only Number, Alphabet and , , _38136b'), 
    '10/10/2006')

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input__gvLegalDocumentctl03ucDPLegalDocDocE_1febdd'), 
    '10/10/2035')

WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Value must be Date Format_gvLegalDocu_e91e2b'))

WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_-_lb_Form_SaveCont_LegalDocument'))

WebUI.closeBrowser()

