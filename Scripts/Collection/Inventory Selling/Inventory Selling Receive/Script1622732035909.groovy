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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'NON1002')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select menu inventory selling receive
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_menu_inventory_selling_receive'))
WebUI.delay(3)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_agreement_number'), 
    '1615900798')
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_edit_data'))
WebUI.delay(3)


//inventory selling receive process
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_receive_from'), 0)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_receive_from'), 
    'Bachtera')
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_reference_no'), 
    '123456789')
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_way_of_payment'), 
    'BANK', false)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/select_bank_account'), 
    '10', false)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_value_date'), 
    '06/03/2021')
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/field_notes'), 
    'notes')
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Receive/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

