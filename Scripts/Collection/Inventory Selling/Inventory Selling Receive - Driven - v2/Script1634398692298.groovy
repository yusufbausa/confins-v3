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


//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), usernameFH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select menu inventory selling receive
//WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu'), 20)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu'))
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_menu_collection'), 20)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_menu_collection'), 
    '270', false)
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu_inventory_selling_receive'), 20)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu_inventory_selling_receive'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_agreement_number'), 20)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_agreement_number'),  agreeNo)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_edit_data'), 20)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_edit_data'))
WebUI.delay(1)


//inventory selling receive process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_receive_from'), 20)
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_receive_from'), 0)

WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_receive_from'),  receiveFrom)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_reference_no'),  refNo)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_way_of_payment'), 'BANK', false)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_bank_account'), '10', false)
WebUI.delay(1)

WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_value_date'), date)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_notes'), notes)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

