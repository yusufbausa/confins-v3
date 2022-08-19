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
WebUI.setText(findTestObject('Login/username'), usernameCollector)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_role'))
WebUI.delay(3)


//select menu remedial expense request
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/menu_remedial_expense'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu_remedial_expense_request'))
WebUI.delay(3)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_agreement_number'), 
    agreeNo)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_coll_bucket'),
	'3', false)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_action'))
WebUI.delay(3)


//remedial expense request process
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_disburse_to'), 
    disburseTo)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason'), 
    '238', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes'), 
    notes)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), 
    expenseAmount)
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), 
    0)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), 
    '9', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_bank_branch'), 
    bankBranch)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_no'), 
    accountNo)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_name'), 
    accountName)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason_description'), 
    '237', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'), 
    approvedBy, false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes_approval'), 
    approvalNotes)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

