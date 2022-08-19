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
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/select_profile'))
WebUI.delay(3)


//select menu remedial case analysis form (CAF)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/menu_repossession'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_menu_case_analysis_form'))
WebUI.delay(3)


//add new caf
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_add'))
WebUI.delay(3)


//input cust credential (agreement number)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_agreement_number'), '2011226585')
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_action'))
WebUI.delay(3)


//remedial case analysis form process
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_market_value'), Keys.chord(
        Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_market_value'), Keys.chord(
        Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_market_value'), '150000000')
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_collection_expense'), Keys.chord(
        Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_collection_expense'), Keys.chord(
        Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_collection_expense'), '1000000')
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_calculate'), 0)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_calculate'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_analysis'), 0)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_analysis'), 'ok')
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_action'), 'ok')
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_result'), 'ok')
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_handled_by'), 'aji kurniawan')
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/field_notes'), 'notes')
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Case Analysis Form/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()
