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
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/select_role'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/select_role'))
WebUI.delay(1)

//select menu survey task assignment
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/button_menu'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/menu_survey'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/menu_survey'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/btn_survey_task_assignment'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/btn_survey_task_assignment'))
WebUI.delay(5)


//input cust credential
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/field_transaction_ref_no'), 20)
WebUI.setText(findTestObject('New Application (NEW)/Survey Assignment/field_transaction_ref_no'), 
    agreeNo)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/button_assign'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_assign'))
WebUI.delay(1)


//cancel survey process1
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/button_cancel1'), 20)
WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_cancel1'))
//WebUI.delay(1)
WebUI.acceptAlert()
//WebUI.click(findTestObject('Object Repository/New Application (NEW)/Survey Assignment/new component/a_Save'))
WebUI.delay(5)


////input cust credential
//WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/field_transaction_ref_no'), 20)
//WebUI.setText(findTestObject('New Application (NEW)/Survey Assignment/field_transaction_ref_no'),
//	'0037APP20220500085')
//WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_search'))
//WebUI.delay(1)
//
//WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Survey Assignment/button_assign'), 20)
//WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_assign'))
//WebUI.delay(1)
//
//
////cancel survey process2
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Survey Assignment/button_cancel2'), 2)
//WebUI.click(findTestObject('New Application (NEW)/Survey Assignment/button_cancel2'))
//WebUI.delay(1)
//WebUI.acceptAlert()


//close browser
WebUI.closeBrowser()
