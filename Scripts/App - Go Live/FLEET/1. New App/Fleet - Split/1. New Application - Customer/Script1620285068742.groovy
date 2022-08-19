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


//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'HMS1248')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.delay(3)


//SELECT MENU NEW APPLICATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_New Application'))
WebUI.delay(3)


//INPUT APPLICATION FLEET================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Add'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_8d93d5'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_cb8174'), 
    'fleet business vehicle nonpaket')
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (1)'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '1')
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Next'))
WebUI.delay(3)


//SELECT CUSTOMER================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'), 0)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), 
    'CV BUANA JAYA')
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/New Application - Customer/select_AllCompany'), 'C', false)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH (1)'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (2)'))
WebUI.delay(1)
WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContCust'))
WebUI.delay(5)
WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContGuar'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()




