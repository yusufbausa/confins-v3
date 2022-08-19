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
WebUI.delay(1)


//select menu field collection plan
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu'), 20)
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), 20)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), 
    '270', false)
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'), 20)
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'), 20)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), 20)
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), 
    agreeNo)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_collection_bucket_name'), 
    '9', false)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_search'))
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'), 20)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'))
WebUI.delay(1)


//activity process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Field Coll Activity/select_address'), 20)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_address'), 
    'Legal Address', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_action'), 
    '370', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_result'), 
    '129', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_contact_person_name'), 
    contactName)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_person_relationship'), 
    'BROTHER/SISTER', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_next_action_plan'), 
    '370', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_type_of_problem'), 
    '4', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_next_action_plan_date'), 
    nextActionDate)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_notes'), notes)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

