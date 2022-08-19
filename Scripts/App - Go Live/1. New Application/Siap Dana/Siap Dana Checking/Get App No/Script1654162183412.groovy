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

WebUI.navigateToUrl('https://confins-qa.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Copyright  AdIns 2011. All Right Rese_e6b1e8'), 
    'AAZ0049')

WebUI.setEncryptedText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Copyright  AdIns 2011. All Right Rese_092e4f'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Copyright  AdIns 2011. All Right Rese_9109c2'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Select'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/img_Welcome, ABDUL AZIS, TANGERANG, Marketi_f0727e'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_New Application'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Add (1)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Product Offering Name_ucLookupProdOff_8d93d5'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    '%TAF SiapDana Platinum%')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_SEARCH (1)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Select (1)'))

WebUI.doubleClick(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Num Of Asset_ucINNumOfAssettxtInput'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '1')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Next'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Customer Name_uclCustuclCustimb'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'Zisimos Valavanis Nine')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_SEARCH (1)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Select (2)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Tenor_ucINTenortxtInput'), 
    '036')

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneFixed RateFloat Rate'), 
    'FXD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneRegular Fixed InstallmentI_6fe75a'), 
    'RF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select One18 JULI GIIAS 2019AAM VIRT_54019e'), 
    'DEALER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneAuto Debit AFIAuto Debit B_331551'), 
    'ADBCA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneRenovasi RumahTravellingPe_9fda3b'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Copy Address'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-ext_ucAddrtxtPhnArea1'), 
    '021')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-ext_ucAddrtxtPhn1'), '081234567')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-ext_ucAddrtxtPhoneExt1'), 
    '789')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Add (1)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Select_1'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Top Up Agreement No_ucLookupTopUpAgrm_f80e6d'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Customer Name_ucLookupTopUpAgrmntuclT_c68dd5'), 
    'Zisimos Valavanis Nine')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_SEARCH_1_2'))

WebUI.doubleClick(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Asset Price_ucAssetPricetxtInput'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Asset Price_ucAssetPricetxtInput'), 
    '370000000')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Down Payment_ucDownPaymentPrcnttxtInput'))

WebUI.doubleClick(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Down Payment_ucDownPaymentPrcnttxtInput'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '50')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Get Market Price  Calc  Upping'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Bekas_rblAssetCondition'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'P', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Save'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_SD1SDRGK5150GJ703309_gvAssetListctl02imbEdit'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Other_rblAssetUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneLegal AddressResidence Add_6dc5b6_1'), 
    'LEGAL', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Copy'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Save_1'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_SD1SDRGK5150GJ703309_gvEntryInsctl02imbEdit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneGARDA OTOLITE INSURANCE (R_ca6cec'), 
    'INS005', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneGroupNon GroupRepeat Order'), 
    'NG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneALL RISKTLO'), 
    'ALL RISK', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_SRCC_cblAddCvgTypeName2'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Next'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Calculate'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/a_Save_1_2'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_Next'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Cover Life Insurance_cbIsCoverLifeIns'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneASURANSI ASTRA SYARIAH, AS_d7da2f'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Customer Insured_cblCustomerInsured0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneFull On LoanFull PaymentPa_43fb00'), 
    'FO', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Fees_lb_Form_CalcFee'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Fees_lbCalculateFees'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Financial Data_lbCalculateFinancialData'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_SaveCont'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneYesNo'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneYesNo_1'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneYesNo_1_2'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/select_Select OneYesNo_1_2_3'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_Save'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl02cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl03cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl04cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl05cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl06cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl07cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_No_gvTermConditionctl08cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_No_gvTermConditionctl09cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_Yes_gvTermConditionctl10cbChecked'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/input_-_lb_Form_Save'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/field_app_no'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/span_Submit'))

WebUI.closeBrowser()

