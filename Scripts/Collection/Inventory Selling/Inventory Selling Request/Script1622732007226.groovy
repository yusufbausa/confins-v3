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
WebUI.setText(findTestObject('Login/username'), 'BES0097')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(2)


//select menu inventory selling request
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'), 
    '402', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'))
WebUI.delay(2)


//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'), 
    '1915858857')
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'))
WebUI.delay(3)


//inventory selling request process
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidder_name'), 0)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidder_name'), 
    'santoso')
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidd_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidd_amount'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidd_amount'), 
    '100000000')
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidd_date'), 
    '06/03/2021')
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_bidd_date'),
	Keys.chord(Keys.ENTER))
WebUI.delay(3)
//WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_auction_fee'))

WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_auction_fee'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_auction_fee'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_auction_fee'), 
    '5000000')
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_net_selling_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_net_selling_amount'),
Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_net_selling_amount'), 
    '105000000')
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/radio_check_winner'))
//WebUI.acceptAlert()
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_calculate'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()