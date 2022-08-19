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


//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameCAA)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/select_role'), 20)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/select_role'))
WebUI.delay(1)


//select menu credit approval with decision engine
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/button_menu'), 20)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/btn_credit_approval_DE'), 20)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/btn_credit_approval_DE'))
WebUI.delay(1)

//input cust credential (app number)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/field_application_number'), 20)
WebUI.setText(findTestObject('Credit Approval/CA Analyst Siap Dana/field_application_number'), 
    appNo)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/button_process'), 20)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/button_process'))
WebUI.delay(1)


//credit approval process
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA Analyst Siap Dana/button_calculate'), 20)
//WebUI.scrollToElement(findTestObject('Credit Approval/CA Analyst Siap Dana/button_calculate'), 0)
WebUI.delay(1)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/button_calculate'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Approval/CA Analyst Siap Dana/field_syarat'), 
    syarat)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Credit Approval/CA Analyst Siap Dana/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('Credit Approval/CA Analyst Siap Dana/field_notes'), notes)
WebUI.click(findTestObject('Credit Approval/CA Analyst Siap Dana/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

