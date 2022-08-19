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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'AWB1314')
WebUI.setText(findTestObject('Login/password'), 'password')
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
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneChange Due DatePrepaymentPartial Asset PaymentReschedullingAgreement TransferAsset ReplacementFloating Adjustment'), 
    'RSC', false)
WebUI.setText(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_96f6b8'), 
    '2001200120')
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Address_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/input_No_gvAgrmntctl02imbEdit'))
WebUI.delay(3)


//REQUEST RESCHEDULE PROCESS================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/a_'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Effective Date_ucEffectiveDttxtDatePicker'), 
    '20/03/2021')
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneExisting Due DateEffective Date'), 
    'EFF_DT', false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/a__1'))
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Tenor Include Existing_txtFinStrucTen_5ea355'), 2)
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Tenor Include Existing_txtFinStrucTen_5ea355'))
WebUI.sendKeys(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Tenor Include Existing_txtFinStrucTen_5ea355'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Tenor Include Existing_txtFinStrucTen_5ea355'),
Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Amendment/Request/Reschedule/input_Tenor Include Existing_txtFinStrucTen_5ea355'),
	'36')
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), 
    '1', false)
WebUI.scrollToElement(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneBalloonEven PrincipleRegul_ef1d4f'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneBalloonEven PrincipleRegul_ef1d4f'), 
    'RF', false)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Amendment/Request/Reschedule/a_Calculate Installment'), 0)
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/a_Calculate Installment'))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneKONDISI KEUANGAN (TEMPORAR_46a91b'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneKONDISI KEUANGAN (TEMPORAR_46a91b'), 
    '284', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/Reschedule/select_Select OneAJW1423ALFC2023SUG0793'), 
    '304190', false)
WebUI.setText(findTestObject('Object Repository/Amendment/Request/Reschedule/textarea_Notes_ucApvtxtNotes'), 'request')
WebUI.click(findTestObject('Object Repository/Amendment/Request/Reschedule/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.closeBrowser()

