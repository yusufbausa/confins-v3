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

//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL====================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameDO)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE====================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Delivery Order/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Delivery Order/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('Delivery Order/select_role'))
WebUI.click(findTestObject('Delivery Order/select_role'))
WebUI.delay(1)


//ACCESSING MENU DELIVERY ORDER====================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.click(findTestObject('Object Repository/Delivery Order/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Delivery Order/a_Delivery Order'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Delivery Order/a_Delivery Order'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Delivery Order/a_Delivery Order'))
WebUI.click(findTestObject('Object Repository/Delivery Order/a_Delivery Order'))
WebUI.delay(1)


WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_app_number'), 
    '0037APP20211000151')

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_search'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_entry_do'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_entry_do_asset_1'))

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_transmission'), 
    'AT')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_color'), 'Black')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_temp_reg_letter_date'), 
    '01/01/2021')

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_bpkb'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_faktur'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_nik'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_kwitansi_blanko'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_kir'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_fc_ktp_an_bpkb'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_fc_stnk'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_form_a'))

WebUI.setText(findTestObject('Delivery Order/Multi Asset/doc_no_bpkb'), '123456789')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/doc_no_faktur'), '123456789')

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_save'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_entry_do_asset_2'))

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_cylinder'), 
    '3')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_transmission'), 
    'AT')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_color'), 'Black')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/field_temp_reg_letter_date'), 
    '01/01/2021')

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_bpkb'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_faktur'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_nik'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_kwitansi_blanko'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_kir'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_fc_ktp_an_bpkb'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_fc_stnk'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/check_form_a'))

WebUI.setText(findTestObject('Delivery Order/Multi Asset/doc_no_bpkb'), '123456789')

WebUI.setText(findTestObject('Delivery Order/Multi Asset/doc_no_faktur'), '123456789')

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_save'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_next'))

WebUI.click(findTestObject('Delivery Order/Multi Asset/button_submit'))

WebUI.closeBrowser()

