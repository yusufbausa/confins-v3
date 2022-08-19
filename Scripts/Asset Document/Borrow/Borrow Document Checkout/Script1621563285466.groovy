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

//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'DMN1556')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'))
WebUI.delay(3)


//select menu document checkout
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 
    '121', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/a_Filing Management'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/a_Document Check Out'))
WebUI.delay(2)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    '2110405297')
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/select_Select OneAsset DocumentAddColl Document'), 
    'ASD', false)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/input_Borrow_gvRequestListctl02imbEdit'))
WebUI.delay(3)


//document checkout process
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Doc Checkout/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

