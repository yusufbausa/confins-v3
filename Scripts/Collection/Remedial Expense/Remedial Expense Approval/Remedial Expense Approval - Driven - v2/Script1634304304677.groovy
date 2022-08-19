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





//select profile
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_profile'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_profile'))
WebUI.delay(1)


//select menu remedial expense approval
//WebUI.waitForElementPresent(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/img_Welcome, RULLY INDRA PERMANA, JAKARTA C_0d9427'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/img_Welcome, RULLY INDRA PERMANA, JAKARTA C_0d9427'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/img_Welcome, RULLY INDRA PERMANA, JAKARTA C_0d9427'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/img_Welcome, RULLY INDRA PERMANA, JAKARTA C_0d9427'))
//WebUI.delay(1)
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/select_LOAN ORIGINATIONACCOUNT MAINTENANCEDISBURSEMENTAMENDMENTMARKETINGCOLLECTIONREMEDIAL'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/select_LOAN ORIGINATIONACCOUNT MAINTENANCEDISBURSEMENTAMENDMENTMARKETINGCOLLECTIONREMEDIAL'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/select_LOAN ORIGINATIONACCOUNT MAINTENANCEDISBURSEMENTAMENDMENTMARKETINGCOLLECTIONREMEDIAL'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/select_LOAN ORIGINATIONACCOUNT MAINTENANCEDISBURSEMENTAMENDMENTMARKETINGCOLLECTIONREMEDIAL'), 
//    '303', false)
//WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_menu_remedial_expense_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_menu_remedial_expense_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_menu_remedial_expense_approval'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_menu_remedial_expense_approval'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_process'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_process'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_process'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_process'))
WebUI.delay(1)


//remedial expense approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'))
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_notes'), notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_submit'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

