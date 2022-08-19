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
WebUI.setText(findTestObject('Login/username'), 'AJK1196')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_role'))
WebUI.delay(3)


//select menu collection expense
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/menu_collection_expense'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_menu_collection_expense_request'))
WebUI.delay(3)


//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_agreement_number'), 
    '1903100310')
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_action'))
WebUI.delay(3)


//collection expense request process 
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_disburse_to'), 
    'Aji Kurniawan')
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_collector'), 
    '219', false)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes'), 
    'notes')
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_expense_amount'), 
    '1000000')
//WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_case_analysis_form'))
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), 0)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_bank_name'), 
    '9', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_bank_branch'), 
    'Senayan')
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_no'), 
    '123456789')
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_account_name'), 
    'Aji Kurniawan')
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_reason_description'), 
    '219', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/select_approved_by'), 
    '304798', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/field_notes_approval'), 
    'notes')
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Request/button_submit'))
WebUI.delay(5)


//close window
WebUI.closeBrowser()

