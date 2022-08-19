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
WebUI.setText(findTestObject('Login/username'), usernameSDH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select profile
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_profile'))
WebUI.delay(3)


//select menu remedial expense approval
//WebUI.click(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/img_Welcome, RULLY INDRA PERMANA, JAKARTA C_0d9427'))
//WebUI.delay(1)
//WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Remedial Expense/Remedial Expense Approval/select_LOAN ORIGINATIONACCOUNT MAINTENANCEDISBURSEMENTAMENDMENTMARKETINGCOLLECTIONREMEDIAL'), 
//    '303', false)
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_menu_remedial_expense_approval'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_process'))
WebUI.delay(3)


//remedial expense approval process
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 0)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/field_notes'), 
    notes)
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

