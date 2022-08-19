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
WebUI.setText(findTestObject('Login/username'), 'ITW0341')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(2)


//select menu RAL Req by Supervisor
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/expand_menu_RAL'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_menu_RAL_req_by_supervisor'))
WebUI.delay(2)


//input customer credential
WebUI.setText(findTestObject('COLLECTION/RAL Req by Supervisor/field_agreement_number'), '1915858857')
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_edit_collection_data'))
WebUI.delay(2)


//RAL assignment process
WebUI.scrollToElement(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), 0)
WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_executor'), 
    '473', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/RAL Req by Supervisor/select_signer_name'), 
    '938', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/RAL Req by Supervisor/field_notes'), 'notes')
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

