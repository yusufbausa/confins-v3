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


//open browserr
WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.maximizeWindow()


//input credential
WebUI.waitForElementPresent(findTestObject('Demo Katalon/v1/button_make_appointment'), 20)
WebUI.click(findTestObject('Demo Katalon/v1/button_make_appointment'))
WebUI.setText(findTestObject('Demo Katalon/v1/field_username'), username)
WebUI.setText(findTestObject('Demo Katalon/v1/field_password'), password)
WebUI.click(findTestObject('Object Repository/Demo Katalon/v1/button_Login'))
WebUI.delay(1)


//make apointment process
WebUI.waitForElementPresent(findTestObject('Demo Katalon/v1/select_facility'), 20)
WebUI.selectOptionByValue(findTestObject('Demo Katalon/v1/select_facility'), 
    'Seoul CURA Healthcare Center', false)
WebUI.click(findTestObject('Demo Katalon/v1/check_readmission'))
WebUI.click(findTestObject('Demo Katalon/v1/select_healthcare_program'))
WebUI.setText(findTestObject('Demo Katalon/v1/field_visit_date'), '22/07/2021')
WebUI.setText(findTestObject('Demo Katalon/v1/field_comment'), comment)
WebUI.click(findTestObject('Object Repository/Demo Katalon/v1/button_Book Appointment'))
WebUI.delay(2)
WebUI.click(findTestObject('Demo Katalon/v1/button_go_homepage'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

