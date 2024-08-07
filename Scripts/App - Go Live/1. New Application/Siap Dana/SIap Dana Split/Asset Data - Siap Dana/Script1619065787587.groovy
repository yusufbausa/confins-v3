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

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Select'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Add'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), 
    '%tangerang%')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Select (1)'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Top Up Agreement No_ucLookupTopUpAgrm_f80e6d'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Customer Name_ucLookupTopUpAgrmntuclT_c68dd5'), 
    'Patrick Seven')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Select_1'))

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Asset Price_ucAssetPricetxtInput'), 
    '500000000')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Down Payment_ucDownPaymentPrcnttxtInput'), 
    '30')

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Get Market Price  Calc  Upping'))

WebUI.closeBrowser()

