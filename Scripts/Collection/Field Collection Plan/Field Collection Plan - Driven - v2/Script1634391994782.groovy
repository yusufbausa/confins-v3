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


//select menu field collection plan
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/button_menu'))
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'))
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/menu_opsi_field_collection_plan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/menu_opsi_field_collection_plan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/menu_opsi_field_collection_plan'))
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/menu_opsi_field_collection_plan'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Plan/field_agreement_number'), agreeNo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_collection_bucket'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_collection_bucket'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/select_collection_bucket'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Plan/select_collection_bucket'), '9', false)

WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/image_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/image_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/image_edit_data'))
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/image_edit_data'))
WebUI.delay(1)


//input plan process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_action_plan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_action_plan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/select_action_plan'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Plan/select_action_plan'), '370', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/field_action_plan_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/field_action_plan_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/field_action_plan_date'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Plan/field_action_plan_date'), date)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Plan/button_submit'))
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

