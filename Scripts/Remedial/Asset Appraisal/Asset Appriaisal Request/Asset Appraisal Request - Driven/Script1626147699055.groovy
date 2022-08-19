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
WebUI.setText(findTestObject('Login/username'), usernameInv)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role (Jakarta Central Inventory)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 20)
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(1)


//select menu confirm asset to pool
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'), 20)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'), 20)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Asset to Pool/select_menu_inventory_management'), 
    '402', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'), 20)
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'),
	agreeNo)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search'))
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'))
WebUI.delay(1)


//asset apraisal request process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_market_price'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_market_price'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/select_asset_name'), 20)
//WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/select_asset_name'), 
//    '2484', false)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_asset'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_select_asset'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_select_asset'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_deduction'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_deduction'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_deduction_item'), 20)
WebUI.setText(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_deduction_item'), 
    '%')
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_deduction_item'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_select_deduction'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_select_deduction'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_min_selling_amount'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_min_selling_amount'), 0)
WebUI.sendKeys(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_min_selling_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_min_selling_amount'),
	Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_min_selling_amount'), 
    minSelling)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/select_reason_description'), 
    '461', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/select_approved_by'), 
    approvedBy, false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/field_notes'), 
    notes)
WebUI.scrollToElement(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_search_market_price'), 0)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_calculate'))
WebUI.delay(2)
WebUI.click(findTestObject('REMEDIAL/Asset Appraisal/Asset Appraisal Request/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()
