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

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer/Test 1/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Customer/Test 1/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Object Repository/Customer/Test 1/Page_NEW CONFINS LOGIN PAGE/a_Select'))

WebUI.click(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_Small Medium Enterprise_rblCustModel'))

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_Customer Name_txtCustName'), 
    'Andira Twelve')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 
    'KTP', true)

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_ID Number_ucIdtxtCustIdNo'), 
    '97319287312936197')

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), 
    '10/10/2030')

WebUI.sendKeys(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_Female_rblCustGender'))

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input__txtBirthPlace'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input__ucBirthDatetxtDatePicker'), 
    '01/01/2008')

WebUI.sendKeys(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input__ucBirthDatetxtDatePicker'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_NPWP_txtNpwp'), '123456789')

WebUI.setText(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/input_Mother Maiden Name_txtMotherMaidenName'), 
    'Mother')

WebUI.click(findTestObject('Object Repository/Customer/Test 1/Page_New Confins 1 - Main/a_Next'))

WebUI.waitForElementVisible(findTestObject(null), 0)

