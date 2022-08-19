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

WebUI.navigateToUrl('http://confins-qa.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'TUN0391')

WebUI.setEncryptedText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/a_Select'))




WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/img_Welcome, TYAS UNTORO, Jakarta Central A_bf5493'))

WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/select_LOAN ORIGINATIONACCOUNT'), 
    '270', true)

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/span_Asset Release_rtPlus'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/a_Repossess'))

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNoSearch'), 
    '1910028346')

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_License Plate No_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_MHKA6GK6JKJ051128_gvPagingctl02imbExtend'))

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Repossess Date_ucdpRepossesDatetxtDatePicker'), 
    '06/12/2021')

WebUI.sendKeys(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Repossess Date_ucdpRepossesDatetxtDatePicker'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/select_Select OneASTRIA JAKARTAASTRIA LAMPU_af45e3'), 
    '0001ASTRIAJKT01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/select_Select OneUnit Legal CaseUnit NormalUnit WO'), 
    'NORMAL', true)

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Asset Condition_txtAssetCond'), 
    'Good')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_License Owner_txtLicenseOwner'), 
    'Aji Kurniawan')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_License Expired Date_ucdpLicenseExpDa_f0c900'), 
    '10/10/2025')



WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/img_search_zipCode'))

WebUI.setText(findTestObject('COLLECTION/Repossession Collection Expense/field_kelurahan'), 
    '%pancoran%')

WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/btn_search'))

WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/btn_select_zipCode'))

WebUI.setText(findTestObject('COLLECTION/Repossession Collection Expense/field_license_plate'), 
    'B 123 SAQ')

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Yes_gvCheckListctl02rblAnswer'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Yes_gvCheckListctl03rblAnswer'))

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Checker_txtChecker'), 'Aji Kurniawan')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Checker Job Title_txtCheckerJob'), 
    'Collector')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/input_Check Date_ucdpCheckdatetxtDatePicker'), 
    '06/12/2021')

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/textarea_Notes_txtNotes'), 'notes')

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Collection Expense/a_Submit'))

WebUI.closeBrowser()

