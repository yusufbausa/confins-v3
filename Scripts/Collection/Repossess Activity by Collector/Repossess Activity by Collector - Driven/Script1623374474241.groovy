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
WebUI.setText(findTestObject('Login/username'), usernameExecutor)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'), 20)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'))
WebUI.delay(1)


//select menu
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/button_menu'), 20)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/select_menu_collection'), 20)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_menu_collection'), '270', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/menu_field_collection'), 20)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/menu_field_collection'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/button_menu_repossess_activity'), 20)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/button_menu_repossess_activity'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/field_agreement_number'), 20)
WebUI.setText(findTestObject('COLLECTION/Repossess Activity by Collector/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/button_search'))
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/button_edit_collection_data'), 20)
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/button_edit_collection_data'))
WebUI.delay(1)


//repossess activity process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/select_address'), 20)
WebUI.scrollToElement(findTestObject('COLLECTION/Repossess Activity by Collector/select_address'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_address'), 
    'Legal Address', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_action'), 
    '370', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_result'), 
    '129', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Repossess Activity by Collector/field_contact_name'), 
    'Karsono')
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_customer_relationship'), 
    'BROTHER/SISTER', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Repossess Activity by Collector/select_type_of_problem'), 
    '4', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Repossess Activity by Collector/field_notes'), 'notes')
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

