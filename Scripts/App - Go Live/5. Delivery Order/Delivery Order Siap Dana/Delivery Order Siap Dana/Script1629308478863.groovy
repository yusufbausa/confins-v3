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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), 'MST1760')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('Delivery Order/select_role'), 20)
WebUI.click(findTestObject('Delivery Order/select_role'))
WebUI.delay(1)


//select menu delivery order
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/button_menu'), 20)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/btn_menu_delivery_orderr'), 20)
WebUI.click(findTestObject('Delivery Order Siap Dana/btn_menu_delivery_orderr'))
WebUI.delay(1)



//input cust credential (app number)
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/field_app_number'), 20)
WebUI.setText(findTestObject('Delivery Order Siap Dana/field_app_number'), 
    '0037APP20210800193')
WebUI.click(findTestObject('Delivery Order Siap Dana/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/button_entry'), 20)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_entry'))
WebUI.delay(3)


//delivery order process
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/button_entry_do'), 20)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_entry_do'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Delivery Order Siap Dana/field_asset_tax_date'), 20)
WebUI.scrollToElement(findTestObject('Delivery Order Siap Dana/check_form_a'), 0)
WebUI.setText(findTestObject('Delivery Order Siap Dana/field_asset_tax_date'), 
    '10/10/2021')
WebUI.sendKeys(findTestObject('Delivery Order Siap Dana/field_asset_tax_date'), 
    Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.setText(findTestObject('Delivery Order Siap Dana/field_notes'), 'notes')
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_bpkb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Delivery Order Siap Dana/doc_no_bpkb'), '123456789')
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_faktur'))
WebUI.delay(1)
WebUI.setText(findTestObject('Delivery Order Siap Dana/doc_no_faktur'), '123456789')
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_nik'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_kwitansi_blanko'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_kir'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_fc_ktp_an_bpkb'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_fc_stnk'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/check_form_a'))
WebUI.delay(1)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_save'))
WebUI.delay(3)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_next'))
WebUI.delay(3)
WebUI.click(findTestObject('Delivery Order Siap Dana/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

