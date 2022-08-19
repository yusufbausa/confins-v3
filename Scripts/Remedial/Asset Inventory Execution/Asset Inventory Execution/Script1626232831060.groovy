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


//select menu remedial repossession
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 
    '303', false)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/menu_repossession'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Inventory Execution/button_menu_asset_inv_execution'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Inventory Execution/button_menu_asset_inv_execution'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Inventory Execution/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Asset Inventory Execution/field_agreement_number'), 
    '1718800484')
WebUI.click(findTestObject('REMEDIAL/Asset Inventory Execution/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Inventory Execution/button_execute'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Inventory Execution/button_execute'))
WebUI.delay(1)


//asset inventory execution process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Asset Inventory Execution/button_submit'), 20)
WebUI.click(findTestObject('REMEDIAL/Asset Inventory Execution/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()
