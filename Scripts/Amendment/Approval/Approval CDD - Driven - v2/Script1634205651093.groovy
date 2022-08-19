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

//OPEN BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), usernameAppr)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//SELECT ADMIN ROLE================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Amendment/Approval/CDD/a_Select'))
//WebUI.delay(1)


//SELECT MENU AMENDMENT APPROVAL================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/img_Welcome, ANDI WIBAWA, TANGERANG, CUSTOM_635c3d'))
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/CDD/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'),
	'156', false)
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Amendment/Approval/CDD/a_Amendment Approval'))
WebUI.delay(10)


//INPUT CUST CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/CDD/select_Select OneChange Due DatePrepaymentPartial Asset PaymentReschedullingAgreement TransferAsset ReplacementFloating Adjustment'),
	'CDD', false)
WebUI.setText(findTestObject('Object Repository/Amendment/Approval/CDD/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_b25f48'), agreeNo)
WebUI.click(findTestObject('Object Repository/Amendment/Approval/CDD/input_Value must be Date Format_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/Amendment/Approval/CDD/a_Process'))
WebUI.delay(1)


//APPROVAL CDD PROCESS================================================================================================================================================================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Amendment/Approval/CDD/select_Select OneApproveRejectReturn'), 10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Approval/CDD/select_Select OneApproveRejectReturn'), 'Approve', false)
WebUI.setText(findTestObject('Object Repository/Amendment/Approval/CDD/textarea_Notes_txtNotes'), 'Approved')
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Amendment/Approval/CDD/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.closeBrowser()