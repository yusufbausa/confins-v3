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
WebUI.setText(findTestObject('Login/username'), usernameReq)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ADMIN ROLE================================================================================================================================================================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Amendment/Request/CDD/a_Select'), 2)
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/a_Select'))
WebUI.delay(3)


//SELECT MENU AMENDMENT REQUEST================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/img_Welcome, ANDI WIBAWA, TANGERANG, CUSTOM_635c3d'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/CDD/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 
    '156', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/a_Amendment Request'))
WebUI.delay(3)


//INPUT CUST CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/CDD/select_Select OneChange Due DatePrepaymentPartial Asset PaymentReschedullingAgreement TransferAsset ReplacementFloating Adjustment'), 
    'PRP', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Amendment/Request/CDD/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_96f6b8'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/input_Address_ucSearchbtnSearch'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Amendment/Request/CDD/input_No_gvAgrmntctl02imbEdit'))
WebUI.delay(5)


//REQUEST ET PROCESS================================================================================================================================================================================================================================================================================================================
WebUI.sendKeys(findTestObject('Object Repository/Amendment/Request/ET/input_Effective Date_ucDpEffectiveDttxtDatePicker'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Amendment/Request/ET/input_Effective Date_ucDpEffectiveDttxtDatePicker'),
Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Amendment/Request/ET/input_Effective Date_ucDpEffectiveDttxtDatePicker'),
	effDate)
WebUI.sendKeys(findTestObject('Object Repository/Amendment/Request/ET/input_Effective Date_ucDpEffectiveDttxtDatePicker'),
	Keys.chord(Keys.ENTER))
WebUI.delay(1)
//WebUI.acceptAlert()
WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/input_This field is required_lbCalPrepaymet'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/Amendment/Request/ET/select_Select OneKONDISI KEUANGAN MEMUNGKIN_0c6d50'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/ET/select_Select OneKONDISI KEUANGAN MEMUNGKIN_0c6d50'), 
    '274', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/ET/select_Select OneBSE0480SUG0793AFH1059LFC20_bb8927'), 
    approvedBy, false)
WebUI.setText(findTestObject('Object Repository/Amendment/Request/ET/textarea_Notes_ucApprovaltxtNotes'), 'Requested by Customer')
WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.closeBrowser()

