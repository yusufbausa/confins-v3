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

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer/Emergency Contact/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select'))

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_-_lb_Form_SaveCont_Job'))

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), 'Michael Sumacher')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'FATHER', true)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 
    '081234567890')

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    'Jalan Gatot Subroto')

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), '001')

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), '002')

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 
    '%pancoran%')

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))

WebUI.closeBrowser()

