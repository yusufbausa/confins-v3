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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'AWB1314')

WebUI.setEncryptedText(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/a_Select'))

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/img_Welcome, ANDI WIBAWA, TANGERANG, CUSTOM_635c3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/ET/additional/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 
    '156', true)

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/a_Amendment Request'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amendment/Request/ET/additional/select_Select OneChange Due DatePrepaymentPartial Asset PaymentReschedullingAgreement TransferAsset ReplacementFloating Adjustment'), 
    'PRP', true)

WebUI.setText(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_96f6b8'), 
    '2002200121')

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Address_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/input_No_gvAgrmntctl02imbEdit'))

WebUI.setText(findTestObject('Object Repository/Amendment/Request/ET/additional/input_Effective Date_ucDpEffectiveDttxtDatePicker'), 
    '25/03/2021')

WebUI.click(findTestObject('Object Repository/Amendment/Request/ET/additional/input_This field is required_lbCalPrepaymet'))

WebUI.closeBrowser()

