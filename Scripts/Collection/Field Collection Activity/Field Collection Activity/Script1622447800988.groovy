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
WebUI.setText(findTestObject('Login/username'), 'FER1108')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select menu field collection plan
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Plan/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Field Coll Plan/button_menu_field_collection'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/menu_opsi_field_coll_activity'))
WebUI.delay(2)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_agreement_number'), 
    '1919332643')
WebUI.selectOptionByValue(findTestObject('COLLECTION/Field Coll Activity/select_collection_bucket_name'), 
    '9', false)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/image_edit_collection_data'))
WebUI.delay(3)


//activity process
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
    'anu')
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
    '10/03/2021')
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Field Coll Activity/field_notes'), 'notes')
WebUI.click(findTestObject('COLLECTION/Field Coll Activity/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

