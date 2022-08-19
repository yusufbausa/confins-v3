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
WebUI.setText(findTestObject('Login/username'), usernameINV)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select role
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(1)
	
	
//select menu inventory selling request
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'),	'402', false)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'))
WebUI.delay(1)
	
	
//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_search'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'))
WebUI.delay(1)
	
	
//inventory selling request process (below bidd amount)
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), 0)

WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), bidderName)
WebUI.delay(1)

WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), biddAmount)
WebUI.delay(1)

WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), date)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), Keys.chord(Keys.ENTER))
WebUI.delay(1)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'),	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'),	auctionFee)
WebUI.delay(1)

WebUI.doubleClick(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), netSelling)
WebUI.delay(1)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/check_winner'))
WebUI.delay(1)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_calculate'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), 0)

WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), '464', false)
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_approved_by'), approvedBy, false)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_notes'), 'notes')

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_submit'))
WebUI.delay(5)
	
	
//close browser
WebUI.closeBrowser()
