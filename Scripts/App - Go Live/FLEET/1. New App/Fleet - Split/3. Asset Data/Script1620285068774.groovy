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

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 'HMS1248')
WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/Asset Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select'))


//ADDING ASSET DATA================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Add'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), '%tangerang%')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select (1)'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'), 
    '29721', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMasterimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), '%calya%')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH_1'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select_1'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), '250000000')
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), '30')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/textarea_Notes_txtNotesMainAss'), 'notes')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Mesin_txtSerialNo1'), 'gjahsdg26387424gj')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Rangka_txtSerialNo2'), 'gjahsdg26387424gj123')
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneKomersial Jangka PanjangKo_70a155'), 
    'O', false)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Manufacturing Year_txtManufacturingYear'), '2020')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 'Jepang')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_CYLINDER_rptAttributectl01txtAttrContent'), '3')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_TRANSMITION_rptAttributectl02txtAttrContent'), 'A')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_COLOR_rptAttributectl03txtAttrContent'), 'Black')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save'))


//ASSET DATA REGISTRATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_gjahsdg26387424gj123_gvAssetListctl02imbEdit'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 
    'LEGAL', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Copy'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save_1'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_-_lb_Form_SaveCont'))


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

