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
WebUI.setText(findTestObject('Login/username'), 'TIT0675')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA CAH/select_role'), 20)
WebUI.click(findTestObject('Credit Approval/CA CAH/select_role'))
WebUI.delay(1)


//select menu credit approval by Credit Area Head
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA CAH/button_menu'), 20)
WebUI.click(findTestObject('Credit Approval/CA CAH/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA CAH/btn_menu_credit_approval'), 20)
WebUI.click(findTestObject('Credit Approval/CA CAH/btn_menu_credit_approval'))
WebUI.delay(1)


//input cust credential (app number)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA CAH/field_app_number'), 20)
WebUI.setText(findTestObject('Credit Approval/CA CAH/field_app_number'), '0037APP20210800183')
WebUI.click(findTestObject('Credit Approval/CA CAH/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Credit Approval/CA CAH/button_process'), 20)
WebUI.click(findTestObject('Credit Approval/CA CAH/button_process'))
WebUI.delay(2)


//credit approval by credit area head process
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/CA CAH/select_Select OneApproveRejectReturn'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Approval/CA CAH/select_Select OneApproveRejectReturn'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Approval/CA CAH/field_notes'), 'approved')
WebUI.click(findTestObject('Credit Approval/CA CAH/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

