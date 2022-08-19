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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_role'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_role'))
WebUI.delay(1)


//select menu collection expense reversal
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/menu_collection_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/menu_collection_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/menu_collection_expense'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/menu_collection_expense'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu_collection_expense_reversal'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu_collection_expense_reversal'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu_collection_expense_reversal'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_menu_collection_expense_reversal'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_action'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_action'))
WebUI.delay(1)


//collection expense reversal process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_reason_description'))
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_reason_description'), 10)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/select_reason_description'), '217', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_submit'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Reversal/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

