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

//input credential
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setEncryptedText(findTestObject('Login/password'), '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)

//select profile
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)

//MENU APPLICATION
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_New Application'))


//ADD NEW APPLICATION
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_Add'))
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/input_Product Offering Name_ucLookupProdOff_8d93d5'))
WebUI.setText(findTestObject('1. New Application (NEW)/New Application - Customer/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    '%multiguna%')
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_SEARCH'))
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_Select (1)'))
WebUI.setText(findTestObject('1. New Application (NEW)/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '1')
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_Next'))


//ADD CUSTOMER
WebUI.scrollToElement(findTestObject('1. New Application (NEW)/New Application - Customer/input_Customer Name_uclCustuclCustimb'), 
    0)
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/input_Customer Name_uclCustuclCustimb'))
WebUI.setText(findTestObject('1. New Application (NEW)/New Application - Customer/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'Jack Nine')
WebUI.selectOptionByValue(findTestObject('1. New Application (NEW)/New Application - Customer/select_AllPersonal'), 
    'P', true)
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_SEARCH (1)'))
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/a_Select (2)'))
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/input_-_lb_Form_SaveContCust'))
WebUI.delay(3)
WebUI.click(findTestObject('1. New Application (NEW)/New Application - Customer/input_-_lb_Form_SaveContGuarantor'))



WebUI.closeBrowser()

