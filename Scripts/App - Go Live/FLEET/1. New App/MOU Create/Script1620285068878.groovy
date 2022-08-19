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

WebUI.navigateToUrl('http://confins-qa.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')

WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_Select'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _ead4f7'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_MOU'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_MOU_1'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_Add'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Customer Name_uclCustuclCustimb'))

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'PT Amstar One')

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/MOU/MOU Create/select_AllPersonalCompany'), 'C', true)

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_Select (1)'))

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Expired Date_ucExpiredDttxtDatePicker'), '06/03/2022')

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Reff No_txtReffNo'), '123456789')

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/td_                                        _08088a'))

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Plafond Amount_ucINPlafondAmttxtInput'), '1000000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/MOU/MOU Create/select_Select OneFixed RateFloat Rate'), 
    'FXD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/MOU/MOU Create/select_Select OneBalloonEven PrincipleIrreg_8e13fd'), 
    'RF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/MOU/MOU Create/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_to_ucINDPFromtxtInput'), '30')

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input__ucINDPTotxtInput'), '70')

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_to_ucINTenorFromtxtInput'), '36')

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input__ucINTenorTotxtInput'), '48')

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/MOU/MOU Create/select_Select OneCARHEAVY EQUIPMENTMULTIPUR_31823e'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_This field is required_lb_Form_Add'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_DELETE_gvAssetctl02uclBranduclBrandimb'))

WebUI.setText(findTestObject('Object Repository/FLEET/MOU/MOU Create/input_Brand Name_gvAssetctl02uclBranduclBra_3528a7'), 
    '%toyota%')

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_Select_1'))

WebUI.click(findTestObject('Object Repository/FLEET/MOU/MOU Create/a_Save'))

