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
WebUI.setText(findTestObject('Login/username'), usernameRA1)

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
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.delay(1)


//select menu remedial activity
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/button_menu'))
WebUI.click(findTestObject('REMEDIAL/Remedial Activity/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_menu_remedial'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_menu_remedial'), '303', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/menu_remedial_collection'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/menu_remedial_collection'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/menu_remedial_collection'))
WebUI.click(findTestObject('REMEDIAL/Remedial Activity/menu_remedial_collection'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_remedial_activity'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_remedial_activity'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/button_remedial_activity'))
WebUI.click(findTestObject('REMEDIAL/Remedial Activity/button_remedial_activity'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_collector_name'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_collector_name'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_collector_name'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_collector_name'), '5988', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/field_agreement_number'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Activity/field_agreement_number'), agreeNo)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/Additional Item/select_collection_bucket_name'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/Additional Item/select_collection_bucket_name'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/Additional Item/select_collection_bucket_name'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/Additional Item/select_collection_bucket_name'), colBucketValue, false)

WebUI.click(findTestObject('REMEDIAL/Remedial Activity/button_search'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_action'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_action'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/button_action'))
WebUI.click(findTestObject('REMEDIAL/Remedial Activity/button_action'))
WebUI.delay(1)


//remedial activity process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_address_visited'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_address_visited'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_address_visited'))
WebUI.scrollToElement(findTestObject('REMEDIAL/Remedial Activity/select_address_visited'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_address_visited'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_action'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_action'), '385', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_result'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_result'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_result'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_result'), '202', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_contact_person_name'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_contact_person_name'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/field_contact_person_name'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Activity/field_contact_person_name'), contactName)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_relationship'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_relationship'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_relationship'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_relationship'), 'BROTHER/SISTER', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_problem_type'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/select_problem_type'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/select_problem_type'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Activity/select_problem_type'), '17', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/field_notes'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Activity/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Activity/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Activity/button_submit'))
WebUI.click(findTestObject('REMEDIAL/Remedial Activity/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

