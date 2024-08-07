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



WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Address/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')


WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Select'))



WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))


WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '1', true)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/textarea_Address_UCAddresstxtOfficeAddr'), 'Jalan Gatot Subroto')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRT'), '001')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRW'), '002')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_Zip Code_UCAddressucLookupZipCodeuclZ_bb3e6e'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_Kelurahan_UCAddressucLookupZipCodeucl_96dda2'), 
    '%pancoran%')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Select (1)'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), 0)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), '021')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhn1'), '0812345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhoneExt1'), '678')
WebUI.scrollToElement(findTestObject('Corporate Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(3)


WebUI.closeBrowser()

