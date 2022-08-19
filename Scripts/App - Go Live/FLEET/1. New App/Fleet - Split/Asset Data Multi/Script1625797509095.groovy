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

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')

WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Select'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_New Application'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Select (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'), 
    '29721', true)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Name_ucLookupAssetMasteruclMasterimb'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), 
    '%calya%')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_SEARCH_1'))

WebUI.doubleClick(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Price_ucAssetPricetxtInput'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Price_ucAssetPricetxtInput'), '250000000')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_No. Mesin_txtSerialNo1'), 'abcdefg87126356123')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_No. Rangka_txtSerialNo2'), 'jhgasdb183476184')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_License Plate No_txtLicensePlateNo'), 'b 71263 jahgsd')

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'O', true)

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Manufacturing Year_txtManufacturingYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_MADE IN_rptAttributectl00txtAttrContent'), 
    'jepang')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_CYLINDER_rptAttributectl01txtAttrContent'), 
    '3')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_TRANSMITION_rptAttributectl02txtAttrContent'), 
    'a')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_COLOR_rptAttributectl03txtAttrContent'), 'black')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Save'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_jhgasdb183476184_gvAssetListctl02imbEdit'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Self Usage_rblAssetUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneLegal AddressCompany Addre_fd5966'), 
    'LEGAL', true)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Copy'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Save_1'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Select (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'), 
    '29721', true)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Name_ucLookupAssetMasteruclMasterimb'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), 
    '%innova%')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Select_1_2'))

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Asset Price_ucAssetPricetxtInput'), '500000000')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_No. Mesin_txtSerialNo1'), 'kjhads8967123')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_No. Rangka_txtSerialNo2'), 'mnbad98y14')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_License Plate No_txtLicensePlateNo'), 'b 7623 klj')

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'O', true)

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Manufacturing Year_txtManufacturingYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_MADE IN_rptAttributectl00txtAttrContent'), 
    'jepang')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_CYLINDER_rptAttributectl01txtAttrContent'), 
    '3')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_TRANSMITION_rptAttributectl02txtAttrContent'), 
    'A')

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_COLOR_rptAttributectl03txtAttrContent'), 'black')

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Save'))

WebUI.click(findTestObject('FLEET/Asset Data/Multi/button_registration_asset_2'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_Self Usage_rblAssetUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/Multi/select_Select OneLegal AddressCompany Addre_fd5966'), 
    'LEGAL', true)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Copy'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/a_Save_1'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/Multi/input_-_lb_Form_SaveCont'))

WebUI.closeBrowser()

