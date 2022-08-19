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

WebUI.click(findTestObject('Object Repository/Customer/Financial Data/a_Financial Data'))

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData_GrossMonthlyIncomeAmttxtInput'), 
    '20000000')

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
    '15000000')

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
    '5000000')

WebUI.click(findTestObject('Object Repository/Customer/Financial Data/input__btnCalculate'))

WebUI.click(findTestObject('Object Repository/Customer/Financial Data/a_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    'Kuningan')

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    'Jack Reacher')

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Customer/Financial Data/a_Save'))

WebUI.click(findTestObject('Object Repository/Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'))

WebUI.closeBrowser()

