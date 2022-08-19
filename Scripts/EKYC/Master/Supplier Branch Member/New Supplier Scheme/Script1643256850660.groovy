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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), usernameSU)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select role
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/select_role'))
//WebUI.delay(1)


//select menu supplier branch
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu_supplier_scheme'))
//WebUI.delay(1)


//add supplier scheme process
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_supplier_scheme'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_code'), schemeCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_name'), schemeName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_active'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_next'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_branch_name'), suppBranchName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_search'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_supplier_branch'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_to_temp'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_save'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


