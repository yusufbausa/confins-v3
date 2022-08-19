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

WebUI.setText(findTestObject('Object Repository/FLEET/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'HMS1248')
WebUI.setEncryptedText(findTestObject('Object Repository/FLEET/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Select'))


//ADDING INSURANCE========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_gjahsdg26387424gj123_gvEntryInsctl02imbEdit'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'), 
    '235', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneGroupNon GroupRepeat Order'), 
    'NG', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneALL RISKTLO'), 'ALL RISK', 
    false)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Next'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Calculate'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Save'))
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_Next'))
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_SaveCont'))


//CLOSE BROWSER========================================================================================================================================================================
WebUI.closeBrowser()

