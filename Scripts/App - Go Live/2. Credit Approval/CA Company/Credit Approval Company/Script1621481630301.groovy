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
WebUI.setText(findTestObject('Login/username'), 'AEE1976')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Credit Review/a_Select'))
WebUI.delay(3)


//select menu credit approval
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/img_Welcome, AEP SAEPUDIN, TANGERANG, Credi_d8a0e4'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/a_Credit Approval'))


//input cust credential
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval Company/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 
    '0037APP20210300567')
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/input_Value must be Date Format_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/a_Process'))
WebUI.delay(3)


//credit approval process
WebUI.scrollToElement(findTestObject('Object Repository/Credit Approval/Credit Approval Company/select_Select OneApproveRejectReturn'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Approval/Credit Approval Company/select_Select OneApproveRejectReturn'), 
    'Approve', false)
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval Company/textarea_Notes_txtNotes'), 'Approved')
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


