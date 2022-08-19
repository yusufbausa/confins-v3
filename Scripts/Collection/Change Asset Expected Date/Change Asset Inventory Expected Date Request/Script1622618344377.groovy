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
WebUI.setText(findTestObject('Login/username'), usernameAR)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(2)


//select menu change inventory expected date
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/extend_menu_repossess'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu_change_inventory_expected_date'))
WebUI.delay(2)


//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_edit_collection_data'))
WebUI.delay(2)


//change expected date req process
WebUI.scrollToElement(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_new_expected_date'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_new_expected_date'), 
    date)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_expected_date_notes'), 
    notes)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_reason_description'), 
    '211', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_approved_by'), 
    '50479', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_approval_notes'), 
    notes)
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

