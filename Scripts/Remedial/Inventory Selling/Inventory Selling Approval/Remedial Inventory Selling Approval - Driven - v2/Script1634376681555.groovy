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


//===============================================================================================================================================================================
//COLLECTION INVENTORY SELLING APPROVAL
//===============================================================================================================================================================================



//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameARH)

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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'))
WebUI.delay(1)


//select menu inventory selling approval
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/things_ToDo_inv_selling_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/things_ToDo_inv_selling_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/things_ToDo_inv_selling_approval'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/things_ToDo_inv_selling_approval'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_process'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_process'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_process'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_process'))
WebUI.delay(1)


//inventory selling approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/select_action'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_submit'))
WebUI.click(findTestObject('COLLECTION/Inventory Selling/Inventory Selling Approval/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

