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
WebUI.setText(findTestObject('Login/username'), usernameSurvey)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/select_role_survey'))
WebUI.delay(1)


//select menu survey result review
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/button_menu'))
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/btn_menu_survey'))
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/menu_survey_result_review'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Survey/Survey Reassign/field_trx_ref_no'), 
    trxNo)
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Survey/Survey Reassign/btn_action_review'))
WebUI.delay(1)


//resurvey process
WebUI.click(findTestObject('Object Repository/Survey/Resurvey/btn_resurvey'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Survey/Resurvey/btn_submit'))
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Survey/Resurvey/btn_submit'))


//save resurvey
WebUI.click(findTestObject('Object Repository/Survey/Resurvey/btn_save'))
WebUI.delay(1)


//close browser
WebUI.closeBrowser()

