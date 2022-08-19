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
WebUI.setText(findTestObject('Login/username'), 'PAB0656')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu send asset to pool
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_menu'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_menu_inventory_asset_management'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_menu_inventory_asset_management'), 
    '402', false)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/expand_menu_send_asset_to_pool'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/expand_menu_send_asset_to_pool'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_menu_send_asset_to_pool'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_menu_send_asset_to_pool'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_collection_group'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_collection_group'), 
    '31', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/field_agreement_number'), 
    '1911034694')
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_search'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_send'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_send'))
WebUI.delay(1)


//send asset to pool process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_pool'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_pool'), 0)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/select_pool'), 
    '37', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/field_send_by'), 'Sender Name')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/field_send_date'), 
    '06/03/2021')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/field_notes'), 'notes')
WebUI.click(findTestObject('REMEDIAL/Asset to Pool/Send Asset to Pool/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

