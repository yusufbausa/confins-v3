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

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_Select'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_New Application'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_Add'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Product Offering Name_ucLookupProdOff_8d93d5'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/tr_Product Offering Name'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    'rcfcv non paket 2021')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_SEARCH (1)'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_Select (1)'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '1')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_Next'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Personal_rblCustType'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Customer Name_uclCustuclCustimb'))

WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Corporate/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'Olaf Two')

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_SEARCH (1)'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/a_Select (2)'))

WebUI.click(findTestObject('Object Repository/New Application (NEW)/Corporate/input_-_lb_Form_SaveCont'))

