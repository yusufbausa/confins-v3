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


WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Contact Information/a_Select'))


WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Name_txt_CustEmergencyContact_Name'), 
    'Patrick Two')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Contact Information/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 
    'JPEXEC', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Mobile Phone 1_ucContactInfotxt_CustE_bdd5b9'), 
    '08123456789')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_1373c0'), 
    '021')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_Phn1'), 
    '0812345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_ext._ucContactInfotxt_CustEmergencyCn_c74a74'), 
    '678')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_lb_Form_SaveCont_EmergencyContact'))
WebUI.delay(3)


WebUI.closeBrowser()

