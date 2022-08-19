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

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'))
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), agreeNo)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_collection_bucket_name'), '9', false)

WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'))
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'))
WebUI.delay(1)


//activity process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_address'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_address'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_address'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_address'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_action'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_action'), '370', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_result'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_result'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_result'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_result'), '129', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_contact_person_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_contact_person_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/field_contact_person_name'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_contact_person_name'), contactName)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_person_relationship'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_person_relationship'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_person_relationship'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_person_relationship'), 'BROTHER/SISTER', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_next_action_plan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_next_action_plan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_next_action_plan'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_next_action_plan'), '370', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_type_of_problem'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_type_of_problem'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/select_type_of_problem'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_type_of_problem'), '4', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_next_action_plan_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_next_action_plan_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/field_next_action_plan_date'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_next_action_plan_date'), nextActionDate)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Field Coll Activity/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Field Coll Activity/button_submit'))
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

