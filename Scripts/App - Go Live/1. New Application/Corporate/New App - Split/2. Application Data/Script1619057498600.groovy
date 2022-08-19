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

WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('1. New Application (NEW)/Application Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_Select'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_New Application'))

WebUI.click(findTestObject('New Application (NEW)/Application Data/a_Add'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_Product Offering Name_ucLookupProdOff_8d93d5'))

WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    '%multiguna%')

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_SEARCH'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_Select (1)'))

WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '1')

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_Next'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_Customer Name_uclCustuclCustimb'))

WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'Jack Nine')

WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_AllPersonal'), 
    'P', true)

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_SEARCH'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/a_Select (2)'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_-_lb_Form_SaveContCust'))

WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_-_lb_Form_SaveContCust'))


WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_Tenor_ucINTenortxtInput'), 
    '48')
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), 
    '1', true)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select OneFixed RateFloat Rate'), 
    'FXD', true)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select OneRegular Fixed InstallmentI_6fe75a'), 
    'RF', true)
WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_Advance_rblFirstInstType'))
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 
    'DEALER', true)
WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_Yes_rblIsFudiciaCovered'))
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select OneAuto Debit AFIAuto Debit B_40b1f3'), 
    'ADBCA', true)
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Application Data/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    0)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Application Data/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    '1', true)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_-ext_ucAddrtxtPhnArea1'), '0')
WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_-ext_ucAddrtxtPhn1'), '08123456789')
WebUI.setText(findTestObject('1. New Application (NEW)/Application Data/input_-ext_ucAddrtxtPhoneExt1'), 
    '0')
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Application Data/input_-_lb_Form_SaveContAppData'), 0)
WebUI.click(findTestObject('1. New Application (NEW)/Application Data/input_-_lb_Form_SaveContAppData'))

WebUI.closeBrowser()

