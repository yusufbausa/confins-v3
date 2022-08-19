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

WebUI.setText(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')

WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Select'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_New Application'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Add'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_-_lb_Form_SaveCont'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_b 6534 hgs_gvEntryInsctl02imbEdit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'), 
    '83', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneGroupNon GroupRepeat Order'), 
    'NG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneALL RISKTLO'), 'ALL RISK', 
    true)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_SRCC_cblAddCvgTypeName2'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Next'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Calculate'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Save'))

WebUI.click(findTestObject('FLEET/Insurance Data/Multi/button_edit_insurance_no_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'), 
    '83', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneGroupNon GroupRepeat Order'), 
    'NG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/Multi/select_Select OneALL RISKTLO'), 'ALL RISK', 
    true)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_SRCC_cblAddCvgTypeName2'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Next'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Calculate'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/a_Save'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_-_lb_Form_Next'))

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/Multi/input_-_lb_Form_SaveCont'))

WebUI.closeBrowser()

