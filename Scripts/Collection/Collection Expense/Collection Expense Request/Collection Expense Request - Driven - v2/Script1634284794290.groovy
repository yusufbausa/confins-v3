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
WebUI.setText(findTestObject('Login/username'), usernameCollector)

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
//WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_role'))
//WebUI.delay(3)


//select menu collection expense
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/menu_collection_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/menu_collection_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/menu_collection_expense'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/menu_collection_expense'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_menu_collection_expense_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_menu_collection_expense_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_menu_collection_expense_request'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_menu_collection_expense_request'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_action'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_action'))
WebUI.delay(1)


//collection expense request process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_disburse_to'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_disburse_to'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_disburse_to'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_disburse_to'), disburseTo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_collector'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_collector'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_collector'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_collector'), '219', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes'), notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), expenseAmount)
//WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_case_analysis_form'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'))
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), 10)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), '9', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_bank_branch'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_bank_branch'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_bank_branch'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_bank_branch'), bankBranch)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_no'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_no'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_no'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_no'), accountNo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_name'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_name'), accountName)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_description'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_description'), '219', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'))
//WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes_approval'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes_approval'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_submit'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_submit'))
WebUI.delay(5)


//close window
WebUI.closeBrowser()

