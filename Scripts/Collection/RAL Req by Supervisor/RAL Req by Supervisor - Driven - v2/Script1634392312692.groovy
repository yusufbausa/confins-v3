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
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(1)


//select menu RAL Req by Supervisor
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/expand_menu_RAL'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/expand_menu_RAL'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/expand_menu_RAL'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/expand_menu_RAL'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu_RAL_req_by_supervisor'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu_RAL_req_by_supervisor'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu_RAL_req_by_supervisor'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu_RAL_req_by_supervisor'))
WebUI.delay(1)


//input customer credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/RAL Req by Supervisor/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_edit_collection_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_edit_collection_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/button_edit_collection_data'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_edit_collection_data'))
WebUI.delay(1)


//RAL assignment process
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'))
WebUI.scrollToElement(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), 10)
WebUI.delay(1)
//WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), ralExecutor, false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), ralExecutor, false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_signer_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_signer_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_signer_name'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_signer_name'), '938', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/field_notes'))
WebUI.setText(findTestObject('COLLECTION/RAL Req by Supervisor/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/button_submit'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

