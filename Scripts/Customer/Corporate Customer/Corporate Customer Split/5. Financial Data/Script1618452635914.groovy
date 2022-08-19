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

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))


WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Select'))



WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
    '500000000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
    '350000000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
    '200000000')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input__btnCalculate'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/a_Add'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Financial Data/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', true)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    'Senayan')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    '12345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    'Nick Three')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    '123456789')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Save'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(3)

