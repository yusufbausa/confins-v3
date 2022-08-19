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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), usernameDS)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.delay(1)


//SELECT MENU DOCUMENT SIGNER
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/a_Document Signer'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_Document Signer'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 20)
WebUI.setText(findTestObject('Object Repository/FLEET/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    appNo)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'))
WebUI.delay(1)


//DOCUMENT SIGNER PROCESS
//company signer
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), 20)
WebUI.setText(findTestObject('Object Repository/FLEET/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), 
    '%')
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_SEARCH'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/a_Select (1)'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_Select (1)'))
WebUI.delay(3)

//management shareholder
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Document Signer/input_Management  Shareholder_uclCoyCommiss_b6c733'), 0)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/input_Management  Shareholder_uclCoyCommiss_b6c733'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Document Signer/input_Commisioner Name_uclCoyCommissioneruc_d9ee8b'), 
    '%')
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_SEARCH_1'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/a_Select_1'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_Select_1'))


//approver signer
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Document Signer/input_Customer Commisioner Approver 1_uclCo_f26358'), 0)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/input_Customer Commisioner Approver 1_uclCo_f26358'))
WebUI.setText(findTestObject('Object Repository/FLEET/Document Signer/input_Commisioner Name_uclCoyApprover1uclCu_7067ad'), 
    '%')
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_SEARCH_1_2'))
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/a_Select_1_2'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_Select_1_2'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Document Signer/a_Submit'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Document Signer/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER
WebUI.closeBrowser()

