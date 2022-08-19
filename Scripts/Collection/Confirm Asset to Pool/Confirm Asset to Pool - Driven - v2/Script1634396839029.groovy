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
WebUI.setText(findTestObject('Login/username'), usernameINV)

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


//select menu confirm asset to pool
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'), '402', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/menu_pool_management'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/menu_pool_management'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/menu_pool_management'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/menu_pool_management'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/expand_menu_send_asset_to_pool'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/expand_menu_send_asset_to_pool'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/expand_menu_send_asset_to_pool'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/expand_menu_send_asset_to_pool'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu_confirm_asset'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu_confirm_asset'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu_confirm_asset'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu_confirm_asset'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Confirm Asset to Pool/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_edit_data'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_edit_data'))
WebUI.delay(1)


//confirm asset process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_by'))
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_by'), 10)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_by'), receiveBy)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_date'))
WebUI.setText(findTestObject('COLLECTION/Confirm Asset to Pool/field_receive_date'), date)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Confirm Asset to Pool/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_submit'))
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

