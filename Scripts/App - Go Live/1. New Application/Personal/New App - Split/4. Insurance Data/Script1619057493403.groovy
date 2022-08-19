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

WebUI.setText(findTestObject('1. New Application (NEW)/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('1. New Application (NEW)/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Select'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_New Application'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Add'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('1. New Application (NEW)/Insurance Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_SEARCH'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Select (1)'))

WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_-_lb_Form_SaveContInsurance'))


WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_E 8723 IKI_gvEntryInsctl02imbEdit'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Insurance Data/select_Select OneAAB - JKT TB.SIMATUPANG OJ_c4c099'), 
    '83', false)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Insurance Data/select_Select OneGroupNon GroupRepeat Order'), 
    'NG', false)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Insurance Data/select_Select OneALL RISKTLO'), 
    'ALL RISK', false)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Next'))
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Insurance Data/a_Calculate'), 0)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Calculate'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Insurance Data/a_Save'), 0)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_-_lb_Form_Next'))
WebUI.delay(1)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_-_lb_Form_SaveContInsurance'))
WebUI.delay(2)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_Cover Life Insurance _cbIsCoverLifeIns'))
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Insurance Data/select_Select OneASURANSI ASTRA SYARIAH, AS_55649c'), 
    '6', false)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_Customer Insured_cblCustomerInsured0'))
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Insurance Data/select_Select OneFull On LoanFull PaymentPa_43fb00'), 
    'FO', false)
WebUI.click(findTestObject('1. New Application (NEW)/Insurance Data/input_-_lb_Form_SaveContLifeInsurance'))
WebUI.delay(5)



WebUI.closeBrowser()

