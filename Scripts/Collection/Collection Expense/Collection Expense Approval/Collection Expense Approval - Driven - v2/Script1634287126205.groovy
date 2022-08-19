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
WebUI.setText(findTestObject('Login/username'), usernameAR)

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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_role'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_role'))
WebUI.delay(1)


//select menu collection expense approval
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_menu_collection'), 
    '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/menu_collection_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/menu_collection_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/menu_collection_expense'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/menu_collection_expense'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu_collection_expense_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu_collection_expense_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu_collection_expense_approval'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu_collection_expense_approval'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_process'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_process'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_process'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_process'))
WebUI.delay(1)


//collection expense approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'))
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 10)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_submit'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

