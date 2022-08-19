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
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameInv)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 10)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(1)


//select menu inventory selling request
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/select_menu_inventory_asset_management'), '402', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/menu_inventory_selling'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_menu_inventory_selling_request'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request/button_edit_data'))
WebUI.delay(1)


//inventory selling request process (below bidd amount)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'))
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), 10)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidder_name'), bidderName)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_amount'), biddAmount)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'))
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), date)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_bidd_date'), Keys.chord(Keys.ENTER))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_auction_fee'), auctionFee)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'))
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'), Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_net_selling_amount'),  netSelling)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/check_winner'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/check_winner'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/check_winner'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/check_winner'))
//WebUI.delay(1)
//WebUI.acceptAlert()
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_calculate'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_calculate'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'))
WebUI.scrollToElement(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_reason_description'), '464', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_approved_by'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/select_approved_by'), 'TWA0223', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/field_notes'), 'notes')
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_submit'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Request for Approval/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()