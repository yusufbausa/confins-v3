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

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'TAB1616')

WebUI.setEncryptedText(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/a_Select'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_Welcome, TITO ARI PRABOWO, TANGERANG, M_c8243e'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/a_New Application Data Entry'))

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_Customer Name_ucSearchtxtCustNamePaging_ltlCustCustNameSearch'), 
    'Alam Test Two')

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_Task Claim By_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_TITO ARI PRABOWO_gvApplicationctl02imbEdit'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/a_Next'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_search_cust_name'))

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/field_cust_name_guarantor'), 'Teresita Rodarte One')

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_search_guarantor'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_select_guarantor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/select_cust_relationship'), 
    'MOTHER', true)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_save_guarantor'))

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/input_-_lb_Form_SaveCont'))

WebUI.closeBrowser()

