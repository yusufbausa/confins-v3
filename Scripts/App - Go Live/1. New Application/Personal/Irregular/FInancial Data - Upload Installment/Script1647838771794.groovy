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


WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_fee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_fee'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_fee'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_fee'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'))
WebUI.uploadFile(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), fileUpload)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'))



WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_save_and_continue'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_save_and_continue'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_save_and_continue'))

