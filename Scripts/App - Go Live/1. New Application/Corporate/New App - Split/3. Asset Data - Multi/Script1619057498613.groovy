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

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Select'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_New Application'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Product Offering Name_ucLookupProdOff_8d93d5'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    'RCFCV NON PAKET 2021')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_SEARCH'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '2')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Next'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Select (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneFARIDATUL MUNAWAROHMANDANA_c8dcc6'), 
    '47763', true)

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Name_ucLookupAssetMasteruclMasterimb'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), 
    '%calya%')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Select_1'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Price_ucAssetPricetxtInput'), 
    '200000000')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_No. Mesin_txtSerialNo1'), 
    '1235tuwdt7635ff')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_No. Rangka_txtSerialNo2'), 
    '1235tuwdt763512')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'P', true)

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Manufacturing Year_txtManufacturingYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_MADE IN_rptAttributectl00txtAttrContent'), 
    'jepang')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Save'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_ARMADA AUTO TARA - TGR CIKOKOL 1_gvAs_934caa'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Other_rblAssetUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    'LEGAL', true)

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Copy'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Save_1'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Select (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneFARIDATUL MUNAWAROHMANDANA_c8dcc6'), 
    '47763', true)

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Name_ucLookupAssetMasteruclMasterimb'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), 
    '%avanza%')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Select_1_2'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Asset Price_ucAssetPricetxtInput'), 
    '250000000')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_No. Mesin_txtSerialNo1'), 
    '1235tuwdt763566')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_No. Rangka_txtSerialNo2'), 
    '1235tuwdt763533')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'P', true)

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Manufacturing Year_txtManufacturingYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_MADE IN_rptAttributectl00txtAttrContent'), 
    'jepang')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Save'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_ARMADA AUTO TARA - TGR CIKOKOL 1_gvAs_fab4de'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_Other_rblAssetUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    'LEGAL', true)

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Copy'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/a_Save_1'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_-_lb_Form_SaveCont'))

WebUI.closeBrowser()

