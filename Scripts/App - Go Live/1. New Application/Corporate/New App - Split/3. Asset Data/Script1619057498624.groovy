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


WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('1. New Application (NEW)/Asset Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Select'))
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))



WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Add'))
WebUI.delay(1)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))
WebUI.delay(0)
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_SEARCH'))
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Select (1)'))
WebUI.delay(0)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Asset Data/select_Select OneFARIDATUL MUNAWAROHMANDANA_c8dcc6'), 
    '47763', false)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_Asset Name_ucLookupAssetSchmuclAssetSchmimb'))
WebUI.delay(0)
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_Asset Name_ucLookupAssetSchmuclAssetS_97a5aa'), 
    '%innova%')
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_SEARCH_1'))
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Select_1'))
WebUI.delay(0)

WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput'), 
    '500000000')

WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('1. New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Asset Data/input_No. Mesin_txtSerialNo1'), 0)
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_No. Mesin_txtSerialNo1'), 'HJAzS79843946148648')
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_No. Rangka_txtSerialNo2'), 'HJAazd79843946148648')
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_License Plate No_txtLicensePlateNo'), 
    'Z 7654 UCD')
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Asset Data/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'P', false)
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_Manufacturing Year_txtManufacturingYear'), 
    '2020')
WebUI.setText(findTestObject('1. New Application (NEW)/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 
    'JEPANG')
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Asset Data/a_Save'), 0)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Save'))
WebUI.delay(0)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_HJAasd79843946148648_gvAssetListctl02imbEdit'))
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_Other_rblAssetUser'))
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Asset Data/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    0)
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/Asset Data/select_Select OneLegal AddressResidence Add_6dc5b6'), 
    'LEGAL', false)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Copy'))
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/Asset Data/a_Save_1'), 0)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/a_Save_1'))
WebUI.delay(0)
WebUI.click(findTestObject('1. New Application (NEW)/Asset Data/input_-_lb_Form_SaveCont'))




WebUI.closeBrowser()

