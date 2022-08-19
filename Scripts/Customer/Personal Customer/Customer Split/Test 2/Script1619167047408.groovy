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

WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/a_Select'))


WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', true)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    'Senayan')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    '12345')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    'Stella One')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    '1234567890')
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'), 
    '4138', false)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/input_-_lb_Form_SaveCont_FinancialData'))

WebUI.closeBrowser()

