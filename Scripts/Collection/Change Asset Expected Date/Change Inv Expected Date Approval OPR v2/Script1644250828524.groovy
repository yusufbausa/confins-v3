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

WebUI.setText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'AJW1423')

WebUI.setEncryptedText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/a_Select'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/a_Change Inventory Expected Date Approval'))

WebUI.setText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_b25f48'), 
    '2010834971')

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Value must be Date Format_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_AJW1423_gvTaskctl02ibProcess'))

WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/select_Select OneApproveReject'), 
    'Approve', true)

WebUI.setText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/textarea_Notes_txtNotes'), 
    'notes')

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/a_Submit'))

WebUI.setText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_b25f48'), 
    '2010834971')

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_Value must be Date Format_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/input_AJW1423_gvTaskctl02ibProcess'))

WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/select_Select OneApproveReject'), 
    'Approve', true)

WebUI.setText(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/textarea_Notes_txtNotes'), 
    'notes')

WebUI.click(findTestObject('Object Repository/COLLECTION/Change Asset Expected Date/Expected Date Approval OPR/a_Submit'))

WebUI.closeBrowser()

